package edu.tum.cs.book.arrays;

public class LowArrayApp {
	public static void main(String args[]) {
		LowArray arr;

		arr = new LowArray(100);

		int numElements = 10;
		int i = 0;

		// INSERTION
		for (i = 0; i < numElements; i++) {
			arr.setValue(i, Math.random());
		}

		// Display Array after insertion
		for (i = 0; i < numElements; i++) {
			System.out.print(arr.getValue(i) + " ");
		}

		// Searching in Array
		double valueToSearch = arr.getValue(7);

		for (i = 0; i < numElements; i++) {
			if (arr.getValue(i) == valueToSearch) {
				System.out.println("Item found at position: " + i);
				continue;
			} else {
				System.out.println("Item was not found!");
			}
		}

		// Deletion of an element.
		int j;
		double valueToDelete = arr.getValue(5);
		for (j = 0; j < numElements; j++) {
			if (arr.getValue(j) == valueToDelete)
				break;
		}

		// Rearrangement
		for (int k = j; k < numElements; k++) {
			arr.setValue(k, arr.getValue(k + 1));
		}
		// Decrement Size
		numElements--;

		// Display Array after Deletion
		for (i = 0; i < numElements; i++) {
			System.out.print(arr.getValue(i) + " ");
		}
	}
}
