package edu.tum.cs.gaylebook.problems.deletenode;

import edu.tum.cs.essentials.linkedlist.Node;

//Implement an algorithm to delete a node in the middle of a singly linked list, given
//only access to that node.

//means there is no access to the head element of the linked list
public class App {

	public static void main(String[] args) {

		Node listIn = new Node(1);

		for (int i = 2; i <= 9; i++) {
			listIn.appendToTail(i);
		}

		int k = 3;
		boolean output = deleteNode(listIn);
		System.out.println(output);

	}

	private static boolean deleteNode(Node listIn) {
		// TODO Auto-generated method stub

		if (listIn == null || listIn.next == null)
			return false;

		listIn.next = listIn.next.next;
		listIn.data = listIn.next.data;
		return true;
	}
}
