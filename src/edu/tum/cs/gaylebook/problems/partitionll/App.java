package edu.tum.cs.gaylebook.problems.partitionll;

import edu.tum.cs.essentials.linkedlist.LinkedListNode;

// Write code to partition a linked list around a value x, such that all
// nodes less than come before all nodes greater than or equal to x.

public class App {

	public static void main(String[] args) {

		LinkedListNode listIn = new LinkedListNode(1);

		listIn.appendToTail(7);
		listIn.appendToTail(8);
		listIn.appendToTail(3);
		listIn.appendToTail(4);
		listIn.appendToTail(10);
		listIn.appendToTail(2);
		listIn.appendToTail(5);
		listIn.appendToTail(6);

		while (listIn.next != null) {
			System.out.print(listIn.data + " ");
			listIn = listIn.next;
		}

		int x = 4;
		LinkedListNode output = partition(listIn, x);
		System.out.println("Output: ");
		while (output.next != null) {
			System.out.print(output.data + " ");
			output = output.next;
		}

	}

	private static LinkedListNode partition(LinkedListNode listIn, int x) {
		// TODO Auto-generated method stub

		LinkedListNode beforeStart = null;
		LinkedListNode afterStart = null;

		while (listIn != null) {
			LinkedListNode next = listIn.next;
			if (listIn.data < x) {
				listIn.next = beforeStart;
				beforeStart = listIn;
			} else {
				listIn.next = afterStart;
				afterStart = listIn;
			}
			listIn = next;
		}

		// Merge Before and After list

		if (beforeStart == null) {
			return afterStart;
		}

		LinkedListNode head = beforeStart;

		while (beforeStart.next != null) {
			beforeStart = beforeStart.next;
		}

		beforeStart.next = afterStart;

		return head;
	}
}
