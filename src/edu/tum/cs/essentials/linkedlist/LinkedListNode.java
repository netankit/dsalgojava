package edu.tum.cs.essentials.linkedlist;

//Sample Implementation for Single Linked List in Java
public class LinkedListNode {
	public LinkedListNode next;
	public int data;
	public Object dataObj;

	// initializing constructor.
	public LinkedListNode(int item) {
		data = item;
		next = null;
	}

	public LinkedListNode(Object item) {
		dataObj = item;
		next = null;
	}

	// Appending to the Tail of a linked list
	public void appendToTail(int d) {

		LinkedListNode end = new LinkedListNode(d);
		LinkedListNode n = this;
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}

	public LinkedListNode deleteNode(LinkedListNode head, int d) {
		LinkedListNode n = head;

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
