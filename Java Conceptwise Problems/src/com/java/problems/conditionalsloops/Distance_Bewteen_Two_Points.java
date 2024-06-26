package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Distance_Bewteen_Two_Points {

	public static void main(String[] args) {
		// create scanner object for input
		try(Scanner input = new Scanner(System.in)) {
			// ask input from user
			System.out.println("Point 1");
			// take 4 input from user
			System.out.println("Enter x1:");
			// 1st input as x1
			int x1 = input.nextInt();

			// 2nd input as y1
			System.out.println("Enter y1:");
			int y1 = input.nextInt();

			System.out.println("Point 2");
			// 3rd input as x2
			System.out.println("Enter x2:");
			int x2 = input.nextInt();

			// 4th input as y2
			System.out.println("Enter y2:");
			int y2 = input.nextInt();

			// apply formula for finding two points
			int distance = (int) Math.sqrt(Math.pow((x2 - x1), 2) 
					+ Math.pow((y2 - y1), 2));
			System.out.println("Two points: (" + x1 + ", " + y1 
					+ ") and (" + x2 + ", " + y2 + ")");
			System.out.println("Distance: " + distance);	
		} catch (InputMismatchException ime) { // handle exception
			System.err.println("Invaild input from user pls "
					+ "enter some numbers");
		}
	}
}
