package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Perimeter_Of_Rectangle {

	public static void main(String[] args) {
		/*
		 * Perimeter of Rectangle
		 * 
		 * The perimeter (P) of a rectangle is the total length of all the sides of the
		 * rectangle. Since the opposite sides of a rectangle are equal, a rectangle has
		 * two equal lengths and two equal widths. The formula for the perimeter of a
		 * rectangle is given below: Perimeter = length + length + width + width. P = l
		 * + l + w + w.
		 */

		// ask the input from user
		try (Scanner input = new Scanner(System.in)) {
			// take input from user
			System.out.println("Enter the length:");
			// 1st input as l(length)
			int l = input.nextInt();

			System.out.println("Enter the width:");
			// 2nd input as w(width)
			int w = input.nextInt();

			// check l and w both are greater than zero
			if (l > 0 && w > 0) {
				// apply formula for perimeter of rectangle
				int perimeterRectangle = 2 * (l + w);

				// print
				System.out.println(
						"length: " + l + " | width: " + w + " | Perimeter of rectangle is " + perimeterRectangle);
			} else {
				// otherwise print some error message
				System.out.println("Invaild input pls enter positive numbers");
			}

		} catch (InputMismatchException ime) {
			System.out.println("Invaild input pls enter some numbers");
		}
	}
}
