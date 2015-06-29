package edu.tum.cs.codility.problems.swapelements;

/* 
 * Check if there is a swap operation which can be performed 
 * on these arrays in such a way that the sum of elements in array A
 * equals the sum of elements in array B after the swap. 
 * 
 */
public class App {

	public static void main(String[] args) {
		// correct case
		int[] A = { 1, 0, 3, 4, 5, 6 };
		int[] B = { 1, 2, 3, 6, 5, 2 };
		boolean swapElementsCheck = swapElementsCheck(A, B, 7);
		System.out.println(swapElementsCheck);

		// Have to swap - non unique elements in an array
		int[] C = { 1, 0, 1, 4, 7, 4 };// 17
		int[] D = { 1, 2, 3, 6, 5, 2 }; // 19
		boolean swapElementsCheck1 = swapElementsCheck(C, D, 8);
		System.out.println(swapElementsCheck1);

		// Have to swap - unique elements in an array
		int[] E = { 1, 0, 2, 3, 7, 4 };// 17
		int[] F = { 1, 2, 3, 6, 5, 2 }; // 19
		boolean swapElementsCheck2 = swapElementsCheck(E, F, 8);
		System.out.println(swapElementsCheck2);

		// Have to swap - unique elements in an array
		int[] G = { 1, 0, 1, 2, 17, 2 };
		int[] H = { 1, 2, 3, 6, 5, 2 };
		boolean swapElementsCheck3 = swapElementsCheck(G, H, 18);
		System.out.println(swapElementsCheck3);
	}

	public static boolean swapElementsCheck(int[] A, int[] B, int m) {
		int n = A.length;
		int sum_a = sum(A);
		int sum_b = sum(B);

		int d = sum_b - sum_a;
		if (d % 2 == 1) {
			return false;
		}

		d = (int) Math.floor(d / 2);

		int[] count = counting(A, m);

		for (int i = 0; i < n; i++) {
			if (0 <= B[i] - d && B[i] - d <= m && count[B[i] - d] > 0) {
				return true;
			}
		}
		return false;
	}

	public static int[] counting(int[] A, int m) {
		int n = A.length;
		int[] count = new int[m];

		for (int i = 0; i < n; i++) {
			count[A[i]] += 1;
		}
		return count;
	}

	public static int sum(int[] A) {
		int sum = 0;
		for (int item : A) {
			sum = sum + item;
		}
		return sum;
	}
}
