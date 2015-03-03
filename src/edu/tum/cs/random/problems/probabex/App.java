package edu.tum.cs.random.problems.probabex;

// There are 50 people in a room what's the probability that the two people have the same birthday.
public class App {
	public static double calculateProbability(int n) {

		double x = 1;
		for (int i = 0; i < n; i++) {
			x *= (365.0 - i) / 365.0;
		}
		double pro = Math.round((1 - x) * 100);
		return pro / 100;
	}
}
