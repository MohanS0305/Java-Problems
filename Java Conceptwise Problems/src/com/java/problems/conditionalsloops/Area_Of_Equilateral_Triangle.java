package com.java.problems.conditionalsloops;

import java.util.Scanner;

public class Area_Of_Equilateral_Triangle {

	public static void main(String[] args) {
		/*
		 * Area of Equilateral Triangle
		 * 
		 * The area of an equilateral triangle is the region occupied by it in a
		 * two-dimensional plane. The formula for the area of an equiangular triangle is
		 * given by:
		 * 
		 * A = √3a2/4
		 */

		// ask the input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the base for equilateral triangle");
		// take input from user
		int b = input.nextInt();
		// check if base(side) is greater than zero
		if (b > 0) {
			// apply formula for equilateral triangle
			float area = (float) (Math.sqrt(3) * Math.pow(b, 2)) / 4;
			// print
			System.out.println("Area of equilateral triangle base: " 
			+ b + " | area is " + area);
		} else {
			System.out.println("Invalid Input pls enter positive numbers");
		}
		input.close();
	}

}
