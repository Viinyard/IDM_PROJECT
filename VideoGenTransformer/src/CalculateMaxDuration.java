import java.time.Duration;

import org.eclipse.emf.common.util.URI;

import fr.istic.videoGen.AlternativesMedia;
import fr.istic.videoGen.MandatoryMedia;
import fr.istic.videoGen.Media;
import fr.istic.videoGen.MediaDescription;
import fr.istic.videoGen.OptionalMedia;
import fr.istic.videoGen.VideoDescription;
import fr.istic.videoGen.VideoGeneratorModel;

public class CalculateMaxDuration {

	public double generate(VideoGeneratorModel vgm) {
		return this.compile(vgm);
	}
	
	private double compile(VideoGeneratorModel vgm) {
		double duration = 0d;
		for(Media m : vgm.getMedias()) {
			duration += this.compile(m);
		}
		return duration;
	}
	
	private double compile(Media m) {
		if(m instanceof MandatoryMedia) {
			return this.compile((MandatoryMedia) m); 
		} else if(m instanceof OptionalMedia) {
			return this.compile((OptionalMedia) m);
		} else if(m instanceof AlternativesMedia) {
			return this.compile((AlternativesMedia) m);
		}
		return 0d;
	}
	
	private double compile(MediaDescription md) {
		if(md instanceof VideoDescription) {
			return this.compile((VideoDescription) md);
		}
		return 0d;
	}
	
	private double compile(MandatoryMedia mm) {
		return this.compile(mm.getDescription());
	}
	
	private double compile(OptionalMedia om) {
		return this.compile(om.getDescription());
	}
	
	private double compile(AlternativesMedia am) {
		double duration = 0d;
		for(MediaDescription m : am.getMedias()) {
			duration = Math.max(duration, this.compile(m));
		}
		return duration;
	}
	
	private double compile(VideoDescription vd) {
		return vd.getDuration();
	}
	
	public static void main(String[] args) {
		VideoGenHelper helper = new VideoGenHelper();
		VideoGeneratorModel videoGen = helper.loadVideoGenerator(URI.createURI("example1.videogen"));
		
		double maxDuration = new CalculateMaxDuration().generate(new CalculateDuration().generate(videoGen));
		System.out.println("Max duration is : " + Duration.ofMillis((long) (maxDuration * 1000)));
		//helper.saveVideoGenerator(URI.createURI("example1_with_duration.videogen"), videoGen);
		
	}
}
