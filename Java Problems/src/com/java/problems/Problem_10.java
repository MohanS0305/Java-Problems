package com.java.problems;

import java.util.Scanner;

public class Problem_10 {

	public static void main(String[] args) {

		/*
		 * You will attend tuitions for X weeks, and the cost of tuition per week is Y
		 * dollars. You need to compute and output your total tuition fees. Input Format
		 * The first line of input will contain an integer T — the number of test cases.
		 * The first and only line of each test case contains two space-separated
		 * integers X and Y Output Format For each test case, output on a new line your
		 * total tuition fees. input 4 1 10 1 15 2 10 2 15 output 10 15 20 30
		 */

		Scanner read = new Scanner(System.in);

		int t = read.nextInt();
		for (int i = 0; i < t; i++) {
			// Accept 2 integers inputs
			int x = read.nextInt();
			int y = read.nextInt();

			// Update your code below this line to solve the problem
			System.out.println(x * y);
		}
		read.close();
	}
}
