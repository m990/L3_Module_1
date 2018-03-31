package SearchingAndSortingAlgorithms;

import java.lang.reflect.Array;
import java.util.ArrayList;
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

	
	public static String findLongestWord(List<String> wordList) {
		String longest = "";
		for (String i: wordList) {
			if (i.length() >longest.length()) {
				longest = i;
			}
		}
		return longest;
	}
	public static boolean containsSOS(List<String> list) {
		boolean sos = false;
		for (String i: list) {
			if (i.contains("... --- ...")) {
				sos = true;
			}
		}
		return sos;
	}
	public static ArrayList<Double> sortScores(List<Double> doubleList) {
		double temp = 100000;
		ArrayList<Double> sortedList = new ArrayList<>();
		
		sortedList.add(doubleList.get(0));
		
		for (double i: doubleList) {
			for (double j: doubleList) {
				if (i>j) {
					if (temp > j) {
						temp = j;
					}
					//sortedList.add(doubleList.get(j));
				}
			}
			sortedList.add(temp);
		}
		return sortedList;
	}
	
}