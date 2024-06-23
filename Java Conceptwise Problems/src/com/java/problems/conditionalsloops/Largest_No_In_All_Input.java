package com.java.problems.conditionalsloops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Largest_No_In_All_Input {

	public static void main(String[] args) {
		/*
		 * Take integer inputs till the user enters 0 and print the largest number from
		 * all.
		 */

		// create scanner object for input
		try (Scanner input = new Scanner(System.in)) {
			// ask input from user
			System.out.println("Enter a number:");
			// take input from user
			int n = input.nextInt();

			// create arrayList it can store all the numbers
			List<Integer> largestNo = new ArrayList<>();

			// check input is not equal to zero
			while (n != 0) {
				// store the input in list
				largestNo.add(n);

				// ask the input again
				System.out.println("Enter '0' to exit");
				System.out.println("Enter a number:");
				n = input.nextInt();
			}

			// check input is zero
			if (n == 0) {
				findLargestNo(largestNo);
			}
		} catch (InputMismatchException ime) { // handle exception
			System.err.println("Invaild input from user pls enter some numbers");
		}
	}
	
	private static void findLargestNo(List<Integer> largestNo) {
		try {
			// print the largest no from all input
			Integer maxNo = Collections.max(largestNo);
			System.out.println("Largest number from all the input is " + maxNo);
		} catch (NoSuchElementException e) {
			System.out.println("0");
		}
	}
}
