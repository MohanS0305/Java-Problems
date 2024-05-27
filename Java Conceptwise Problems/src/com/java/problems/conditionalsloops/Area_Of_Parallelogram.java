package com.java.problems.conditionalsloops;

import java.util.Scanner;

public class Area_Of_Parallelogram {

	public static void main(String[] args) {
		// Area Of Parallelogram
		
		// The area of a parallelogram is calculated by multiplying
		// the base of a parallelogram times its perpendicular height.
		// Formula for parallelogram A = base * height
		
		// ask the user input
		Scanner input = new Scanner(System.in);
		// take 2 input from user
		System.out.println("Enter the base: ");
		// 1st input as base
		int b = input.nextInt();
		System.out.println("Enter the height: ");
		// 2nd input as height
		int h = input.nextInt();
		
		if (b >= 0 && h >= 0) {			
			// apply parallelogram formula
			int areaPalgrm = b * h; 
			// print
			System.out.println("Area of parallelogram base: " 
					+ b + " | height: " + h + " parallelogram is " + areaPalgrm);
		} else {
			System.out.println("Invalid Input Base and height must be positive numbers");
		}
		input.close();
	}

}
