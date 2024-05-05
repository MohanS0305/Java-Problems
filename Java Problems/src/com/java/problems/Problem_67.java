package com.java.problems;

import java.util.ArrayList;
import java.util.List;

public class Problem_67 {

	public static void main(String[] args) {
		/*
		 * Check if the sentence is pangram
		 * 
		 * A pangram is a sentence where every letter of the English alphabet appears at
		 * least once.
		 * 
		 * Given a string sentence containing only lowercase English letters, return
		 * true if sentence is a pangram, or false otherwise.
		 * 
		 * Example 1:
		 * 
		 * Input: sentence = "thequickbrownfoxjumpsoverthelazydog" Output: true
		 * Explanation: sentence contains at least one of every letter of the English
		 * alphabet. Example 2:
		 * 
		 * Input: sentence = "leetcode" Output: false
		 * 
		 * Constraints:
		 * 
		 * 1 <= sentence.length <= 1000 sentence consists of lowercase English letters.
		 */
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		System.out.println(checkIfPangram(sentence));
	}

	private static boolean checkIfPangram(String sentence) {
		// manually convert all the character into lowerCase
		// remove white space and special character in the String
		sentence = sentence.toLowerCase().replaceAll("[^a-z]", "");
		System.out.println(sentence);
		// get the String length
		int len = sentence.length();
		// create one new character arrayList
		List<Character> pangram = new ArrayList<>();
		// based on length iterate the loop
		for (int i = 0; i < len; i++) {
			// check pangram(character arrayList) not contains existing character than add
			// that character
			if (!pangram.contains(sentence.charAt(i))) {
				// take each character from the string add it to pangram(character arrayList)
				pangram.add(sentence.charAt(i));
			}
		}
		// check pangram(character arrayList) equal to 26 character all the alphabet is
		// present
		return pangram.size() == 26; // return true otherwise return false
	}
}
