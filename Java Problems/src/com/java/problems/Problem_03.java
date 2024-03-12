package com.java.problems;

import java.util.Scanner;

public class Problem_03 {

	public static void main(String[] args) {

		/*
		 * Let's solve a simple problem. Write a program in the IDE which does the
		 * following
		 * 
		 * Accepts the count of test cases - T - as an integer input given in the 1st
		 * line. This is followed by T lines - Each line contains an integer N For each
		 * test cases, prints out the integer N to console on a separate line
		 * input 
		 * 3 times
		 * 1
		 * 22
		 * 33
		 * output
		 * 1
		 * 22
		 * 33
		 */

		Scanner read = new Scanner(System.in);
		// accept the count of test cases given in the 1st line
		int t = read.nextInt();
		int[] N = new int[t];
		// Run a loop to accept 't' inputs
		for (int i = 0; i < N.length; i++) {
			// accept an integer N in each test case
			N[i] = read.nextInt();
			// output the number mirror for each test case
			// "println" prints output followed with a new line.
			System.out.println();
		}
		read.close();

		for (int i = 0; i < N.length; i++) {
			System.out.println(N[i]);
		}

	}

}
