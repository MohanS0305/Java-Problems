package com.java.problems;
import java.util.Scanner;
public class Problem_09 {

	public static void main(String[] args) {
		/*
		 * Lets start with a simple problem - you need to write a program which does the
		 * following
		 * 
		 * Accepts the number of inputs / test cases as 't' The only line of each test
		 * case contains 2 integers - declare them as variables A and B For each test
		 * case, you need to perform the following operations Create a variable - S -
		 * the sum of the 2 input integers Create a variable - P - the product of the 2
		 * input integers Output 2 space separated integers - S and P in a single line
		 * input 2 5 10 3 4 output 15 50 7 12
		 */

		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for (int i = 0; i < t; i++) {
			// Accept 2 integers inputs
			int a = read.nextInt();
			int b = read.nextInt();

			// Sum of inputs
			int s = a + b;

			// Product of inputs
			int p = a * b;

			// Print the desired output for each test case
			System.out.println(s + " " + p);
		}
		read.close();
	}
}
