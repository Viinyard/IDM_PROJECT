import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;

import fr.istic.videoGen.VideoGeneratorModel;

public class Generer10Alea {

	public static void main(String[] args) {
		VideoGenHelper helper = new VideoGenHelper();
		VideoGeneratorModel videoGen = helper.loadVideoGenerator(URI.createURI(args[0]));
		
		//helper.saveVideoGenerator(URI.createURI("example2.videogen"), videoGen);
		
		try {
			Utils.ffmpegGenerate(Utils.saveFile(new File(args[0]+"erated"), new FFmpegGenerator().generate(videoGen)), new File("output.mov"));
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
