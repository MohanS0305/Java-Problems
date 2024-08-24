package com.java.problems.functions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PythagoreanTriplet {

	public static void main(String[] args) {

		// create scanner object for input
		try(Scanner input = new Scanner(System.in)) {
			// take 3 input from user
			// ask input from user
			// 1st input as a
			System.out.println("Enter first number:");
			int a = input.nextInt();

			// 2nd input as b
			System.out.println("Enter second number:");
			int b = input.nextInt();

			// 3rd input as c
			System.out.println("Enter third number:");
			int c = input.nextInt();

			// check all input is greater than 0
			if (a > 0 && b > 0 && c > 0) {
				// call pythagoreanTriplet()
				boolean result = pythagoreanTriplet(a, b, c);

				// print it
				if (result) {
					System.out.println(a + "," + b + "," 
							+ c + " is a Pythagorean triplet.");
				} else {
					System.out.println(a + "," + b + "," 
							+ c + " is not a Pythagorean triplet.");
				}

			} else {
				// otherwise print error message
				System.err.println("Invaild input pls enter some "
						+ "positive integers.");
			}

		} catch (InputMismatchException ime) { // handle exception
			System.err.println("Invaild input pls enter numbers.");
		}

	}

	private static boolean pythagoreanTriplet(int a, 
			int b, int c) {
		// apply formula
		int sum = (int) (Math.pow(a, 2) + Math.pow(b, 2));
		c = (int) Math.pow(c, 2);

		return sum == c;
	}

}
