import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;

import fr.istic.videoGen.AlternativesMedia;
import fr.istic.videoGen.MandatoryMedia;
import fr.istic.videoGen.Media;
import fr.istic.videoGen.MediaDescription;
import fr.istic.videoGen.OptionalMedia;
import fr.istic.videoGen.VideoGeneratorModel;

public class CalculateAllSize {
	
	public Map<MediaDescription, Long> generate(VideoGeneratorModel vgm) {
		return compile(vgm);
	}
	
	private Map<MediaDescription, Long> compile(VideoGeneratorModel vgm) {
		Map<MediaDescription, Long> hmSize = new HashMap<>();
		for(Media m : vgm.getMedias()) {
			this.compile(m, hmSize);
		}
		return hmSize;
	}
	
	private void compile(Media media, Map<MediaDescription, Long> hmSize) {
		if(media instanceof MandatoryMedia) {
			this.compile((MandatoryMedia) media, hmSize);
		} else if(media instanceof OptionalMedia) {
			this.compile((OptionalMedia) media, hmSize);
		} else if(media instanceof AlternativesMedia) {
			this.compile((AlternativesMedia) media, hmSize);
		}
	}
	
	private void compile(MandatoryMedia mm, Map<MediaDescription, Long> hmSize) {
		this.compile(mm.getDescription(), hmSize);
	}
	
	private void compile(MediaDescription md, Map<MediaDescription, Long> hmSize) {
		hmSize.put(md, Utils.getSize(new File(md.getLocation())));
	}
	
	private void compile(OptionalMedia om, Map<MediaDescription, Long> hmSize) {
		this.compile(om.getDescription(), hmSize);
	}
	
	private void compile(AlternativesMedia am, Map<MediaDescription, Long> hmSize) {
		for(MediaDescription md : am.getMedias()) {
			this.compile(md, hmSize);
		}
	}
	
	public static void main(String[] args) {
		VideoGenHelper helper = new VideoGenHelper();
		VideoGeneratorModel videoGen = helper.loadVideoGenerator(URI.createURI("example1.videogen"));
		
		List<String> headers = new GenerateHeaderCSV().generate(videoGen);
		
		headers.forEach(s -> System.out.println(s));
	}
}
