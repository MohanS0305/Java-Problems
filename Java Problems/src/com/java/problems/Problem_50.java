package com.java.problems;

import java.util.HashMap;
import java.util.Map;

public class Problem_50 {

	public static void main(String[] args) {
		/*
		 * Given a string, find out if its characters can be rearranged to form a
		 * palindrome.
		 * 
		 * Example
		 * 
		 * For inputString = "aabb", the output should be solution(inputString) = true.
		 * 
		 * We can rearrange "aabb" to make "abba", which is a palindrome.
		 * 
		 * [input] string inputString
		 * 
		 * A string consisting of lowercase English letters.
		 * 
		 * Guaranteed constraints: 1 ≤ inputString.length ≤ 50.
		 * 
		 * [output] boolean
		 * 
		 * true if the characters of the inputString can be rearranged to form a
		 * palindrome, false otherwise.
		 */
		System.out.println(solution("aabb"));
	}

	private static boolean solution(String inputString) {
		// create one new hash map key of char and value of int
		Map<Character, Integer> counter = new HashMap<>();
		// iterate through each each char in inputString
		for (char c : inputString.toCharArray()) {
			if (counter.containsKey(c)) { // if the char already present
				counter.put(c, counter.get(c) + 1); // just increment the key value by one
			} else {
				counter.put(c, 1); // otherwise add the char to hash map and it's value of 1
			}
		}

		int oddCounter = 0;
		// iterate through each character key
		for (Character c : counter.keySet()) {
			if (counter.get(c) % 2 == 1) { // if the value is even but reminder is 1
				oddCounter++; // increment the odd counter
				if (oddCounter == 2) { // if odd counter is 2 or more
					return false; // return false
				}
			}
		}
		return true; // finally return true
	}

}
