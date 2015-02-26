package edu.tum.cs.essentials;

public class Queue {

	LinkedListNode first, last;

	void enqueue(Object item) {
		if (first == null) {
			last = new LinkedListNode(item);
			first = last;
		} else {
			last.next = new LinkedListNode(item);
			last = last.next;
		}

	}

	Object dequeue() {
		if (first != null) {
			Object temp = first.dataObj;
			first = first.next;
			return temp;
		}
		return null;
	}
}
