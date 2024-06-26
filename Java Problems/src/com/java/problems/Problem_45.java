package com.java.problems;

public class Problem_45 {

	public static void main(String[] args) {
		/*
		 * Write a function that reverses characters in (possibly nested) parentheses in
		 * the input string.
		 * 
		 * Input strings will always be well-formed with matching ()s.
		 * 
		 * Example
		 * 
		 * For inputString = "(bar)", the output should be solution(inputString) =
		 * "rab"; For inputString = "foo(bar)baz", the output should be
		 * solution(inputString) = "foorabbaz"; For inputString = "foo(bar)baz(blim)",
		 * the output should be solution(inputString) = "foorabbazmilb"; For inputString
		 * = "foo(bar(baz))blim", the output should be solution(inputString) =
		 * "foobazrabblim". Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and
		 * then "foobazrabblim".
		 * 
		 * [input] string inputString
		 * 
		 * A string consisting of lowercase English letters and the characters ( and ).
		 * It is guaranteed that all parentheses in inputString form a regular bracket
		 * sequence.
		 * 
		 * Guaranteed constraints: 0 ≤ inputString.length ≤ 50.
		 * 
		 * [output] string
		 * 
		 * Return inputString, with all the characters that were in parentheses
		 * reversed.
		 */
		
		System.out.println(solution("foo(bar)baz"));
	}
	
	private static String solution(String inputString) {
		int firstParam = inputString.lastIndexOf("("); // find the nested open parentheses index
		int lastParam = inputString.indexOf(")",firstParam); // find the nested close parentheses index
		while (firstParam != -1) { // until first parentheses end iterate the loop
			// inside the parentheses all the words we can reverse
			StringBuilder revString = new StringBuilder(inputString.substring(firstParam + 1, lastParam)).reverse();
			String first = inputString.substring(0, firstParam); // before the parentheses take all words
			String last = inputString.substring(lastParam + 1); // starting to last parentheses take all words
			inputString = first + revString + last; // contact the first revString and last
			// based on the parentheses index loop will execute
			firstParam = inputString.lastIndexOf("(");  
			lastParam = inputString.indexOf(")",firstParam);
		}
		return inputString;  // finally return the inputString
	}

}
