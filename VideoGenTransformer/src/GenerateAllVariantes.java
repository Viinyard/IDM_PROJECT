import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;

import Tree.Node;
import fr.istic.videoGen.AlternativesMedia;
import fr.istic.videoGen.MandatoryMedia;
import fr.istic.videoGen.Media;
import fr.istic.videoGen.MediaDescription;
import fr.istic.videoGen.OptionalMedia;
import fr.istic.videoGen.VideoGeneratorModel;

public class GenerateAllVariantes {
	
	public List<Node> generate(VideoGeneratorModel vgm) {
		return toVarianteList(this.compile(vgm));
	}
	
	private List<Node> toVarianteList(Node root) {
		List<Node> variantes = new ArrayList<Node>();
		
		this.visit(root, variantes);
		
		return variantes;
	}
	
	private void visit(Node node, List<Node> variantes) {
		if(node.getChilds().isEmpty()) {
			variantes.add(node);
		}
		for(Node n : node.getChilds()) {
			this.visit(n, variantes);
		}
	}
	
	private Node compile(VideoGeneratorModel vgm) {
		Node node = new Node(null);
		List<Node> ln = new ArrayList<>();
		ln.add(node);
		for(Media m : vgm.getMedias()) {
			List<Node> lnTmp = new ArrayList<>();
			lnTmp.addAll(ln);
			ln.clear();
			for(Node n : lnTmp) {
				ln.addAll(this.compile(n, m));
			}
			
		}
		
		return node;
	}
	
	private List<Node> compile(Node node, Media media) {
		List<Node> nodes = new ArrayList<>();
		if(media instanceof MandatoryMedia) {
			Node n = this.compile((MandatoryMedia) media);
			node.addChild(n);
			nodes.add(n);
		} else if(media instanceof OptionalMedia) {
			Node n = this.compile((OptionalMedia) media);
			node.addChild(n);
			nodes.add(n);
			nodes.add(node);
		} else if(media instanceof AlternativesMedia) {
			List<Node> ln = this.compile((AlternativesMedia) media);
			for(Node n : ln) {
				node.addChild(n);
				nodes.add(n);
			}
		}
		
		return nodes;
	}
	
	private Node compile(MandatoryMedia mm) {
		return this.compile(mm.getDescription());
	}
	
	private Node compile(MediaDescription md) {
		return new Node(md);
	}
	
	
	private Node compile(OptionalMedia om) {
		return new Node(om.getDescription());
	}
	
	private List<Node> compile(AlternativesMedia am) {
		List<Node> nodes = new ArrayList<>();
		for(MediaDescription m : am.getMedias()) {
			nodes.add(new Node(m));
		}
		return nodes;
	}
	
	
	
	public static void main(String[] args) {
		VideoGenHelper helper = new VideoGenHelper();
		VideoGeneratorModel videoGen = helper.loadVideoGenerator(URI.createURI("example2.videogen"));
		
		//helper.saveVideoGenerator(URI.createURI("example2.videogen"), videoGen);
		
		List<Node> lVariantes = new GenerateAllVariantes().generate(videoGen);
		System.out.println(lVariantes.size());
		
	}

}
