package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Volume_Of_Cylinder {

	public static void main(String[] args) {
		
		/*
		 * Volume of Cylinder
		 * 
		 * The volume of a cylinder is the amount of space there is inside a cylinder.
		 * 
		 * In order to find the volume of a cylinder we first need to find the circular
		 * area of the base.
		 * 
		 * The formula for calculating the area of a circle is:
		 * 
		 * Area = π r2
		 * 
		 * Area=π r2
		 * 
		 * We then multiply the area of the circular base by the height (or length) of
		 * the cylinder.
		 * 
		 * The formula for the volume of a cylinder is:
		 * 
		 * Volume = π r2 h Volume=π r2 h
		 */
		
		// PI value
		final float PI = (float) Math.PI;
		
		// ask the input from user
		try(Scanner input = new Scanner(System.in)) {
			// take two input from user
			// 1st input as r(radius)
			System.out.println("Enter the radius for volume of cylinder:");
			int r = input.nextInt();
			
			// 2nd input as h(height)
			System.out.println("Enter the height for volume of cylinder");
			int h = input.nextInt();
			
			// check both input is greater than zero
			if (r > 0 && h > 0) {			
				// apply the formula for volume of cylinder
				float vCylinder = PI * ((r * r) * h); 
				// print
				System.out.println("Radius: " + r + " | Height: " 
						+ h + " | volume of cylinder is " + vCylinder);
			} else { // otherwise print error message
				System.out.println("Invaild input pls enter some positive numbers");
			}
		} catch (InputMismatchException ime) { // handle input exception
			System.out.println("Invaild input pls enter some numbers");
		}
	}

}
