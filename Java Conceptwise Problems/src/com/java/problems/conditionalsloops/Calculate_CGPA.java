package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculate_CGPA {

	public static void main(String[] args) {
		// Calculate CGPA Java Program

		// create scanner object for input
		try (Scanner input = new Scanner(System.in)) {
			// ask the input from user
			System.out.println("Enter the total percentage:");
			// take input from user
			// input as totalPercentage(totalPercentage for 8semester)
			double totalPercentage = input.nextDouble();

			// check percentage is greater than zero
			if (totalPercentage > 0) {
				// apply formula for calculating CGPA
				double cgpa = totalPercentage / 9.5;

				// print CGPA
				System.out.println("CGPA is " + String.format("%.2f", cgpa));
			} else { // otherwise print error message
				System.err.println("Invaild input pls enter vaild percentage");
			}
		} catch (InputMismatchException ime) {
			System.err.println("Invaild input pls enter percentage in numbers");
		}
	}
}
