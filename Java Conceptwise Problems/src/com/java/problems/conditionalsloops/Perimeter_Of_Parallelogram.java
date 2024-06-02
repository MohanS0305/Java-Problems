package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Perimeter_Of_Parallelogram {

	public static void main(String[] args) {
		// Perimeter Of Parallelogram

		/*
		 * The perimeter is the sum of the length of all the 4 sides. The perimeter of a
		 * parallelogram is the total distance outside the geometrical shape. The
		 * opposite sides of a parallelogram are equal and so the perimeter becomes
		 * twice the sum of two parallel sides say a and b. formula for perimeter of
		 * parallelogram is P = 2(a + b)
		 */

		// ask the input from user
		try (Scanner input = new Scanner(System.in)) {
			// take the 2 input from user
			System.out.println("Enter the side of parallelogram:");
			// 1st input as a(side)
			int a = input.nextInt();

			System.out.println("Enter the base of parallelogram:");
			// 2nd input as b(base or width)
			int b = input.nextInt();

			// check both a and b greater than zero
			if (a > 0 && b > 0) {
				// apply the formula for perimeter of parallelogram p = 2(a+b)
				int p = 2 * (a + b);

				// print
				System.out.println(
						"Perimeter of parallelogram side: " + a + " | base: " + b + " | parallelogram is: " + p);
			} else { // otherwise print error message
				System.out.println("Invalid input pls enter positive number");
			}
		} catch (InputMismatchException ime) {
			System.out.println("Invalid input pls enter numbers");
		}
	}
}
