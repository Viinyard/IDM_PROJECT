import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;

import fr.istic.videoGen.AlternativesMedia;
import fr.istic.videoGen.MandatoryMedia;
import fr.istic.videoGen.Media;
import fr.istic.videoGen.MediaDescription;
import fr.istic.videoGen.OptionalMedia;
import fr.istic.videoGen.VideoDescription;
import fr.istic.videoGen.VideoGeneratorModel;

public class GenerateVignette {

	public List<File> generate(VideoGeneratorModel vgm) {
		return this.compile(vgm);
	}
	
	private List<File> compile(VideoGeneratorModel vgm) {
		List<File> vignettes = new ArrayList<>();
		for(Media m : vgm.getMedias()) {
			vignettes.addAll(this.compile(m));
		}
		
		return vignettes;
	}
	
	private List<File> compile(Media m) {
		List<File> vignettes = new ArrayList<>();
		if(m instanceof MandatoryMedia) {
			vignettes.addAll(this.compile((MandatoryMedia) m)); 
		} else if(m instanceof OptionalMedia) {
			vignettes.addAll(this.compile((OptionalMedia) m));
		} else if(m instanceof AlternativesMedia) {
			vignettes.addAll(this.compile((AlternativesMedia) m));
		}
		
		return vignettes;
	}
	
	private List<File> compile(MediaDescription md) {
		List<File> vignettes = new ArrayList<>();
		if(md instanceof VideoDescription) {
			vignettes.add(this.compile((VideoDescription) md));
		}
		
		return vignettes;
	}
	
	private List<File> compile(MandatoryMedia mm) {
		List<File> vignettes = new ArrayList<>();
		vignettes.addAll(this.compile(mm.getDescription()));
		return vignettes;
	}
	
	private List<File> compile(OptionalMedia om) {
		List<File> vignettes = new ArrayList<>();
		vignettes.addAll(this.compile(om.getDescription()));
		return vignettes;
	}
	
	private List<File> compile(AlternativesMedia am) {
		List<File> vignettes = new ArrayList<File>();
		for(MediaDescription m : am.getMedias()) {
			vignettes.addAll(this.compile(m));
		}
		return vignettes;
	}
	
	private File compile(VideoDescription vd) {
		try {
			return Utils.generateVignette(new File(vd.getLocation()), vd.getDuration() / 2);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		VideoGenHelper helper = new VideoGenHelper();
		VideoGeneratorModel videoGen = helper.loadVideoGenerator(URI.createURI("example1.videogen"));
		
		int nbVignettes = new GenerateVignette().generate(new CalculateDuration().generate(videoGen)).size();
	}
}
