package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Perimeter_Of_Rhombus {

	public static void main(String[] args) {
		// Perimeter Of Rhombus
		// sum of all 4 sides or 4 * a

		// ask input from user
		try (Scanner input = new Scanner(System.in)) {
			// take input from user
			System.out.println("Enter the side:");
			int a = input.nextInt();
			// check the a(side) is greater than zero
			if (a > 0) {
				// apply the formula for perimeter of rhombus
				int p = 4 * a;
				// print
				System.out.println("Side: " + a + " | perimeter of rhomus is " + p);
			} else { // otherwise print error message
				System.out.println("Invaild input pls enter positive numbers");
			}
		} catch (InputMismatchException ime) {
			System.out.println("Invaild input pls enter some numbers");
		}
	}
}
