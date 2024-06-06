package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Volume_Of_Prism {

	public static void main(String[] args) {
		/*
		 * Volume of Prism
		 * 
		 * The volume of a prism is defined as the total space occupied by the
		 * three-dimensional object. Mathematically, it is defined as the product of the
		 * area of the base and the length. Therefore, The volume of a Prism = Base Area
		 * × Length.
		 */

		// ask the input from user
		try (Scanner input = new Scanner(System.in)) {
			// take two input from user
			// 1st input as b(base)
			System.out.println("Enter the base for volume of prism:");
			int b = input.nextInt();

			// 2nd input as h(height)
			System.out.println("Enter the height for volume of prism");
			int h = input.nextInt();

			// check both b and h greater than or equal to zero
			if (b >= 0 && h >= 0) {
				// apply formula for volume of prism
				int volumeOfPrism = b * h;
				// print
				System.out.println("Base: " + b + " | Height: " 
				+ h + " | volume of prism is " + volumeOfPrism + " cubic units");
			} else { // otherwise print error message
				System.out.println("Invaild input pls enter some positive numbers");
			}
		} catch (InputMismatchException ime) { // handle exception
			System.out.println("Invaild input pls enter some number");
		}
	}
}
