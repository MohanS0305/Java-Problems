package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Volume_Of_Cone {

	public static void main(String[] args) {
		/*
		 * Volume Of A Cone
		 * 
		 * The volume of a cone is the amount of space inside a cone.
		 * 
		 * The volume of a cone is one third of the volume of a cylinder. The volume of
		 * a cone can be calculated using a formula.
		 * 
		 * To do this, we substitute two of the dimensions of the cone into the volume
		 * formula and evaluate the result.
		 * 
		 * The volume formula for any cone is
		 * 
		 * Volume= 1/3πr2h
		 */

		// ask the input from user
		try (Scanner input = new Scanner(System.in)) {
			// take the two input from user
			System.out.println("Enter the radius for volume of cone:");
			// 1st input is r(radius)
			int r = input.nextInt();

			System.out.println("Enter the height for volume of cone:");
			// 2nd input is h(height)
			int h = input.nextInt();

			final float PI = 3.14f;

			// check both r and h greater than or equal to zero
			if (r >= 0 && h >= 0) {
				// apply the formula for volume of cone Volume= 1/3πr2h
				float volume = (PI * ((r * r) * h)) / 3;
				// print
				System.out.println("Radius: " + r + " | Height: " + h + " | volume of cone is " + volume);
			} else { // otherwise print error message
				System.out.println("Invaild input pls enter positive numbers");
			}
		} catch (InputMismatchException ime) { // handle exception as well
			System.out.println("Invaild input pls enter some numbers");
		}
	}

}
