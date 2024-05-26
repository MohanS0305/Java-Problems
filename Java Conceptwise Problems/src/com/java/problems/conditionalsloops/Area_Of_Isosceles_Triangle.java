package com.java.problems.conditionalsloops;

import java.util.Scanner;

public class Area_Of_Isosceles_Triangle {

	public static void main(String[] args) {
		// Area of Isosceles triangle
		// An isosceles triangle is a special type of triangle with two sides of equal
		// length.
		// This property can be leveraged to derive the height and subsequently
		// calculate the area.
		// Formula for Find the height
		/*
		 * Find the height h using the Pythagorean theorem: h = a^2 - (b / 2)^2 and sqrt
		 * of above value Area = b * h / 2
		 */

		// ask the input from user
		Scanner input = new Scanner(System.in);
		// take 2 input from user
		System.out.println("Enter the base of isosceles triangle:");
		// 1st input as base
		int b = input.nextInt();
		// 2nd input as sides
		System.out.println("Enter the equal sides of isosceles triangle");
		int a = input.nextInt();
		// check base and sides both are greater than or equal to 0
		if (b >= 0 && a >= 0) {
			// apply the formula for height sqrt(a^2 - (b / 2)^2)
			int h = a * a - ((b / 2) * (b / 2));
			h = (int) Math.sqrt(h); // find the square root of height
			// take the height and apply the area of triangle
			// formula A = (b * h) / 2
			int area = (b * h) / 2;
			// print it
			System.out.println("Area of Isosceles triangle base: " + b + " | sides: " + a + " | area is " + area);
		} else {
			System.out.println("Ivalid Input pls enter the positive integer");
		}
		input.close();
	}

}
