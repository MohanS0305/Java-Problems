package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculate_Commission_Percentage {

	public static void main(String[] args) {
		/*
		 * Calculate Commission Percentage
		 * 
		 * Commission rate (%): This is the commission rate expressed as a percentage.
		 * Commission amount: The desired commission amount to be earned or paid. Total
		 * sales or revenue: The total amount of sales or revenue generated.
		 * 
		 * Formula: 
		 * Commission rate (%) = (Commission amount / Total sales or revenue) x 100
		 */

		// create scanner object for input
		try (Scanner input = new Scanner(System.in)) {
			// ask input from user
			System.out.println("Enter a total sales:");
			// take two input form user
			// 1st input as totalSale(sales or revenue)
			double totalSale = input.nextInt();

			System.out.println("Enter a commission amount:");
			// 2nd input as commissionAmount
			double commissionAmount = input.nextInt();

			// check both input is greater than are equal to zero
			if (totalSale >= 0 && commissionAmount >= 0) {
				// apply formula
				double commissionPercentage = 
						(commissionAmount / totalSale) * 100;

				// print commission percentage
				System.out.println("Total sales: " + totalSale 
						+ " | commission amount: " + commissionAmount
						+ " | commission rate: " + (int) commissionPercentage + "\u0025");
			} else { // otherwise print error message
				System.err.println("Invaild input pls enter sales "
						+ "& commission amount in positive numbers");
			}
		} catch (InputMismatchException ime) { // handle exception
			System.err.println("Invaild input pls enter sales "
					+ "& commission amount in numbers");
		}
	}
}
