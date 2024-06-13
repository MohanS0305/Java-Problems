package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Total_Surface_Area_Of_Cube {

	public static void main(String[] args) {
		/*
		 * Total_Surface_Area_Of_Cube
		 * 
		 * Surface area of cube is the sum of areas of all the faces of cube, that
		 * covers it. The formula for surface area is equal to six times of square of
		 * length of the sides of cube. It is represented by 6a2, where a is the side
		 * length of cube.It is basically the total surface area.
		 * formula for this 6a^2
		 */	
		
		// ask the input from user
		try(Scanner input = new Scanner(System.in)) {
			// take input from user
			System.out.println("Enter the side of cube:");
			int a = input.nextInt();
			
			// check input is greater than or equal to zero
			if (a >= 0) {
				// apply formula for total surface area of cube
				int totalSurfaceArea = (int) (6 * Math.pow(a, 2));
				// print it.
				System.out.println("Side of cube: " + a 
						+ " | total surface area is " + totalSurfaceArea);
			} else { // otherwise print error message
				System.err.println("Invaild input pls enter some positive numbers");
			} 
		} catch (InputMismatchException ime) { // handle the exception as well.
			System.err.println("Invaild input pls enter some numbers");
		}
	}
}
