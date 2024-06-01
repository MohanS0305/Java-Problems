package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Perimeter_Of_Equilateral_Triangle {

	public static void main(String[] args) {

		// Perimeter Of Equilateral Triangle

		/*
		 * An equilateral triangle's perimeter is the sum of its three sides. P = 3a is
		 * the basic formula for calculating the perimeter of an equilateral triangle,
		 * where 'a' denotes one of the triangle's sides. The sum becomes a + a + a = 3a
		 * since all three sides of an equilateral triangle are equal.
		 */

		// ask the input from user
		try (Scanner input = new Scanner(System.in)) {
			// take the input from user
			System.out.println("Enter the side: ");
			int a = input.nextInt();
			// check whether the input greater than zero
			if (a > 0) {
				// apply the perimeter of equilateral triangle formula (P = 3a)
				int p = a + a + a;
				// print
				System.out.println("Perimeter of equilateral triangle a: " + a + " | perimeter is " + p);
			} else { // otherwise print error message
				System.out.println("Invaild input pls enter positive numbers");
			}
		} catch (InputMismatchException ime) {
			System.out.println("Invaild input pls enter number input");
		}

	}

}
