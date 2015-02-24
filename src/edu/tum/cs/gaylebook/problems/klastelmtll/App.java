package edu.tum.cs.gaylebook.problems.klastelmtll;

import edu.tum.cs.essentials.linkedlist.Node;

// Implement an algorithm to find the kth to last element of a singly linked list.
public class App {

	public static void main(String[] args) {

		Node listIn = new Node(1);

		for (int i = 2; i <= 9; i++) {
			listIn.appendToTail(i);
		}

		int k = 3;
		int output = kthToLastElement(listIn, k);
		// System.out.println(output);
	}

	private static int kthToLastElement(Node listIn, int k) {
		// TODO Auto-generated method stub

		Node head = listIn;

		if (head == null) {
			return 0;
		}

		int i = kthToLastElement(head.next, k) + 1;
		if (i == k) {
			System.out.println(head.data);
		}
		return i;

	}
}
