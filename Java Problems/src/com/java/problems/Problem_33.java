package com.java.problems;

public class Problem_33 {

	public static void main(String[] args) {
		/*
		 * Given a year, return the century it is in. The first century spans from the
		 * year 1 up to and including the year 100, the second - from the year 101 up to
		 * and including the year 200, etc.
		 * 
		 * Example 
		 * For year = 1905, the output should be solution(year) = 20; 
		 * For year = 1700, the output should be solution(year) = 17.
		 * 
		 * [input] 
		 * A positive integer, designating the year.
		 * 
		 * Guaranteed constraints: 1 ≤ year ≤ 2005.
		 * 
		 * [output] integer 
		 * The number of the century the year is in.
		 */
		int result = solution(1700);
		System.out.println(result);
	}

	private static int solution(int year) {
		int century = year / 100;
		if (year % 100 == 0) {
			return century;
		} else {
			return century + 1;
		}
	}
}
