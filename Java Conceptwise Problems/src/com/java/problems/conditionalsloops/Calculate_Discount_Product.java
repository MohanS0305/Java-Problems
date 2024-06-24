package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculate_Discount_Product {

	public static void main(String[] args) {
		// Calculate Discount Of Product

		// create scanner object for input
		try (Scanner input = new Scanner(System.in)) {
			// ask two input from user
			System.out.println("Enter the product original price:");
			// take 1st input as original price
			double originalPrice = input.nextDouble();

			System.out.println("Enter the product discount percentage:");
			// take 2nd input as discount
			double discountPercentage = input.nextDouble();

			// check both the input has positive value
			if (originalPrice >= 0 && discountPercentage >= 0) {
				// call calculate discount method
				calculateDiscount(originalPrice, discountPercentage);
			} else { // otherwise print error message
				System.err
				.println("Invaild price and discount percentage pls " 
						+ "enter correct price and percentage.");
			}
		} catch (InputMismatchException ime) {
			System.err.println("Invaild input from user pls "
					+ "enter price & percentage in numbers");
		}

		// handle exception
	}

	private static void calculateDiscount(double originalPrice, double discountPercentage) {
		// find discount amount formula for this is
		// discountAmount = originalPrice * (discountPercentage/100)
		double discountAmount = originalPrice * (discountPercentage / 100);

		// find discount price formula for this is
		// discountPrice = originalPrice - discountAmount
		double discountPrice = originalPrice - discountAmount;

		// print the discount amount & discount price
		System.out.println("Original price:  \u0024" + originalPrice 
				+ " | Discount percentage: " + discountPercentage
				+ "\u0025 | Discount amount is \u0024" + discountAmount 
				+ " | Discount price is \u0024" + discountPrice);
	}

}
