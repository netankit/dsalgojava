package edu.tum.cs.gaylebook.problems.binarytreetoll;

import java.util.ArrayList;
import java.util.LinkedList;

import edu.tum.cs.essentials.TreeNode;

/* 
 * 
 * Given a binary tree, design an algorithm which creates a 
 * linked list of all the nodes at each depth (e.g., if you have
 * a tree with depth D, you'll have D linked lists).
 * 
 */

//Trick: Understand which level we are on. And thus we 
// can avoid a level order traversal.

/*
 * Implementing a simple modification of post order traversal 
 * where we pass in level +1 to the next recursive call. 
 * 
 * ==========
 * 
 * This code: Implementation below using DFS.
 * 
 */
public class App {
	void createLevelLinkedList(TreeNode root,
			ArrayList<LinkedList<TreeNode>> lists, int level) {
		if (root == null) {
			return;
		}

		LinkedList<TreeNode> list = null;

		if (lists.size() == level) {
			list = new LinkedList<TreeNode>();
			lists.add(list);
		} else {
			list = lists.get(level);
		}
		list.add(root);
		createLevelLinkedList(root.left, lists, level + 1);
		createLevelLinkedList(root.right, lists, level + 1);

	}

	ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root) {
		ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
		createLevelLinkedList(root, lists, 0);
		return lists;
	}
}
