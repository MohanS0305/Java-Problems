package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Perimeter_Of_Square {

	public static void main(String[] args) {
		/*
		 * Perimeter Of Square
		 * 
		 * Since all of the sides of a square are the same length, they are all 4-inches
		 * long. To find the perimeter, you have to add together the lengths of each
		 * side. You could also multiply 4 sides by 4 inches per side. Either way, the
		 * result is 16 inches and the perimeter is, therefore, 16 inches. formula for
		 * perimeter of square is p = 4 * a or (a + a + a + a)
		 */

		// ask the input from user
		try (Scanner input = new Scanner(System.in)) {
			// take input from user
			System.out.println("Enter the side of square:");
			int a = input.nextInt();
			// check a(side) is greater than zero
			if (a > 0) {
				// apply formula for perimeter of square p = 4 * a
				int perimeterSquare = 4 * a;
				// print
				System.out.println("Side: " + a + " | perimeter of square is " + perimeterSquare);
			} else { // otherwise print error message
				System.out.println("Invaild input pls enter positive numbers");
			}
		} catch (InputMismatchException ime) {
			System.out.println("Invaild input pls enter some numbers");
		}
	}
}
