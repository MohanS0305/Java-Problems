package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Compound_Interest {

	public static void main(String[] args) {
		// Compound Interest Java Program

		/*
		 * Compound interest is a method of calculating interest where interest earned
		 * over time is added to the principal amount, and future interest is then
		 * calculated based on the updated principal.
		 * 
		 * To calculate compound interest, you can use the formula:
		 * 
		 * 𝐴 = 𝑃 ( 1 + 𝑟/𝑛 ) 𝑛𝑡
		 * 
		 * Where: 𝐴 A is the amount of money accumulated after n years, including
		 * interest. 𝑃 P is the principal amount (the initial amount of money). 𝑟 r is
		 * the annual interest rate (decimal). 𝑛 n is the number of times that interest
		 * is compounded per year. 𝑡 t is the time the money is invested or borrowed
		 * for, in years. To find the compound interest earned, you subtract the
		 * principal amount 𝑃 P from the total amount 𝐴 A:
		 * 
		 * Compound Interest = 𝐴 − 𝑃
		 */

		// create scanner object for input
		try (Scanner input = new Scanner(System.in)) {
			// ask & take four input from user
			System.out.println("Enter a principal:");
			// take input as p(Principal)
			double p = input.nextDouble();
			// take input as r(Annual Interest Rate)
			System.out.println("Enter an annual interest rate (in decimal form, e.g., 0.05 for 5%):");
			double r = input.nextDouble();
			// take input as n(Number of Compounding Periods per Year)
			System.out.println("Enter the number of compounding periods per year:");
			int n = input.nextInt();
			// take input as t(Time)
			System.out.println("Enter the time (in years):");
			int t = input.nextInt();
			
			// check all the inputs are greater than or equal to zero
			if (p >= 0 && r >= 0 && n >= 0 && t >= 0) {
				// call the method
				double compoundInterest = compoundInterest(p, r, n, t);
				System.out.println("Compound Interest: " + String.format("%.2f", compoundInterest));
			} else {
				System.err.println("Invaild input all inputs must be non-negative.");
			}
		} catch (InputMismatchException ime) {
			System.err.println("Invaild input pls enter some number");
		}
	}

	private static double compoundInterest(double p, double r, int n, int t) {
		// check n is zero
		if (n == 0) {
			// Avoid division by zero, treat as simple interest for practical purposes
			return p * r * t;
		}
		// apply compound interest formula
		double a = p * Math.pow(1 + (r / n), n * t);
		
		// find compoundInterest = a - p
		return a - p; 
	}
}
