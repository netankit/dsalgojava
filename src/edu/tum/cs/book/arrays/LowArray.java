//Low Array Implemtentation
package edu.tum.cs.book.arrays;

public class LowArray {
	private final double[] bucket;

	public LowArray(int size) {
		bucket = new double[size];
	}

	public double getValue(int index) {
		return bucket[index];
	}

	public void setValue(int index, double value) {
		bucket[index] = value;
	}

}
