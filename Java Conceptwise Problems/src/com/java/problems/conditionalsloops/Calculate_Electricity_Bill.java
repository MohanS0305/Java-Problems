package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculate_Electricity_Bill {

	public static void main(String[] args) {
		// Calculate Electricity Bill

		// create scanner object for input
		try (Scanner input = new Scanner(System.in)) {
			// ask the input from user
			System.out.println("Enter the units:");
			// take the input from user
			int units = input.nextInt();

			// check units is greater than are equal to zero
			if (units >= 0) {
				// call the method
				double cost = calculateElectricityBill(units);
				System.out.println("Electricity bill cost is \u20B9" + cost);
			} else {
				System.err.println("Invaild units value pls enter correct units value");
			}
		} catch (InputMismatchException ime) {
			System.err.println("Invaild input from user pls enter units in number");
		}
	}

	private static double calculateElectricityBill(int units) {
		// For the first 100 units: ₹0.10 per unit
		// For the next 100 units (101-200): ₹0.15 per unit
		// For units above 200: ₹0.20 per unit

		int cost = 0;

		// If units is less than or equal to 100
		if (units <= 100) {
			cost += units * 0.10;
		} else if (units > 100 && units <= 200) { // If units is greater than 100 but less than or equal to 200
			cost += (100 * 0.10) + ((units - 100) * 0.15);
		} else { // If units is greater than 200
			cost += (100 * 0.10) + (100 * 0.15) + ((units - 200) * 0.20);
		}

		return cost;
	}
}
