package com.java.problems;

import java.util.Scanner;

public class Problem_30 {

	public static void main(String[] args) {
		/*
		 * Roller Coaster Chef's son wants to go on a roller coaster ride. The height of
		 * Chef's son is X inches while the minimum height required to go on the ride is
		 * H inches. Determine whether he can go on the ride or not.
		 * 
		 * Input Format The first line contains a single integer T - the number of test
		 * cases. Then the test cases follow. The first and only line of each test case
		 * contains two integers X and H - the height of Chef's son and the minimum
		 * height required for the ride respectively. Output Format For each test case,
		 * output in a single line, YES if Chef's son can go on the ride. Otherwise,
		 * output NO.
		 * 
		 * You may print each character of YES and NO in uppercase or lowercase (for
		 * example, yes, yEs, Yes will be considered identical)
		 * 
		 * Constraints 1≤T≤1000 1≤X,H≤100 sample input 4 15 20 50 48 32 32 38 39 sample
		 * output NO YES YES NO
		 */

		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		checkAge(testCase, sc);
	}

	private static void checkAge(int t, Scanner sc) {
		while (t > 0) {
			int x = sc.nextInt();
			int h = sc.nextInt();
			if (x >= h) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			t--;
		}
	}
}
