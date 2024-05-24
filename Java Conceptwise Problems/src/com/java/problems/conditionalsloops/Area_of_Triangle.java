package com.java.problems.conditionalsloops;

import java.util.Scanner;

public class Area_of_Triangle {

	public static void main(String[] args) {
		// Area of triangle
		// Formula for Area of a Triangle = A = ½ (b × h) square units.

		// ask the input from user
		Scanner input = new Scanner(System.in);
		// take 2 input from user
		System.out.println("Enter the base :");
		// 1st input for base (horizontal length of triangle)
		int base = input.nextInt();
		System.out.println("Enter the height :");
		// 2nd input for height (height of the triangle)
		int height = input.nextInt();

		if (base >= 0 && height >= 0) {
			// apply area of triangle formula
			int result = (base * height) / 2;
			// print the result
			System.out.println("Area of triangle for base is " + base + " and height is " + height + " = " + result);
		} else {
			System.out.println("Invalid Input pls enter positive integer");
		}
		input.close();
	}

}
