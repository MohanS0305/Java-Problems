package com.java.problems;

import java.util.Scanner;

public class Problem_05 {

	public static void main(String[] args) {

		/*
		 * Lets write a program in the IDE which performs the following
		 * 
		 * The 1st line of input contains t - the count of testcases Each testcase
		 * consists of the following 2 lines of input The 1st line of the testcase
		 * contains 2 integers - accept them as variables a and b The 2nd line of the
		 * testcase contains 1 string - accept it as a variable s For each test case,
		 * output on one line the 2 integers followed by the string input 2 1 2 abcde 34
		 * 567 A1B2C3 output 1 2 abcde 34 567 A1B2C3
		 */

		Scanner read = new Scanner(System.in);
		// accept the count of test cases given in the 1st line
		int t = read.nextInt();

		// Run a loop to accept 't' inputs
		for (int i = 0; i < t; i++) {
			// accept 2 integers on the 1st line of each test case
			int a = read.nextInt();
			System.out.print(" ");
			int b = read.nextInt();
			read.nextLine();
			System.out.println();
			// accept 1 string on the 2nd line of each test case
			String s = read.nextLine();
			read.close();

			// output the 2 integers and 1 string on a single line for each test case
			System.out.println(a + " " + b + " " + s);
		}
	}
}
