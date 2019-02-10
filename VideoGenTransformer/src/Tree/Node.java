package Tree;

import java.util.ArrayList;
import java.util.List;

import fr.istic.videoGen.ImageDescription;
import fr.istic.videoGen.MediaDescription;
import fr.istic.videoGen.VideoDescription;

public class Node {
	
	private List<Node> childs;
	private Node parent = null;
	private MediaDescription md;
	
	public Node(MediaDescription md) {
		this.md = md;
		this.childs = new ArrayList<>();
	}
	
	public Node getParent() {
		return this.parent;
	}
	
	public String getId() {
		if(this.md instanceof VideoDescription) {
			return ((VideoDescription) this.md).getVideoid();
		} else if(this.md instanceof ImageDescription) {
			return ((ImageDescription) this.md).getImageid();
		}
		return "NaN";
	}
	
	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	public MediaDescription getMediaDescription() {
		return this.md;
	}
	
	public void addChild(Node node) {
		node.setParent(this);
		this.childs.add(node);
	}
	
	public List<Node> getChilds() {
		return this.childs;
	}

}
