import org.eclipse.emf.common.util.URI;

import fr.istic.videoGen.AlternativesMedia;
import fr.istic.videoGen.MandatoryMedia;
import fr.istic.videoGen.Media;
import fr.istic.videoGen.OptionalMedia;
import fr.istic.videoGen.VideoGeneratorModel;

public class CalculateNombreVariantes {
	
	public int generate(VideoGeneratorModel vgm) {
		return this.compile(vgm);
	}
	
	private int compile(VideoGeneratorModel vgm) {
		int nbVariantes = 1;
		for(Media m : vgm.getMedias()) {
			nbVariantes *= this.compile(m);
		}
		return nbVariantes;
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
		return 1;
	}
	
	private int compile(OptionalMedia om) {
		return 2;
	}
	
	private int compile(AlternativesMedia am) {
		return am.getMedias().size();
	}
	
	public static void main(String[] args) {
		VideoGenHelper helper = new VideoGenHelper();
		VideoGeneratorModel videoGen = helper.loadVideoGenerator(URI.createURI("example1.videogen"));
		
		int nbVariantes = new CalculateNombreVariantes().generate(videoGen);
		System.out.println("Nombre de variantes : " + nbVariantes);
	}
}
