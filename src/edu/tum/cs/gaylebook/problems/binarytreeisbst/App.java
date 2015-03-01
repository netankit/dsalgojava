package edu.tum.cs.gaylebook.problems.binarytreeisbst;

import edu.tum.cs.essentials.TreeNode;

// Implement a function to check if a binary tree is a binary search tree.

//Solution: In-Order Traversal using array

public class App {
	// Assuming there are no duplicates in the BST.
	public static int index = 0;

	public static void copyBST(TreeNode root, int[] arr) {
		if (root == null) {
			return;
		}
		copyBST(root.left, arr);
		arr[index] = root.data;
		index++;
		copyBST(root.right, arr);
	}

	public static boolean checkBST(TreeNode root) {
		int[] arr = new int[root.size];
		copyBST(root, arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= arr[i - 1])
				return false;
		}
		return true;
	}
}
