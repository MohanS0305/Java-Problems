package com.java.problems;

public class Problem_42 {

	public static void main(String[] args) {
		/*
		 * Given two strings, find the number of common characters between them.
		 * 
		 * Example
		 * 
		 * For s1 = "aabcc" and s2 = "adcaa", the output should be solution(s1, s2) = 3.
		 * 
		 * Strings have 3 common characters - 2 "a"s and 1 "c". [input] string s1
		 * 
		 * A string consisting of lowercase English letters.
		 * 
		 * Guaranteed constraints: 1 ≤ s1.length < 15.
		 * 
		 * [input] string s2
		 * 
		 * A string consisting of lowercase English letters.
		 * 
		 * Guaranteed constraints: 1 ≤ s2.length < 15.
		 * 
		 * [output] integer
		 */
		
		System.out.println(solution("aabcc", "adcaa"));
	}
	
	private static int solution(String s1, String s2) {
		// convert the string into character array
		char[] s1Char = s1.toCharArray();
		char[] s2Char = s2.toCharArray();
		// get the length of the string
		int s1Len = s1Char.length;
		int s2Len = s2Char.length;
		int count = 0;
		// based on length iterate the loop
		for (int i = 0; i < s1Len; i++) { // s1 string loop iteration
			for (int j = 0; j < s2Len; j++) { // s2 string loop iteration
				if (s1Char[i] == s2Char[j]) { // check if s1 character is present in s2 character
					count++; // increment the count by 1
					s1Char[i] = ' '; // and remove that character from s1 so make it empty
					s2Char[j] = ' '; // and remove that character from s2 so make it empty
					break; // exit the inner loop
				}
			}
		}
		return count;
	}
}
