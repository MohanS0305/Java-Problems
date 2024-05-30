package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Perimeter_Of_Circle {

	public static void main(String[] args) {
		// Perimeter Of Circle
		/*
		 * Circumference of the circle or perimeter of the circle is the measurement of
		 * the boundary of the circle. Whereas the area of circle defines the region
		 * occupied by it. If we open a circle and make a straight line out of it, then
		 * its length is the circumference. It is usually measured in units, such as cm
		 * or unit m.
		 */
		// Formula for perimeter 2pir
		final float PI = 3.14f;
		// ask the input from user
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the radius:");
			// take input from user
			float r = input.nextFloat();
			// check the input is greater than or equal to zero
			if (r >= 0) {
				// apply the formula for perimeter
				float c = 2 * PI * r;
				// print
				System.out.println("Perimeter of Circle radius: " + r + " Circumference: " + c);
			} else {
				// else print error message
				System.out.println("Perimeter calculation is not valid for a negative radius");
			}
		} catch(InputMismatchException ime) {
			System.out.println("Invaild Input pls enter some numbers");
		}

	}

}
