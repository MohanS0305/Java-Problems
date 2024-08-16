package com.java.problems.functions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {

		// create scanner object for input
		try (Scanner input = new Scanner(System.in)) {
			// ask the input from user
			System.out.println("How many numbers do you want to enter?");
			// take the input from user
			int size = input.nextInt();

			if (size <= 0) {
				System.err.println("Size must be greater than zero.");
				return;
			}

			// based on input create an array
			int[] numbers = new int[size];

			System.out.println("Enter " + size + " numbers:");

			// iterate through elements
			for (int i = 0; i < size; i++) {
				// take the input store it in each index
				numbers[i] = input.nextInt();
			}

			// call removeDuplicate()
			int[] result = removeDuplicate(numbers);

			// print it
			System.out.println("Original Array: " + Arrays.toString(numbers));
			System.out.println("Array without duplicates: " + Arrays.toString(result));
		} catch (InputMismatchException ime) {
			System.err.println("Invalid input. Please enter valid numbers.");
		}
	}

	// create removeDuplicate method
	private static int[] removeDuplicate(int[] arr) {
		// get the array length
		int arrLen = arr.length;

		// create a new array to store unique elements
		int[] resultArray = new int[arrLen];
		int index = 0;

		// iterate over the array
		for (int i = 0; i < arrLen; i++) {
			boolean isDuplicate = false;

			// check if the element is a duplicate
			for (int j = 0; j < index; j++) {
				if (arr[i] == resultArray[j]) {
					isDuplicate = true;
					break;
				}
			}

			// if not a duplicate, add it to the result array
			if (!isDuplicate) {
				resultArray[index++] = arr[i];
			}
		}

		// trim the result array to the correct size
		return Arrays.copyOf(resultArray, index);
	}
}
