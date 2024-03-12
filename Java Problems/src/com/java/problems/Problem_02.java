package com.java.problems;

import java.util.Scanner;

public class Problem_02 {

	public static void main(String[] args) {
		/*
		 * Let's solve a simple problem. Write a program in the IDE which does the
		 * following
		 * 
		 * Accepts 5 inputs given on 5 separate lines. Each input is an integer N For
		 * each test cases, prints out the integer N to console on a separate line input
		 * 11 123 34 22 45 output 11 123 34 22 45
		 */

		Scanner input = new Scanner(System.in);
		int input1 = input.nextInt();
		int input2 = input.nextInt();
		int input3 = input.nextInt();
		int input4 = input.nextInt();
		int input5 = input.nextInt();
		System.out.print(input1 + "\n" + input2 + "\n" + input3 + "\n" + input4 + "\n" + input5);
		input.close();
	}
}
