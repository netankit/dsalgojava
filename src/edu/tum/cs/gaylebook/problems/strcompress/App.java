package edu.tum.cs.gaylebook.problems.strcompress;

/*
 * 
 * Implement a method to perform basic string compression using 
 * the counts of repeated characters. For example, the string 
 * aabcccccaaa would become a2blc5a3. If the "compressed" string 
 * would not become smaller than the original string, your method 
 * should return the original string.
 * 
 * */
public class App {
	public static void main(String[] args) {
		String input = "aabcccccaaa";
		String output = compressString(input);
		System.out.println("Input: " + input + "\nOutput: " + output);
	}

	private static String compressString(String input) {
		String finalString = "";
		char last = input.charAt(0);
		int charcount = 1;
		for (int i = 1; i < input.length(); i++) {
			// System.out.println(c);
			if (input.charAt(i) == last) {
				charcount++;
			} else {
				// String Concatenation occurs in O(n^2)
				finalString += last + "" + charcount;
				last = input.charAt(i);
				charcount = 1;
			}
		}
		return finalString + last + charcount;
	}
}
