package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		/*
		 * Fibonacci Series
		 * 
		 * The Fibonacci sequence is a type series where each number is the sum of the
		 * two that precede it. It starts from 0 and 1 usually. The Fibonacci sequence
		 * is given by 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, and so on. The
		 * numbers in the Fibonacci sequence are also called Fibonacci numbers.
		 */

		// create scanner object
		try (Scanner input = new Scanner(System.in)) {
			// ask input as size from user
			System.out.println("Enter the number for fibonacci series");
			int size = input.nextInt();

			// create one array based on input size
			int[] fSeries = new int[size];

			// fibonacci series starts with 0 & 1
			fSeries[0] = 0;
			fSeries[1] = 1;

			// based on array size loop through it
			for (int i = 2; i < size; i++) {
				// add array previous + next element
				fSeries[i] = fSeries[i - 2] + fSeries[i - 1];
			}

			System.out.println("Fibonacci series from 0 to " + size);
			// finally loop through and print it
			for (int element : fSeries) {
				System.out.print(element + " ");
			}
		} catch (NegativeArraySizeException ne) {
			System.err.println("Invaild input pls enter some positive numbers");
		} catch (InputMismatchException ime) {
			System.err.println("Invaild input pls enter some number");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(0);
		}
	}
}
