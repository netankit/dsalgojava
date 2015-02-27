package edu.tum.cs.gaylebook.problems.queuetwostacks;

import java.util.Stack;

//Implement a MyQueue class which implements a queue using two stacks.

public class MyQueue<T> {

	Stack<T> stackNew, stackOld;

	// Initialize the old and new stacks in the myqueue constuctor
	public MyQueue() {

		stackNew = new Stack<T>();
		stackOld = new Stack<T>();

	}

	// stackNew: holds the newest elements, i.e. the top of this stack holds the
	// most recent element added.
	// -----------
	// stackOld: holds the oldest elements, i.e. elements added the first are on
	// the top of this stack.
	// -----------

	// Enqueue -- push to the top of new stack
	public void add(T value) {
		stackNew.push(value);
	}

	// peek the top element of the old stack
	public T peek() {
		shiftStacks();
		return stackOld.peek();
	}

	// Dequeue -- pop out top element of the old stack
	public T remove() {
		shiftStacks();
		return stackOld.pop();
	}

	public int size() {
		return stackNew.size() + stackOld.size();
	}

	// A helper method which is used to shift stacks from the new stack to the
	// old stack whenever the old stack is empty
	// Use this method as a check to ensure that old stack always has the
	// current elements.
	private void shiftStacks() {
		if (stackOld.isEmpty()) {
			while (!stackNew.isEmpty()) {
				stackOld.push(stackNew.pop());
			}
		}
	}

}
