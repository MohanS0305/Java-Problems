package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculate_Average_Marks {

	public static void main(String[] args) {
		// Create scanner object for input
		try (Scanner input = new Scanner(System.in)) {
			// Ask & take input from user
			System.out.println("Enter the number of marks:");
			int noOfMarks = input.nextInt();

			// Create array for storing marks
			int[] marks = new int[noOfMarks];

			// Take marks input from user
			for (int i = 0; i < noOfMarks; i++) {
				System.out.println("Enter mark " + (i + 1) + ":");
				marks[i] = input.nextInt();
				// Check marks is greater than zero
				if (marks[i] <= 0) {
					System.err.println("Invalid marks. Please enter positive marks value.");
					return;
				}
			}

			// Calculate the average mark
			double averageMark = findAverageMarks(marks);
			// Print average mark
			System.out.println("Average mark is: " + averageMark);

		} catch (InputMismatchException ime) {
			System.err.println("Invalid input. Please enter numbers for marks.");
		}
	}

	private static double findAverageMarks(int[] marks) {
		int sum = 0;
		for (int mark : marks) {
			// Sum of all the marks
			sum += mark;
		}

		// Divide by total marks & return it
		return (double) sum / marks.length;
	}
}
