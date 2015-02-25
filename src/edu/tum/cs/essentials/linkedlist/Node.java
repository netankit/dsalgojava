package edu.tum.cs.essentials.linkedlist;

//Sample Implementation for Single Linked List in Java
public class Node {
	public Node next;
	public int data;

	// initializing constructor.
	public Node(int d) {
		data = d;
		next = null;
	}

	// Appending to the Tail of a linked list
	public void appendToTail(int d) {

		Node end = new Node(d);
		Node n = this;
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}

	public Node deleteNode(Node head, int d) {
		Node n = head;

		if (n.data == d) {
			return head.next; /* moved head */
		}

		while (n.next != null) {
			if (n.next.data == d) {
				n.next = n.next.next;
				return head; /* head didn't change */
			}
			n = n.next;
		}
		return head;
	}
}
