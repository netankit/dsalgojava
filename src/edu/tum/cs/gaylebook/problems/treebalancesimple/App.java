package edu.tum.cs.gaylebook.problems.treebalancesimple;

import edu.tum.cs.essentials.TreeNode;

/*

 Implement a function to check if a binary tree is balanced. For the purposes of this
 question, a balanced tree is defined to be a tree such that the heights of the two
 subtrees of any node never differ by more than one.
 Time: O(N)
 Space: O(H); H is the height of the tree
 */
public class App {
	public static int checkHeight(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftHeight = checkHeight(root.left);
		if (leftHeight == -1) {
			return -1;
		}
		int rightHeight = checkHeight(root.right);
		if (rightHeight == -1) {
			return -1;
		}

		int heightDiff = leftHeight - rightHeight;
		if (Math.abs(heightDiff) > 1) {
			return -1;
		} else {
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}

	public static boolean isBalanced(TreeNode root) {
		if (checkHeight(root) == -1) {
			return false;
		} else {
			return true;
		}
	}
}
