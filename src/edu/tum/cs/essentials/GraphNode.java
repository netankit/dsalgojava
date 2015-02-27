package edu.tum.cs.essentials;

public class GraphNode {
	int value;
	GraphNode next;
	GraphNode[] neighbours;
	boolean visited;

	public GraphNode(int val) {
		// TODO Auto-generated constructor stub
		value = val;
	}

	public GraphNode(int val, GraphNode[] n) {
		// TODO Auto-generated constructor stub
		value = val;
		neighbours = n;
	}

	@Override
	public String toString() {
		return "Value: " + this.value;
	}
}
