package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sum_Of_All_InputNo {

	public static void main(String[] args) {
		/*
		 * Take integer inputs till the user enters 0 and print the sum of all numbers
		 * (HINT: while loop)
		 */

		// create the scanner object for input
		try (Scanner input = new Scanner(System.in)) {
			// ask the input from user
			System.out.println("Enter some number:");
			// take that input from user
			int n = input.nextInt();

			// check the input is zero or not
			// if it's not zero
			int sum = 0;
			while (n > 0) {
				// And sum all the input till zero
				sum += n;
				// take the input from user
				System.out.println("Enter zero to exit");
				System.out.println("Enter some number:");
				n = input.nextInt();
			}
			// check n is zero print the sum of all numbers
			if (n == 0) {
				System.out.println("Sum of all the numbers is " + sum);
			} else {
				// It's negative numbers print error message
				System.err.println("Invaild input pls enter some positive numbers");
			}
		} catch (InputMismatchException ime) { // handle exception as well
			System.err.println("Invaild input pls enter some numbers");
		}
	}
}
