package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Curved_Surface_Area_Of_Cylinder {

	public static void main(String[] args) {
		/*
		 * Curved Surface Area Of Cylinder
		 * 
		 * The curved surface area of a cylinder (CSA) is defined as the area of the
		 * curved surface of any given cylinder having a base radius 'r', and height
		 * 'h', It is also termed as Lateral Surface Area (LSA). The formula for a
		 * curved area or lateral area is given by: CSA or LSA = 2π × r × h Square
		 * units.
		 */

		final double PI = Math.PI;
		// ask the input from user
		try (Scanner input = new Scanner(System.in)) {
			// take two input from user
			// 1st input as r(radius)
			System.out.println("Enter the radius of base of the cylinder");
			int r = input.nextInt();

			// 2nd input as h(height)
			System.out.println("Enter the height of the cylinder");
			int h = input.nextInt();

			// check both input greater than or equal to zero
			if (r >= 0 && h >= 0) {
				// apply formula for CSA
				float CSACylinder = (float) (2 * PI) * (r * h);
				// print it
				System.out.println(
						"Radius: " + r + " | Height: " + h 
						+ " | curved surface area of cylinder is " + CSACylinder);
			} else { // otherwise print error message
				System.out.println("Invaild input pls enter some positive numbers");
			}
		} catch (InputMismatchException ime) { // handle exception as well
			System.out.println("Invalid input pls enter some numbers");
		}
	}
}
