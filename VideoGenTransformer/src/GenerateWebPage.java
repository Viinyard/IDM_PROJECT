import java.io.File;

import org.eclipse.emf.common.util.URI;

import fr.istic.videoGen.AlternativesMedia;
import fr.istic.videoGen.MandatoryMedia;
import fr.istic.videoGen.Media;
import fr.istic.videoGen.MediaDescription;
import fr.istic.videoGen.OptionalMedia;
import fr.istic.videoGen.VideoDescription;
import fr.istic.videoGen.VideoGeneratorModel;

public class GenerateWebPage {

	public String generate(VideoGeneratorModel vgm) {
		StringBuilder sb = new StringBuilder();
		sb.append("<html>\n" + 
				"<head>\n" + 
				"<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n" +
				"</head>\n" + 
				"<body>");
		sb.append(this.compile(vgm));
		sb.append("</body>\n" + 
				"</html>");
		
		return sb.toString();
	}
	
	private String compile(VideoGeneratorModel vgm) {
		StringBuilder sb = new StringBuilder();
		sb.append("<form name=\"builder\" action=\"\" method=\"post\" class=\"wpcf7-form\">");
		for(Media m : vgm.getMedias()) {
			sb.append(this.compile(m));
		}
		sb.append("</form>");
		return sb.toString();
	}
	
	private String compile(Media m) {
		StringBuilder sb = new StringBuilder();
		sb.append("<div class=\"section group\">");
		if(m instanceof MandatoryMedia) {
			sb.append(this.compile((MandatoryMedia) m)); 
		} else if(m instanceof OptionalMedia) {
			sb.append(this.compile((OptionalMedia) m));
		} else if(m instanceof AlternativesMedia) {
			sb.append(this.compile((AlternativesMedia) m));
		}
		sb.append("</div>");
		return sb.toString();
	}
	
	private String compile(MediaDescription md) {
		
		if(md instanceof VideoDescription) {
			return this.compile((VideoDescription) md);
		}
		return "";
	}
	
	private String compile(MandatoryMedia mm) {
		return "";
	}
	
	private String compile(OptionalMedia om) {
		StringBuilder sb = new StringBuilder();
		sb.append("<fieldset>\n");
		sb.append("<legend>Optional Media</legend>");
		sb.append("<div class=\"col span_1_of_4\">\n" + 
				"<label class=\"checkbox-img\">\n" + 
				"  <input type=\"checkbox\" name=\"color\"> ");
		sb.append(this.compile(om.getDescription()));
		sb.append("</label>\n" + 
				"  </div>\n");
		sb.append("</fieldset>\n");
		return sb.toString();
	}
	
	private String compile(AlternativesMedia am) {
		StringBuilder sb = new StringBuilder();
		sb.append("<fieldset id="+am.getId()+">\n");
		sb.append("<legend>Alternative Media</legend>");
		for(MediaDescription m : am.getMedias()) {
			sb.append("<div class=\"col span_1_of_4\">\n" + 
					"<label class=\"checkbox-img\">\n" + 
					"  <input type=\"radio\" name=\""+am.getId()+"\"> ");
			sb.append(this.compile(m));
			sb.append("</label>\n" + 
					"  </div>");
		}
		sb.append("</fieldset>\n");
		return sb.toString();
	}
	
	private String compile(VideoDescription vd) {
		File video = new File(vd.getLocation());
		File vignette = new File(video.getParentFile().getAbsolutePath() + "/vignette/" + video.getName().substring(0, video.getName().lastIndexOf('.')) + ".png");
		
		return  "<img src=\"video/vignette/" + vignette.getName() + "\" alt=\"" + vd.getText() + "\" />\n";
	}
	
	public static void main(String[] args) {
		VideoGenHelper helper = new VideoGenHelper();
		VideoGeneratorModel videoGen = helper.loadVideoGenerator(URI.createURI("example1.videogen"));
		
		//new GenerateVignette().generate(new CalculateDuration().generate(videoGen));
		new GenerateWebPage().generate(videoGen);
		
		Utils.saveFile(new File("index.html"), new GenerateWebPage().generate(videoGen));
	}
}
