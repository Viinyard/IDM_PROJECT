import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;

import fr.istic.videoGen.AlternativesMedia;
import fr.istic.videoGen.ImageDescription;
import fr.istic.videoGen.MandatoryMedia;
import fr.istic.videoGen.Media;
import fr.istic.videoGen.MediaDescription;
import fr.istic.videoGen.OptionalMedia;
import fr.istic.videoGen.VideoDescription;
import fr.istic.videoGen.VideoGeneratorModel;

public class GenerateHeaderCSV {
	
	public List<String> generate(VideoGeneratorModel vgm) {
		return compile(vgm);
	}
	
	private List<String> compile(VideoGeneratorModel vgm) {
		List<String> headers = new ArrayList<String>();
		
		for(Media m : vgm.getMedias()) {
			headers.addAll(this.compile(m));
		}
		
		return headers;
	}
	
	private List<String> compile(Media media) {
		List<String> headers = new ArrayList<>();
		if(media instanceof MandatoryMedia) {
			headers.addAll(this.compile((MandatoryMedia) media));
		} else if(media instanceof OptionalMedia) {
			headers.addAll(this.compile((OptionalMedia) media));
		} else if(media instanceof AlternativesMedia) {
			headers.addAll(this.compile((AlternativesMedia) media));
		}
		
		return headers;
	}
	
	private List<String> compile(MandatoryMedia mm) {
		return this.compile(mm.getDescription());
	}
	
	private List<String> compile(MediaDescription md) {
		List<String> headers = new ArrayList<>();
		if(md instanceof VideoDescription) {
			headers.add(this.compile((VideoDescription) md));
		} else if(md instanceof ImageDescription) {
			headers.add(this.compile((ImageDescription) md));
		}
		return headers;
	}
	
	private String compile(VideoDescription vd) {
		return vd.getVideoid();
	}
	
	private String compile(ImageDescription id) {
		return id.getImageid();
	}
	
	private List<String> compile(OptionalMedia om) {
		return this.compile(om.getDescription());
	}
	
	private List<String> compile(AlternativesMedia am) {
		List<String> headers = new ArrayList<>();
		for(MediaDescription md : am.getMedias()) {
			headers.addAll(this.compile(md));
		}
		return headers;
	}
	
	public static void main(String[] args) {
		VideoGenHelper helper = new VideoGenHelper();
		VideoGeneratorModel videoGen = helper.loadVideoGenerator(URI.createURI("example1.videogen"));
		
		List<String> headers = new GenerateHeaderCSV().generate(videoGen);
		
		headers.forEach(s -> System.out.println(s));
	}	
}
