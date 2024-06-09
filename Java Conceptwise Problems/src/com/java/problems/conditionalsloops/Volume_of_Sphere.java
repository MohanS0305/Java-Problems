package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Volume_of_Sphere {

	public static void main(String[] args) {
		/*
		 * Volume of a sphere is the amount of space it takes up within it. The sphere
		 * is a three-dimensional round solid shape in which all points on its surface
		 * are equally spaced from its center. The fixed distance is the sphere’s
		 * radius, and the fixed point is the sphere’s center. We will notice a change
		 * in form when the circle is turned. As a result of the rotation of the
		 * two-dimensional object known as a circle, the three-dimensional shape of a
		 * sphere is obtained.
		 * 
		 * Formula for volume of sphere v = (4/3)*PI*r^3
		 */

		// declare PI value
		final float PI = (float) Math.PI;

		// ask the input from user
		try (Scanner input = new Scanner(System.in)) {
			// take input from user
			System.out.println("Enter radius for volume of sphere:");
			int r = input.nextInt();

			// check r(radius) is greater than or equal to 0
			if (r >= 0) {
				// apply formula for volume of sphere
				float volumeSphere = (float) (((4.0 / 3.0) * PI) * (Math.pow(r, 3)));
				System.out.println("R^3: " + Math.pow(r, 3));
				System.out.println("4/3 with pi value: " + (float) (4 / 3));
				// print
				System.out.println("Radius: " + r + " | volume of sphere is " + volumeSphere);
			} else { // otherwise print error message
				System.out.println("Invaild input pls enter positive numbers");
			}
		} catch (InputMismatchException ime) { // handle input exception
			System.out.println("Invaild input pls enter some numbers");
		}
	}
}
