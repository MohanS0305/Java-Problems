package com.java.problems.functions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// create scanner object for input
		try (Scanner input = new Scanner(System.in)) {
			// ask input from user (Enter the number)
			System.out.println("Enter the number:");
			int number = input.nextInt();

			// check number is greater than or equal to 0
			if (number >= 0) {
				// call findFactorial()
				int factorialNO = findFactorial(number);

				// print it
				System.out.println("Factorial of " 
						+ number + " is " + factorialNO);
			} else {
				// otherwise print error message
				System.err.println("Invaild input pls enter " 
						+ "some positive number.");
			}

		} catch (InputMismatchException ime) { // handle exception
			System.err.println("Invaild input pls enter" 
					+ " some numbers.");
		}

	}

	private static int findFactorial(int number) {
		int fact = number;
		// based on number iterate the loop
		for (int i = 1; i < number; i++) {
			// multiply number with i
			fact *= i;
		}
		return fact;
	}

}
