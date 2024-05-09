package com.flowofprogram.problems;

import java.util.Scanner;

public class Problem_03 {

	public static void main(String[] args) {
		// Take a number as input and print the multiplication table for it.
		// ask the user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no :");
		int n = input.nextInt();
		// declare multiply variable
		int multiply = 1;
		// iterate the loop 10 times
		for (int i = 1; i <= 10; i++) {
			// input no multiply by i and store the value to multiply
			multiply = n * i;
			// print the result in multiplication table format
			System.out.println(n + " * " + i + " = " + multiply);
		}
		input.close();
	}

}
