import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.concurrent.TimeUnit;

public class Utils {

	public static File saveFile(File output, String content) {
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream(output), "utf-8"))) {
			writer.write(content);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return output;
	}
	
	public static double getDuration(File f) throws IOException, InterruptedException {
		
		Process p = Runtime.getRuntime().exec("/usr/local/Cellar/ffmpeg/4.0.2/bin/ffprobe -i " + f.getAbsolutePath() + " -show_format -v quiet");
		p.waitFor(4, TimeUnit.SECONDS);
		
		String line;

		{
			BufferedReader log = new BufferedReader(new InputStreamReader(p.getInputStream()));
			while((line=log.readLine()) != null){
				String[] split = line.split("=");
			    if("duration".equals(split[0])) {
			    	return Double.valueOf(split[1]);
			    }
			}
			log.close();
		}
		
		return 1;
	}
	
	public static long getSize(File f) {
		if(f.exists() && f.isFile()) {
			return f.length();
		}
		return -1;
	}
	
	public static File generateVignette(File f, double duration) throws IOException, InterruptedException {
		long mid = (long) (duration * 1000);
		
		//System.out.println("/usr/local/Cellar/ffmpeg/4.0.2/bin/ffmpeg -y -i " + f.getAbsolutePath() + " -r 1 -t 00:00:01 -ss " + String.format("%02d:%02d:%02d", mid / 3600_000, (mid % 3_600_000) / 60_000, mid % 60_000) + " -f image2 " + f.getParentFile().getAbsolutePath() + "/vignette/" + f.getName().substring(0, f.getName().lastIndexOf('.')) + ".png");
		
		Process p = Runtime.getRuntime().exec("/usr/local/Cellar/ffmpeg/4.0.2/bin/ffmpeg -y -i " + f.getAbsolutePath() + " -r 1 -t 00:00:01 -ss " + String.format("%02d:%02d:%02d", mid / 3600_000, (mid % 3_600_000) / 60_000, (mid % 60_000) / 1000) + " -f image2 " + f.getParentFile().getAbsolutePath() + "/vignette/" + f.getName().substring(0, f.getName().lastIndexOf('.')) + ".png");
		p.waitFor(120, TimeUnit.SECONDS);
		
		String line;
		
		{
			BufferedReader log = new BufferedReader(new InputStreamReader(p.getInputStream()));
			while((line=log.readLine()) != null){
				System.out.println(log);
			}
			log.close();
		}
		
		{
			BufferedReader error = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			while((line = error.readLine()) != null){
			    System.err.println(line);
			}
			error.close();
		}
		System.out.println(f);
		return f;
	}
	
	public static boolean ffmpegGenerate(File input, File output) throws IOException, InterruptedException {
		
		if(output.exists()) {
			output.delete();
		}
		
		Process p = Runtime.getRuntime().exec("/usr/local/Cellar/ffmpeg/4.0.2/bin/ffmpeg -f concat -i "+ input.getAbsolutePath() +" -c copy " + output.getAbsolutePath());
		boolean res = p.waitFor(10, TimeUnit.SECONDS);

		String line;

		{
			BufferedReader error = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			while((line = error.readLine()) != null){
			    System.err.println(line);
			}
			error.close();
		}

		{
			BufferedReader log = new BufferedReader(new InputStreamReader(p.getInputStream()));
			while((line=log.readLine()) != null){
			    System.out.println(line);
			}
			log.close();
		}

//		OutputStream outputStream = p.getOutputStream();
//		PrintStream printStream = new PrintStream(outputStream);
//		printStream.println();
//		printStream.flush();
//		printStream.close();
		
		return res;
	}
}
