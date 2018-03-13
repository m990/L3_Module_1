package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		return eggs.indexOf("cracked");
	}

	// Add other methods here
	public static int countPearls(List<Boolean> oyster) {
		int amountTrue = 0;
		for (Boolean o : oyster) {
			if (o == true) {
				amountTrue++;
			}
		}
		return amountTrue;
	}

	public static double findTallest(List<Double> doubleList) {
		double biggest = 0;
		for (double tallest : doubleList) {
			if (tallest > biggest) {
				biggest = tallest;
			}
		}
		return biggest;
	}

	/*
	 * public static String findLongestWord(List<String> wordList) { }
	 */
}