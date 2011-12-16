package net.ostres.tools.java;

public class GraphNode {
	private GraphNode next = null;
	private String className = null;
	private String methodName = null;
	
	public GraphNode(String _class, String _method) {
		this.className = _class;
		this.methodName = _method;
		this.next = null;
	}
	
	public GraphNode getNextNode() {
		return next;
	}
	
	public void setNextNode(GraphNode _newNode) {
		this.next = _newNode;
	}
	
	public boolean hasNextNode() {
		return (next != null);
	}
	
	public String toString() {
		return (this.className + "::" + this.methodName);
	}
}
