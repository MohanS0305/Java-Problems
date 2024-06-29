package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculate_Depreciation_Value {

	public static void main(String[] args) {

		/*
		 * Calculate Depreciation Value
		 * 
		 * Depreciation is a decrease in the book value of fixed assets. Depreciation
		 * involves loss of value of assets due to the passage of time and obsolescence.
		 * Depreciation is an ongoing process until the end of the life of assets.
		 * formula :
		 * Depreciation value = initial value * (1 - Depreciation rate)^years
		 */

		// create the scanner object for input
		try (Scanner input = new Scanner(System.in)) {
			// ask the input from user
			System.out.println("Enter the initial value:");
			// take 3 input from user
			// 1st input as initial value(assets cost)
			double initialValue = input.nextDouble();

			System.out.println("Enter the depreciation rate (%):");
			// 2nd input as depreciationRate
			double depreciationRate = input.nextDouble() / 100;

			System.out.println("Enter the years:");
			// 3rd input as years
			double years = input.nextDouble();

			// check 3 input is greater than are equal to 0
			if (initialValue >= 0 && depreciationRate >= 0 && years >= 0) {
				// Correct the formula here
				double depreciationValue = initialValue * Math.pow((1 - depreciationRate), years);

				// take two digits after decimal point
				String depreciation = String.format("%.2f", depreciationValue);

				// print the depreciation value
				System.out.println("Initial value: " + initialValue + " | Depreciation rate: "
						+ (depreciationRate * 100) + "\u0025 | Years: " + years 
						+ " | Depreciation value: " + depreciation);
			} else { // otherwise print error message
				System.err.println("Invalid input, please enter positive numbers "
						+ "for initial value, depreciation rate, and years.");
			}
		} catch (InputMismatchException ime) { // handle exception
			System.err.println("Invalid input, please enter numerical values.");
		}
	}
}
