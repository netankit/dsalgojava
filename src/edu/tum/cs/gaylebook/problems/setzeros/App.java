package edu.tum.cs.gaylebook.problems.setzeros;

//Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.

public class App {

	public static void main(String[] args) {
		int inputSize = 3;
		// int[][] inputmatrix = new int[inputSize][inputSize];
		int[][] inputmatrix = { { 1, 2, 0 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int outputMatrix[][] = setZeros(inputmatrix);

		for (int i = 0; i < inputSize; i++) {
			for (int j = 0; j < inputSize; j++) {
				System.out.print(outputMatrix[i][j] + " ");
			}
			System.out.println();

		}

	}

	private static int[][] setZeros(int[][] inputmatrix) {
		// TODO Auto-generated method stub

		// Boolean rows and columns for storing which of those have zeros
		boolean[] row = new boolean[inputmatrix.length];
		boolean[] column = new boolean[inputmatrix[0].length];

		// Pass 1
		for (int i = 0; i < row.length; i++) {
			for (int j = 0; j < column.length; j++) {
				if (inputmatrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}

		// Pass 2
		for (int i = 0; i < row.length; i++) {
			for (int j = 0; j < column.length; j++) {
				if (row[i] || column[j]) {
					inputmatrix[i][j] = 0;
				}
			}
		}

		return inputmatrix;
	}
}