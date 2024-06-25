package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Average_Of_N_Number {

	public static void main(String[] args) {
		// Calculate Average Of N Numbers

		// create scanner object for input
		try (Scanner input = new Scanner(System.in)) {
			// ask the input from user
			System.out.println("How many numbers you want to enter");
			// take input from user
			int size = input.nextInt();
			// create one array size of input
			int[] avgNo = new int[size];

			int sum = 0;
			System.out.println("Enter " + size + " elements:");
			// based on size iterate the loop
			for (int i = 0; i < size; i++) {
				// ask input each time & store it in array
				avgNo[i] = input.nextInt();

				// after that sum all the elements and store it some where
				sum += avgNo[i];
			}

			// sum divided by size and store it average
			int average = sum / size;

			// print average
			System.out.println("Average number is " + average);
		} catch (InputMismatchException ime) { // handle exception as well
			System.err.println("Invaild input from user pls enter some numbers");
		}
	}

}
