package net.ostres.tools.java;

import java.util.Hashtable;

public class Graph {
	private final Hashtable<String, GraphNode> hTable = new Hashtable<String,GraphNode>();
	
	public Graph() {
		
	}
	
	public void addNode(String _srcClass, String _srcMethod, String _dstClass, String _dstMethod) {
		if (hTable.containsKey(_srcClass)) {
		// More likely to happen -> optimization
			GraphNode temp = hTable.get(_srcClass + "::" + _srcMethod);
			while(temp.hasNextNode()) {
				temp = temp.getNextNode();
			}
			temp.setNextNode(new GraphNode(_dstClass,_dstMethod));	
		} else {
			hTable.put(_srcClass + "::" + _srcMethod , new GraphNode(_dstClass,_dstMethod));
		}
	}
}
