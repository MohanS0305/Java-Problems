package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factor_Of_Number {

	public static void main(String[] args) {

		// create scanner object for input
		try (Scanner input = new Scanner(System.in)) {
			// ask input from user
			System.out.println("Enter a number for factorial:");
			// take that input from user
			int n = input.nextInt();

			// check that number is greater than zero
			if (n > 0) {
				int factorial = 1;
				// based on that input iterate the loop
				for (int i = n; i > 0; i--) {
					// multiply input number to 1
					factorial *= i;
				}
				// and then print it
				System.out.println("Factorial of " + n + " is " + factorial);
			} else { // otherwise print error message
				System.err.println("Invaild input pls enter some positive numbers");
			}
		} catch (InputMismatchException ime) {
			System.err.println("Invaild input pls enter some number");
		}
	}
}
