package edu.tum.cs.gaylebook.problems.stackwithmin;

import java.util.Stack;

/*
 * 
 * How would you design a stack which, in addition to push and pop, also has a
 * function minimum which returns the minimum element? Push, pop and minimum should 
 * all operate in 0(1) time.
 * 
 */

public class StackWithMin2 extends Stack<Integer> {

	private static final long serialVersionUID = 1L;
	Stack<Integer> s2;

	// S2 is a new stack which holds the minimum element
	public StackWithMin2() {
		s2 = new Stack<Integer>();
	}

	// On a simple push to the super stack, the s2 also gets populated when we
	// compare the current element with the current minimum element of the
	// stack; For this we invoke min() which performs a peek on the top element.
	public void push(int value) {
		if (value <= min()) {
			s2.push(value);
		}
		super.push(value);

	}

	@Override
	public Integer pop() {
		int value = super.pop();
		if (value == min()) {
			s2.pop();
		}
		return value;
	}

	public int min() {
		if (s2.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return s2.peek();
		}

	}
}
