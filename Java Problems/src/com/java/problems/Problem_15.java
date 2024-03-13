package com.java.problems;

import java.util.Scanner;

public class Problem_15 {

	public static void main(String[] args) {
		/*
		 * Chef wants to appear in a competitive exam. To take the exam, there are
		 * following requirements:
		 * 
		 * Minimum age limit is X (i.e. Age should be greater than or equal to X). Age
		 * should be strictly less than Y. Chef's current Age is A. Find whether he is
		 * currently eligible to take the exam or not.
		 * 
		 * Input Format First line will contain T, number of test cases. Then the test
		 * cases follow. Each test case consists of a single line of input, containing
		 * three integer X,Y, and A as mentioned in the statement. Output Format For
		 * each test case, output YES if Chef is eligible to give the exam, NO
		 * otherwise. input 2 21 34 30 25 31 31 output YES NO
		 */
		Scanner read = new Scanner(System.in);

		int t = read.nextInt();
		for (int i = 0; i < t; i++) {
			int x = read.nextInt();
			int y = read.nextInt();
			int a = read.nextInt();

			// Update your code below this line solve the problem
			if (a >= x && a < y) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		read.close();
	}
}
