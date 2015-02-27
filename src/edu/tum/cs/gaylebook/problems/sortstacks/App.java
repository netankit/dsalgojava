package edu.tum.cs.gaylebook.problems.sortstacks;

import java.util.Stack;

//Stack Sorting
/*
 * 
 Write a program to sort a stack in ascending order (with biggest items on top).
 You may use at most one additional stack to hold items, but you may not copy the
 elements into any other data structure (such as an array). The stack supports the
 following operations: push, pop, peek, and isEmpty.
 *
 */
// 
// 1 9 3 2 7 2 8 5 <-- TOS
// 
//

// Trick: Use a temp variable to store the value of the recently popped element
// from the unsorted stack and then push back from the sorted stack to the old 
// stack later place the item in temp variable at correct position in the sorted stack.

public class App {
	public static void main(String[] args) {

		Stack<Integer> stk = new Stack<Integer>();
		Stack<Integer> stkOut;
		stk.push(1);
		stk.push(9);
		stk.push(3);
		stk.push(2);
		stk.push(7);
		stk.push(2);
		stk.push(8);
		stk.push(5);

		stkOut = sort(stk);
		System.out.println();
		while (!stkOut.isEmpty()) {
			System.out.println(stkOut.pop());
		}
	}

	public static Stack<Integer> sort(Stack<Integer> s) {

		Stack<Integer> r = new Stack<Integer>();

		while (!s.isEmpty()) {
			int tmp = s.pop();
			while (!r.isEmpty() && r.peek() > tmp) {
				s.push(r.pop());
			}
			r.push(tmp);
		}

		return r;
	}
}
