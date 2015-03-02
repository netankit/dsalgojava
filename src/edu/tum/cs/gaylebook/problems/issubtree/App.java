package edu.tum.cs.gaylebook.problems.issubtree;

import edu.tum.cs.essentials.TreeNode;

/*
 * You have two very large binary trees: T1, with millions of nodes, and T2, with
 hundreds of nodes. Create an algorithm to decide if T2 is a subtree of T1.
 A tree T2 is a subtree of T1 if there exists a node n in T1 such that the subtree of n
 is identical to T2. That is, if you cut off the tree at node n, the two trees would be
 identical.
 */

// Approach: Search through the larger tree, T1. Each time a node in T1 matches 
// the root of T2, call treeMatch. The treeMatch method will compare the two 
// subtrees to see if they are identical.

public class App {
	boolean containsTree(TreeNode t1, TreeNode t2) {
		if (t2 == null)
			return true;
		return subtree(t1, t2);
	}

	private boolean subtree(TreeNode r1, TreeNode r2) {
		if (r1 == null)
			return false;

		if (r1.data == r2.data) {
			if (matchTree(r1, r2))
				return true;
		}
		return subtree(r1.left, r2);
	}

	boolean matchTree(TreeNode r1, TreeNode r2) {
		if (r2 == null && r1 == null)
			return true;

		if (r1 == null || r2 == null)
			return false;
		if (r1.data != r2.data)
			return false;
		return (matchTree(r1.left, r2.left) && matchTree(r1.right, r2.right));

	}
}
