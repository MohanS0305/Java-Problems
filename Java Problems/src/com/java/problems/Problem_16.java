package com.java.problems;

import java.util.Scanner;

public class Problem_16 {

	public static void main(String[] args) {
		/*
		 * In Chefland, a tax of rupees 10 is deducted if the total income is strictly
		 * greater than rupees 100. Given that total income is X rupees, find out how
		 * much money does the Chef take home.
		 * 
		 * Input Format The first line of input will contain a single integer T,
		 * denoting the number of test cases. The first and only line of each test case
		 * contains a single integer X — Chef's total income. Output Format For each
		 * test case, output on a new line, the amount of money that Chef takes home
		 * after deducting tax. input 2 101 100 output 91 100
		 */

		Scanner read = new Scanner(System.in);

		int t = read.nextInt();
		for (int i = 0; i < t; i++) {
			int x = read.nextInt();
			if (x > 100) {
				x -= 10;
			}
			System.out.println(x);
		}
		read.close();
	}
}
