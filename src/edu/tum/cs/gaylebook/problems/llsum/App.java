package edu.tum.cs.gaylebook.problems.llsum;

import edu.tum.cs.essentials.linkedlist.Node;

//LinkedList
// 7 -> 1 -> 6 -> 6 [6617]
// 5 -> 9 -> 2 [295]

// Sum:
// 2 -> 1-> 9 -> 6 [6912]

public class App {

	public static void main(String args[]) {

		Node num1 = new Node(0);
		// 7 -> 1 -> 6 -> 6 [6617]
		num1.appendToTail(7);
		num1.appendToTail(1);
		num1.appendToTail(6);
		num1.appendToTail(6);

		Node num2 = new Node(0);
		// 5 -> 9 -> 2 [295]
		num2.appendToTail(5);
		num2.appendToTail(9);
		num2.appendToTail(2);
		Node output = sumLL(num1.next, num2.next);

		// Key Learning : Note how the linked list is printed, we check for the
		// node being null or not and increment next pointer
		while (output != null) {
			System.out.print(output.data + " ");
			output = output.next;
		}

	}

	private static Node sumLL(Node num1, Node num2) {
		int carry = 0;
		Node result = new Node(0);
		Node p1 = num1;
		Node p2 = num2;
		Node p3 = result;

		while ((p1 != null) || (p2 != null)) {
			if (p1 != null) {
				carry += p1.data;
				p1 = p1.next;

			}
			if (p2 != null) {
				carry += p2.data;
				p2 = p2.next;

			}
			p3.next = new Node(carry % 10);
			p3 = p3.next;
			carry /= 10;

		}
		if (carry == 1) {
			p3.next = new Node(1);
		}
		return result.next;
	}
}
