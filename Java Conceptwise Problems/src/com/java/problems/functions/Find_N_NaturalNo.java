package com.java.problems.functions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Find_N_NaturalNo {

	public static void main(String[] args) {

		// create scanner object for input
		try (Scanner input = new Scanner(System.in)) {
			// ask the input from user
			System.out.println("Enter the no:");
			// take the input from user
			int n = input.nextInt();

			// check the input is greater than or equal to zero
			if (n >= 0) {
				// call findSum()
				int sumOfNaturalNo = findSum(n);

				// print it
				System.out.println("Sum of " + n + " natural no is " 
						+ sumOfNaturalNo);
			} else {
				// otherwise print error message
				System.err.println("Invaild input pls enter" 
						+ " some positive numbers.");
			}

		} catch (InputMismatchException ime) { // handle exception
			System.err.println("Invaild input pls enter numbers.");
		}

	}

	private static int findSum(int n) {
		// declare sum = 0
		int sum = 0;
		// based on n iterate the loop
		for (int i = 1; i <= n; i++) {
			// take each number add to sum
			sum += i;
		}

		// return sum
		return sum;
	}

}
