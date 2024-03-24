package com.java.problems;

public class Problem_34 {

	public static void main(String[] args) {
		/*
		 * Given the string, check if it is a palindrome.
		 * 
		 * Example
		 * 
		 * For inputString = "aabaa", the output should be solution(inputString) = true;
		 * For inputString = "abac", the output should be solution(inputString) = false;
		 * For inputString = "a", the output should be solution(inputString) = true.
		 * 
		 * [input] string inputString
		 * 
		 * A non-empty string consisting of lowercase characters.
		 * 
		 * Guaranteed constraints: 1 ≤ inputString.length ≤ 105.
		 * 
		 * [output] boolean true if inputString is a palindrome, false otherwise.
		 */

		System.out.println(palindrome("aabaa"));

	}

	private static boolean palindrome(String inputString) {
		// get the length of the input string
		int len = inputString.length();
		// based on length iterate the for loop
		for (int i = 0, j = len - 1; i < len / 2; i++, j--) {
			// take each each character in the original string and reverse string
			// check if both character are match or not
			if (inputString.charAt(i) != inputString.charAt(j)) { // if it not match
				return false; // return false
			}
		}
		return true; // or return true
	}
}
