package com.java.problems.conditionalsloops;

import java.util.Scanner;

public class Area_of_Circle {

	public static void main(String[] args) {
		// Area of circle
		// formula for area of circle pi*r*r

		// ask the user input
		Scanner input = new Scanner(System.in);
		// take the radius as input
		System.out.println("Enter the radius:");
		float r = input.nextFloat();
		if (r > 0) { // check radius is greater than 0
			float area = areaOfCircle(r); // call areaOfCircle
			System.out.println("Area of circle for: " + r + " is " + area);
		} else { // otherwise
			System.out.println("Invalid input");
		}
		input.close();
	}

	// method for find area of circle
	private static float areaOfCircle(float r) {
		// apply the formula
		final float PI = 3.14159f;
		float area = PI * r * r;
		return area;
	}

}
