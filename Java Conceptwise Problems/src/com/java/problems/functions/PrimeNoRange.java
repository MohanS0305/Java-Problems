package com.java.problems.functions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNoRange {

	public static void main(String[] args) {

		// create scanner object for input
		try (Scanner input = new Scanner(System.in)) {
			// take 2 input from user
			// ask the input from user
			System.out.println("Enter a first number:");
			int a = input.nextInt();

			System.out.println("Enter a second number:");
			int b = input.nextInt();

			// check no is greater than or equal to 1
			if (a >= 1 && b >= 1) {
				// call findPrimeNo();
				findPrimeNo(a, b);
			} else {
				// otherwise print error message
				System.err.println("Invaild input pls enter " 
						+ "positive numbers.");
			}

		} catch (InputMismatchException ime) { // handle exception
			System.err.println("Invaild input pls enter numbers.");
		}

	}

	private static void findPrimeNo(int a, int b) {
		System.out.println("Prime numbers between " 
				+ a + " to " + b);
		// based on that input iterate the loop
		for (int i = a; i <= b; i++) {
			int count = 0; // count is 0
			// inner loop for multiply all the above numbers
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) { // outer number divisible by inner number
					count++; // increment count by 1
				}
			}

			if (count == 2) {
				System.out.print(i + " ");
			}
		}
	}

}
