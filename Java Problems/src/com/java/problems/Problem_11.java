package com.java.problems;

import java.util.Scanner;

public class Problem_11 {

	public static void main(String[] args) {

		/*
		 * Chef wants to become fit for which he decided to walk to the office and
		 * return home by walking. It is known that Chef's office is X km away from his
		 * home. If his office is open on 5 5 days in a week, find the number of
		 * kilometres Chef travels through office trips in a week. 
		 * input 2 1 3 
		 * output 10 30
		 */

		Scanner read = new Scanner(System.in);

		int t = read.nextInt();
		// Update your code below this line to solve the problem
		for (int i = 0; i < t; i++) {
			int x = read.nextInt();
			// office open 5days in a week, per day chef walk 2 times walk to office and
			// walk to home 2 * 5 = 10
			System.out.println(x * 10);
		}
		read.close();
	}
}
