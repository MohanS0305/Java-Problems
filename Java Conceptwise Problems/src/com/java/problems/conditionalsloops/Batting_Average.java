package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Batting_Average {

	public static void main(String[] args) {
		/*
		 * Batting Average
		 * 
		 * In cricket, a players' batting average is the total number of runs they have
		 * scored divided by the number of times they have been out, usually given to
		 * two decimal places.
		 */

		// create scanner object for input
		try (Scanner input = new Scanner(System.in)) {
			// ask input from user
			System.out.println("Enter a runs scored:");
			// take two input from user
			// 1st input as runs scored
			int runsScored = input.nextInt();

			// 2nd input as noOfOuts
			System.out.println("Enter a outs:");
			int outs = input.nextInt();

			// check run scored as greater than or equal to zero outs greater than zero
			if (runsScored >= 0 && outs > 0) {
				// apply the formula
				double battingAverage = runsScored / outs;
				
			String battingAvg = String.format("%.2f", battingAverage);

				// print it
				System.out.println(
						"Runs scored: " + runsScored 
						+ " | Outs: " + outs 
						+ " | Batting average: " + battingAvg);
			} else { // otherwise print error message
				System.err.println("Invaild input pls enter positive numbers");
			}
		} catch (InputMismatchException ime) { // handle exception
			System.err.println("Invaild input pls enter some numbers");
		}
	}
}
