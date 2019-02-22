import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;

import Tree.Node;
import fr.istic.videoGen.MediaDescription;
import fr.istic.videoGen.VideoGeneratorModel;

public class GenerateCSVData {
	
	public File generate(VideoGeneratorModel vgm, File f) {
		List<String> headers = new GenerateHeaderCSV().generate(vgm);
		List<Node> lVariantes = new GenerateAllVariantes().generate(vgm);
		Map<MediaDescription, Long> hmSize = new CalculateAllSize().generate(vgm);
		
		HashMap<String, Integer> hmIndex = new HashMap<>();
		
		StringBuilder csv = new StringBuilder();
		csv.append("id;");
		{
			int index = 0;
			for(String s : headers) {
				hmIndex.put(s, index);
				csv.append(s+";");
				index++;
			}
		}
		csv.append("size;");
		csv.append("\n");
		
		{
			int index = 1;
			for(Node n : lVariantes) {
				boolean[] v = new boolean[headers.size()];
				Node root = n;
				long size = 0;
				while(root.getParent() != null) {
					if(hmIndex.get(root.getId()) != null) {
						v[hmIndex.get(root.getId())] = true;
						size += hmSize.get(root.getMediaDescription());
					}
					
					root = root.getParent();
				}
				csv.append(index + ";");
				for(boolean b : v) {
					csv.append(b + ";");
				}
				csv.append(size+";");
				csv.append("\n");
				index++;
			}
		}
		
		Utils.saveFile(f, csv.toString());
		
		return f;
	}
	
	
	public static void main(String[] args) {
		VideoGenHelper helper = new VideoGenHelper();
		VideoGeneratorModel videoGen = helper.loadVideoGenerator(URI.createURI("example3.videogen"));
		new GenerateCSVData().generate(videoGen, new File("stats.csv"));
	}

}
