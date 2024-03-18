package com.java.problems;

import java.util.Scanner;

public class Problem_26 {

	public static void main(String[] args) {
		/*
		 * Burgers Chef is fond of burgers and decided to make as many burgers as
		 * possible.
		 * 
		 * Chef has A patties and B buns. To make 1 burger, Chef needs 1 patty and 1
		 * bun. Find the maximum number of burgers that Chef can make.
		 * 
		 * Input Format The first line of input will contain an integer T — the number
		 * of test cases. The description of T test cases follows. The first and only
		 * line of each test case contains two space-separated integers A and B, the
		 * number of patties and buns respectively. Output Format For each test case,
		 * output the maximum number of burgers that Chef can make.
		 * 
		 * Constraints 1≤T≤1000 1≤A,B≤10^5 sample input 4 2 2 2 3 3 2 23 17 sample
		 * output 2 2 2 17
		 */

		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		while (testCase > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(makeBurger(x, y));
			testCase--;
		}
		sc.close();
	}

	public static int makeBurger(int x, int y) {
		if (x >= y) {
			return y;
		} else if (y >= x) {
			return x;
		}
		return 0;
	}
}
