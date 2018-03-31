package SearchingAndSortingAlgorithms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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
		List<Double> sortedList = new ArrayList<Double>();
		sortedList.add(0, doubleList.get(0));
		for (int i = 1; i < doubleList.size(); i++){
			boolean foundSpot = false;
			for (int j = 0; j < sortedList.size(); j++) {
				if (doubleList.get(i)<sortedList.get(j)) {
					sortedList.add(j, doubleList.get(i));
					foundSpot = true;
					break;
				}
			}
			if (!foundSpot) {
				sortedList.add(doubleList.get(i));
			}
		}
		return (ArrayList<Double>) sortedList;
	}
	public static ArrayList<String> sortDNA(List<String> DNA_list){
		ArrayList<String> sortedList = new ArrayList<>();
		sortedList.add(0, DNA_list.get(0));
		for (int i = 1; i < DNA_list.size(); i++) {
			boolean foundSpot = false;
			for (int j = 0; j < sortedList.size(); j++) {
				if (DNA_list.get(i).length() < sortedList.get(j).length()) {
					sortedList.add(j, DNA_list.get(i));
					foundSpot = true;
					break;
				}
			}
			if (!foundSpot) {
				sortedList.add(DNA_list.get(i));
				
			}
		}
		return sortedList;
	}
}