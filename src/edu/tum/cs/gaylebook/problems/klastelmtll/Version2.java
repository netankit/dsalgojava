package edu.tum.cs.gaylebook.problems.klastelmtll;

import edu.tum.cs.essentials.linkedlist.LinkedListNode;

//Exploring an iterative solution
public class Version2 {
	public static void main(String[] args) {

		LinkedListNode listIn = new LinkedListNode(1);

		for (int i = 2; i <= 9; i++) {
			listIn.appendToTail(i);
		}

		int k = 3;
		LinkedListNode output = kthToLastElement(listIn, k);
		System.out.println(output.data);

	}

	private static LinkedListNode kthToLastElement(LinkedListNode listIn, int k) {
		if (k <= 0)
			return null;

		LinkedListNode head = listIn;
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;

		// move p2 forward k positions
		for (int i = 0; i < k - 1; i++) {
			if (p2 == null)
				return null;
			p2 = p2.next;
		}

		if (p2 == null)
			return null;

		// Moving p1 and p2 at the same speed.
		// when p2 at end, p1 will be our element.
		while (p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;

		}
		return p1;
	}
}
