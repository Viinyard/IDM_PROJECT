import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;

import fr.istic.videoGen.AlternativesMedia;
import fr.istic.videoGen.MandatoryMedia;
import fr.istic.videoGen.Media;
import fr.istic.videoGen.MediaDescription;
import fr.istic.videoGen.OptionalMedia;
import fr.istic.videoGen.VideoDescription;
import fr.istic.videoGen.VideoGeneratorModel;

public class CalculateDuration {
	
	public VideoGeneratorModel generate(VideoGeneratorModel vgm) {
		this.compile(vgm);
		return vgm;
	}
	
	private void compile(VideoGeneratorModel vgm) {
		for(Media m : vgm.getMedias()) {
			this.compile(m);
		}
	}
	
	private void compile(Media m) {
		if(m instanceof MandatoryMedia) {
			this.compile((MandatoryMedia) m); 
		} else if(m instanceof OptionalMedia) {
			this.compile((OptionalMedia) m);
		} else if(m instanceof AlternativesMedia) {
			this.compile((AlternativesMedia) m);
		}
	}
	
	private void compile(MediaDescription md) {
		if(md instanceof VideoDescription) {
			this.compile((VideoDescription) md);
		}
	}
	
	private void compile(MandatoryMedia mm) {
		this.compile(mm.getDescription());
	}
	
	private void compile(OptionalMedia om) {
		this.compile(om.getDescription());
	}
	
	private void compile(AlternativesMedia am) {
		for(MediaDescription m : am.getMedias()) {
			this.compile(m);
		}
	}
	
	private void compile(VideoDescription vd) {
		try {
			vd.setDuration(Utils.getDuration(new File(vd.getLocation())));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		VideoGenHelper helper = new VideoGenHelper();
		VideoGeneratorModel videoGen = helper.loadVideoGenerator(URI.createURI("example1.videogen"));
		
		new CalculateDuration().generate(videoGen);
		
		helper.saveVideoGenerator(URI.createURI("example1_with_duration.videogen"), videoGen);
		
	}

}
