package edu.tum.cs.gaylebook.problems.binarytreetoll;

import java.util.ArrayList;
import java.util.LinkedList;

import edu.tum.cs.essentials.TreeNode;

//Implementation of the same problem using BFS.
public class Version2 {
	public static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(
			TreeNode root) {
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();

		/* "Visit" the root */
		LinkedList<TreeNode> current = new LinkedList<TreeNode>();
		if (root != null) {
			current.add(root);
		}

		while (current.size() > 0) {
			result.add(current); // Add previous level
			LinkedList<TreeNode> parents = current; // Go to next level
			current = new LinkedList<TreeNode>();
			for (TreeNode parent : parents) {
				/* Visit the children */
				if (parent.left != null) {
					current.add(parent.left);
				}
				if (parent.right != null) {
					current.add(parent.right);
				}
			}
		}

		return result;
	}
}
