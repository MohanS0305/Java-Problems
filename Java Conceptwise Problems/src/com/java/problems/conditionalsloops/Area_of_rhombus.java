package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area_of_rhombus {

	public static void main(String[] args) {
		/*
		 * Area of rhombus The area of a rhombus can be calculated using its base and
		 * height with the help of the formula, Area of rhombus = base × height. Another
		 * way to find the area of a rhombus is using its diagonals. So, this formula is
		 * expressed as, Area of rhombus = ½ × d1 × d2, where d1 and d2 are the lengths
		 * of the diagonals.
		 */
		// formula for area of rhombus Area = d1 * d2 / 2

		// ask the user input
		try (Scanner input = new Scanner(System.in)) {
			// take 2 input from user
			// 1st input as d1(diagonal1)
			System.out.println("Enter the diagonal1:");
			int d1 = input.nextInt();
			// 2nd input as d2(diagonal2)
			System.out.println("Enter the diagonal2:");
			int d2 = input.nextInt();
			// check d1 & d2 both are positive integer
			if (d1 >= 0 & d2 >= 0) {
				// apply the formula
				int area = d1 * d2 / 2;
				// print
				System.out.println("Area of rhombus d1: " + d1 + " | d2: " + d2 + " rhombus is " + area);
			} else {
				System.out.println("Invalid Input pls enter positive number");
			}
		} catch (InputMismatchException ime) {
			System.out.println("Invalid input diagonals must be numeric");
		}

	}

}
