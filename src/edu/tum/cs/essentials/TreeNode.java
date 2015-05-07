package edu.tum.cs.essentials;
// Tree Node
public class TreeNode {
	public TreeNode(int i) {
		// TODO Auto-generated constructor stub
		value = i;
	}

	public int value;
	public TreeNode left;
	public TreeNode right;

	// parent link is added here for the inorder successor problem only.
	public TreeNode parent;
	public int data;

	// @size: gives the size of the tree.
	public int size;

}
