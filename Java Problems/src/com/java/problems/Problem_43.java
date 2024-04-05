package com.java.problems;

public class Problem_43 {

	public static void main(String[] args) {
		/*
		 * Ticket numbers usually consist of an even number of digits. A ticket number
		 * is considered lucky if the sum of the first half of the digits is equal to
		 * the sum of the second half.
		 * 
		 * Given a ticket number n, determine if it's lucky or not.
		 * 
		 * Example
		 * 
		 * For n = 1230, the output should be solution(n) = true; For n = 239017, the
		 * output should be solution(n) = false.
		 * 
		 * [input] integer n
		 * 
		 * A ticket number represented as a positive integer with an even number of
		 * digits.
		 * 
		 * Guaranteed constraints: 10 ≤ n < 106.
		 * 
		 * [output] boolean
		 * 
		 * true if n is a lucky ticket number, false otherwise.
		 */

		System.out.println(solution(1230));
	}

	private static boolean solution(int n) {
		// convert the no into string
		String input = n + "";
		// get the length of the input no
		int len = input.length();
		int sum = 0;
		// based on length iterate the loop
		for (int i = 0; i < len / 2; i++) { // length divided by 2 so we get half of the no
			int firstHalf = (int) input.charAt(i); // get first each character in the string convert into integer
			int secondHalf = (int) input.charAt(len - i - 1); // get last each character in the string convert into
																// integer
			sum += firstHalf - secondHalf; // subtract first half and second half and add to sum
		}

		return sum == 0; // sum is 0 that means both the sides are equal so return true otherwise false
	}
}
