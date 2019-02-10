import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;

import fr.istic.videoGen.AlternativesMedia;
import fr.istic.videoGen.MandatoryMedia;
import fr.istic.videoGen.Media;
import fr.istic.videoGen.MediaDescription;
import fr.istic.videoGen.OptionalMedia;
import fr.istic.videoGen.VideoDescription;
import fr.istic.videoGen.VideoGenInformation;
import fr.istic.videoGen.VideoGeneratorModel;

public class FFmpegGenerator {
	
	public String generate(VideoGeneratorModel vgm) {
		return compile(vgm);
	}
	
	private String compile(VideoGeneratorModel vgm) {
		StringBuilder sb = new StringBuilder();
		if(vgm.getInformation() != null) {
			sb.append(this.compile(vgm.getInformation()));
		}
		
		for(Media m : vgm.getMedias()) {
			sb.append(this.compile(m));
		}
		
		return sb.toString();
	}
	
	private String compile(Media media) {
		if(media instanceof MandatoryMedia) {
			return this.compile((MandatoryMedia) media);
		} else if(media instanceof OptionalMedia) {
			return this.compile((OptionalMedia) media);
		} else if(media instanceof AlternativesMedia) {
			return this.compile((AlternativesMedia) media);
		}
		
		return "";
	}
	
	private String compile(MandatoryMedia mm) {
		return this.compile(mm.getDescription());
	}
	
	private String compile(MediaDescription d) {
		return "file '" + d.getLocation() + "'\n";
	}
	
	private String compile(OptionalMedia om) {
		StringBuilder sb = new StringBuilder();
		
		if(om.getDescription() instanceof VideoDescription) {
			VideoDescription vd = (VideoDescription) om.getDescription();
			double percent = vd.getProbability() != null ? vd.getProbability() : 50;
			if(Math.random() * 100 < percent) {
				sb.append(this.compile(vd));
			}
		}
		
		return sb.toString();
	}
	
	private String compile(AlternativesMedia am) {
		double prob[] = new double[am.getMedias().size()];
		double totalProb = 0d;
		{
			int i = 0;
			for(MediaDescription m : am.getMedias()) {
				if(m instanceof VideoDescription) {
					VideoDescription vd = (VideoDescription) m;
					totalProb += (vd.getProbability() != null ? vd.getProbability() : 100d / am.getMedias().size());
					prob[i] = totalProb;
				}
				i++;
			}
		}
		
		double rnd = Math.random() * totalProb;
		
		for(int i = 0; i < prob.length; i++) {
			if(rnd < prob[i]) {
				return this.compile(am.getMedias().get(i));
			}
		}
		
		return "";
	}
	
	private String compile(VideoGenInformation vgi) {
		StringBuilder sb = new StringBuilder();
		
		if(vgi.getAuthorName() != null && !vgi.getAuthorName().isEmpty()) {
			sb.append("# author : " + vgi.getAuthorName() + "\n");
		}
		
		if(vgi.getVersion() != null && !vgi.getVersion().isEmpty()) {
			sb.append("# version : " + vgi.getVersion() + "\n");
		}
		
		if(vgi.getCreationDate() != null && !vgi.getVersion().isEmpty()) {
			sb.append("# date : " + vgi.getCreationDate() + "\n");
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		VideoGenHelper helper = new VideoGenHelper();
		VideoGeneratorModel videoGen = helper.loadVideoGenerator(URI.createURI("example1.videogen"));
		
		//helper.saveVideoGenerator(URI.createURI("example2.videogen"), videoGen);
		
		try {
			Utils.ffmpegGenerate(Utils.saveFile(new File("exemple1.videogenerated"), new FFmpegGenerator().generate(videoGen)), new File("output.mov"));
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}	
	
}
