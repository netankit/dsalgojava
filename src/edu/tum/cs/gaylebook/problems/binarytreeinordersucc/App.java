package edu.tum.cs.gaylebook.problems.binarytreeinordersucc;

import edu.tum.cs.essentials.TreeNode;

/*
 * Write an algorithm to find the 'next'node (i.e., in-order successor) 
 * of a given node in a binary search tree. You may assume that each 
 * node has a link to its parent
 * */

public class App {
	TreeNode inorderSucc(TreeNode n) {

		if (n == null)
			return null;
		// if the node has a right subtree. Return the left most node of the
		// right subtree
		if (n.right != null) {
			return leftMostChild(n.right);
		} else {
			TreeNode q = n;
			TreeNode x = q.parent;

			// Go up until we are on left instead of right
			while (x != null && x.left != q) {
				q = x;
				x = x.parent;
			}
			return x;
		}

	}

	private TreeNode leftMostChild(TreeNode n) {
		// TODO Auto-generated method stub
		if (n == null)
			return null;
		while (n.left != null) {
			n = n.left;
		}
		return n;

	}
}
