package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Volume_Of_Pyramid {

	public static void main(String[] args) {
		/*
		 * Volume Of Pyramid
		 * 
		 * The volume of a pyramid is the amount of space enclosed within its surfaces.
		 * It is calculated as one-third of the product of the area of the base and the
		 * height of the pyramid.
		 * Formula for volume of pyramid v = ((l * w * h) 1 / 3))
		 */	
		
		// ask the input from user
		try(Scanner input = new Scanner(System.in)) {
			// take three input from user
			// 1st input as l(length)
			System.out.println("Enter the length for volume of pyramid:");
			int l = input.nextInt();
			
			// 2nd input as w(width)
			System.out.println("Enter the width for volume of pyramid");
			int w = input.nextInt();
			
			// 3rd input as h(height)
			System.out.println("Enter the height for volume of pyramid");
			int h = input.nextInt();
			
			// check three input is greater than zero
			if (l > 0 && w > 0 && h > 0) {
				// apply formula for volume of pyramid
				int volumePyramid = (l * w * h) / 3; 
				
				// print the value
				System.out.println("Length: " + l + " | width: " + w 
						+ " | Height: " + h + " | volume of pyramid is " 
						+ volumePyramid);
			} else { // otherwise print error message
				System.out.println("Invaild input pls enter some positive numbers");
			}
		} catch (InputMismatchException ime) {
			System.out.println("Invaild input pls enter some numbers");
		}
		
		
		// handle input exception as well
	}
}
