package edu.tum.cs.gaylebook.problems.binarytreeisbst;

import edu.tum.cs.essentials.TreeNode;

//Implement a function to check if a binary tree is a binary search tree.

//Solution: Min-Max Solution
public class Version3 {

	boolean checkBST(TreeNode n) {
		return checkBST(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	boolean checkBST(TreeNode n, int min, int max) {
		if (n == null)
			return true;

		if (n.data <= min || n.data > max) {
			return false;
		}

		if (!checkBST(n.left, min, n.data) || !checkBST(n.right, n.data, max)) {
			return false;
		}
		return true;

	}
}
