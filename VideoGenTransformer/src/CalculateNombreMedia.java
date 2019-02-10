import org.eclipse.emf.common.util.URI;

import fr.istic.videoGen.AlternativesMedia;
import fr.istic.videoGen.ImageDescription;
import fr.istic.videoGen.MandatoryMedia;
import fr.istic.videoGen.Media;
import fr.istic.videoGen.MediaDescription;
import fr.istic.videoGen.OptionalMedia;
import fr.istic.videoGen.VideoDescription;
import fr.istic.videoGen.VideoGeneratorModel;

public class CalculateNombreMedia {
	
	public int generate(VideoGeneratorModel vgm) {
		return this.compile(vgm);
	}
	
	private int compile(VideoGeneratorModel vgm) {
		int cpt = 0;
		for(Media m : vgm.getMedias()) {
			cpt += this.compile(m);
		}
		return cpt;
	}
	
	private int compile(Media m) {
		if(m instanceof MandatoryMedia) {
			return this.compile((MandatoryMedia) m); 
		} else if(m instanceof OptionalMedia) {
			return this.compile((OptionalMedia) m);
		} else if(m instanceof AlternativesMedia) {
			return this.compile((AlternativesMedia) m);
		}
		return 0;
	}
	
	private int compile(MandatoryMedia mm) {
		return this.compile(mm.getDescription());
	}
	
	private int compile(MediaDescription md) {
		if(md instanceof VideoDescription) {
			return this.compile((VideoDescription) md);
		} else if(md instanceof ImageDescription) {
			return this.compile((ImageDescription) md);
		}
		return 0;
	}
	
	private int compile(ImageDescription id) {
		return 0;
	}
	
	private int compile(VideoDescription vd) {
		return 1;
	}
	
	private int compile(OptionalMedia om) {
		return this.compile(om.getDescription());
	}
	
	private int compile(AlternativesMedia am) {
		int cpt = 0;
		for(MediaDescription m : am.getMedias()) {
			cpt += this.compile(m);
		}
		return cpt;
	}
	
	public static void main(String[] args) {
		VideoGenHelper helper = new VideoGenHelper();
		VideoGeneratorModel videoGen = helper.loadVideoGenerator(URI.createURI("example1.videogen"));
		
		int nbMedia = new CalculateNombreMedia().generate(videoGen);
		System.out.println("Nombre de medias : " + nbMedia);
	}
}
