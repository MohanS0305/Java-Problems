package com.java.problems;

import java.util.Scanner;

public class Problem_01 {

	public static void main(String[] args) {
		/*
		 * Now let's write a simple program - the Input mirror. Your program needs to do
		 * the following
		 * 
		 * Accept an integer input from the console and store it in the variable N
		 * Accept a string input from the console and store it in the variable S Output
		 * the integer and the string on the same line separated by a space input 5
		 * abcde output 5 abcde
		 */

		Scanner read = new Scanner(System.in);
		int N = read.nextInt();
		System.out.println();
		read.nextLine();
		String S = read.nextLine();
		System.out.print(N + " ");
		System.out.print(S);
		read.close();
	}
}
