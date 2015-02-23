package edu.tum.cs.gaylebook.problems.rotatematrix;

/*
 * 
 * Given an image represented by an NxN matrix, where each pixel in the image is 4
 * bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
 *
 * */
public class App {

	public static void main(String[] args) {
		int inputSize = 3;
		int[][] inputmatrix = new int[inputSize][inputSize];

		int outputMatrix[][] = rotateMatrixInplace(inputmatrix, inputSize);

		for (int i = 0; i < inputSize; i++) {
			for (int j = 0; j < inputSize; j++) {
				System.out.print(outputMatrix[i][j] + " ");
				System.out.println();
			}
		}

	}

	private static int[][] rotateMatrixInplace(int[][] inputmatrix, int N) {
		// TODO Auto-generated method stub
		for (int layer = 0; layer < N / 2; ++layer) {
			int first = layer;
			int last = N - 1 - layer;

			for (int i = first; i < last; ++i) {
				int offset = i - first;

				// save top element
				int top = inputmatrix[first][i];

				// left --> top
				inputmatrix[first][i] = inputmatrix[last - offset][first];

				// bottom --> left
				inputmatrix[last - offset][first] = inputmatrix[last][last
						- offset];

				// right --> bottom
				inputmatrix[last][last - offset] = inputmatrix[i][last];

				// top --> right
				inputmatrix[i][last] = top;
			}
		}
		return inputmatrix;
	}
}
