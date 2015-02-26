package edu.tum.cs.essentials;

public class Stack {

	LinkedListNode top;

	Object pop() {
		if (top != null) {
			Object item = top.dataObj;
			top = top.next;
			return item;
		}
		return null;
	}

	public void push(Object item) {
		LinkedListNode t = new LinkedListNode(item);
		if (top != null) {
			t.next = top;
			top = t;
		} else {
			top = t;
		}
	}

	Object peek() {
		return top.dataObj;
	}
}
