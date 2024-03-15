package com.java.problems;

import java.util.Scanner;

public class Problem_17 {

	public static void main(String[] args) {
		/*
		 * You are given 2 integers - A and C. You need to find if there exists any
		 * integer B which meets the following condition B must be an integer B is the
		 * average of A and C. For each test case, output B. If no such integer exists,
		 * output −1. input 3 3 5 6 6 2 7 output 4 6 -1
		 */

		// ask the user input
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		// based on input iterate the for loop
		for (int i = 0; i < t; i++) {
			// ask input A and C
			int A = input.nextInt();
			int C = input.nextInt();
			// find average no and store it in B
			int B = (A + C) / 2;
			// average no is display only both A and C is even or odd
			// if A is even and C is odd it display -1
			if ((A % 2 == 0 && C % 2 == 0) || (A % 2 != 0 && C % 2 != 0)) { // (even + even) or (odd + odd) = even
				System.out.println(B);
			} else if (A % 2 == 0 && C % 2 != 0) { // even + odd = odd
				// if it's not display -1
				System.out.println(-1);
			}
		}
		input.close();
	}
}
