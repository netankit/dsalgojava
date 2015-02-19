package edu.tum.cs.gaylebook.problems.uniquechar;

import java.util.HashSet;

// String has all unique charachter
public class App {

	public static void main(String[] args) {
		String input = "";
		boolean out = hasUniqueCharacters(input);
		System.out.println(out);
	}

	public static boolean hasUniqueCharacters(String input_string) {
		try {
			if (input_string == null) {
				System.err.println("Empty String Input");
				return false;
			}
		} catch (NullPointerException n) {
			System.err.println(n);
		}
		char[] input = input_string.toCharArray();
		HashSet<Character> temp = new HashSet<Character>();
		boolean result = false;
		for (int i = 0; i < input.length; i++) {
			result = temp.add(input[i]);
			if (result == true) {
				continue;
			} else {
				break;
			}
		}
		return result;
	}
}
