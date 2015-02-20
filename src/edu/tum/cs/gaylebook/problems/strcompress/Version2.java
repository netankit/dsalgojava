package edu.tum.cs.gaylebook.problems.strcompress;

public class Version2 {
	public static void main(String[] args) {
		String input = "aabcccccaaa";
		String output = compressStringBetter(input);
		System.out.println("Input: " + input + "\nOutput: " + output);
	}

	private static String compressStringBetter(String input) {
		// TODO Auto-generated method stub

		// Check if compression creates a longer string than the input provided
		int size = countCompression(input);
		if (size >= input.length()) {
			return input;
		}
		StringBuffer mystr = new StringBuffer();

		char last = input.charAt(0);
		int count = 1;
		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i) == last) { //
				count++;
			} else {
				mystr.append(last);
				mystr.append(count);
				last = input.charAt(i);
				count = 1;
			}
		}
		// Appending the last set of repeated characters wouldn't be set in the
		// compressed string
		mystr.append(last);
		mystr.append(count);
		return mystr.toString();
	}

	private static int countCompression(String str) {
		// TODO Auto-generated method stub
		if (str == null || str.isEmpty())
			return 0;
		char last = str.charAt(0);
		int size = 0;
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == last) {
				count++;
			} else {
				last = str.charAt(i);
				size += 1 + String.valueOf(count).length();
				count = 1;
			}
		}
		size += 1 + String.valueOf(count).length();
		return size;
	}
}
