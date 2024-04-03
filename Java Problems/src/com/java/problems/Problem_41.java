package com.java.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_41 {

	public static void main(String[] args) {
		/*
		 * Given an array of strings, return another array containing all of its longest
		 * strings.
		 * 
		 * Example
		 * 
		 * For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
		 * solution(inputArray) = ["aba", "vcd", "aba"]. [input] array.string inputArray
		 * 
		 * A non-empty array.
		 * 
		 * Guaranteed constraints: 1 ≤ inputArray.length ≤ 10, 1 ≤ inputArray[i].length
		 * ≤ 10.
		 * 
		 * [output] array.string
		 * 
		 * Array of the longest strings, stored in the same order as in the inputArray.
		 */
		
		String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};
		System.out.println(Arrays.toString(solution(inputArray)));
	}
	
	private static String[] solution(String[] inputArray) {
		// get the length of the array
		int len = inputArray.length;
		int max = inputArray[0].length();
		// create the string array list for dynamically add the max length string element in the inputArray
		List<String> stringList = new ArrayList<>();
		// based on inputArray length iterate the loop
		for (int i = 0; i < len; i++) {
			// find the max string element length
			if (inputArray[i].length() > max) { // if the current element length is greater than max
				max = inputArray[i].length(); // store the element length in max
			}
		}
		
		// based on inputArray length iterate the loop
		for (int i = 0; i < len; i++) {
			if (inputArray[i].length() == max) { // if current element length is equal to max
				stringList.add(inputArray[i]); // add that element in the stringList that means array list
			}
		}
		// convert the string arrayList to string array because we need to return string[] 
		String[] result = stringList.toArray(new String[stringList.size()]); 
		return result; // finally return the string array
	}
}
