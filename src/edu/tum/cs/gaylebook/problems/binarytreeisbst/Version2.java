package edu.tum.cs.gaylebook.problems.binarytreeisbst;

import edu.tum.cs.essentials.TreeNode;

//Implement a function to check if a binary tree is a binary search tree.

//Solution: Without using array

public class Version2 {
	public static int last_printed = Integer.MIN_VALUE;

	public static boolean checkBST(TreeNode n) {

		if (n == null) {
			return true;
		}
		// check / recurse left
		if (!checkBST(n.left))
			return false;

		// check current
		if (n.data <= last_printed)
			return false;
		last_printed = n.data;

		// check / recurse right
		if (!checkBST(n.right))
			return false;

		return true;
	}

}
