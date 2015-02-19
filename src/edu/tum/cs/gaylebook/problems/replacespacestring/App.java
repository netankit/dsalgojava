package edu.tum.cs.gaylebook.problems.replacespacestring;

public class App {
	public static void main(String[] args) {
		String inputStr = "Hel lo";
		char[] input = inputStr.toCharArray();
		String output = replaceSpaces(input);
		System.out.println("Input: " + input + "\nOutput: " + output);
	}

	private static String replaceSpaces(char[] inputarr) {

		int oldLength = inputarr.length;

		// Count the number of spaces within the string
		int spaceCount = 0;
		for (int i = 0; i < oldLength; i++) {
			if (inputarr[i] == ' ') {
				spaceCount++;
			}
		}
		// Computing new Length
		int newLength = oldLength + spaceCount * 2;

		// Replace the string in place. Backwards
		inputarr[newLength] = '\0';

		for (int i = newLength - 1; i >= 0; i--) {
			if (inputarr[i] == ' ') {
				inputarr[newLength - 1] = '0';
				inputarr[newLength - 2] = '2';
				inputarr[newLength - 3] = '%';
				newLength = newLength - 3;
			} else {
				inputarr[newLength - 1] = inputarr[i];
				newLength = newLength - 1;
			}
		}

		String out = inputarr.toString();
		return out;
	}
}
