package com.java.problems.arrays;

public class Richest_Customer_Wealth {

	public static void main(String[] args) {

		// take the input
		int[][] accounts = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };

		// call maximumWealth() and print it
		System.out.println(maximumWealth(accounts));
	}

	public static int maximumWealth(int[][] accounts) {
		// Get the accounts length (number of customers)
		int m = accounts.length;
		// Variable to track the maximum wealth found
		int maxWealth = 0;

		// Iterate over each customer
		for (int i = 0; i < m; i++) {
			// Initialize sumOfWealth for the current customer
			int sumOfWealth = 0;

			// Iterate over each bank account for the current customer
			for (int j = 0; j < accounts[i].length; j++) {
				// Add the current bank account balance to sumOfWealth
				sumOfWealth += accounts[i][j];
			}

			// Update maxWealth if the current customer's wealth is greater
			if (sumOfWealth > maxWealth) {
				maxWealth = sumOfWealth;
			}
		}

		// Return the maximum wealth found
		return maxWealth;
	}
}
