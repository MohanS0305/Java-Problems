package com.java.problems.conditionalsloops;

import java.util.Scanner;

public class Area_Of_Rectangle {

	public static void main(String[] args) {
		// Area Of Rectangle
		// formula for area of rectangle A = l*b (length * breath(width))

		// ask the input from user
		Scanner input = new Scanner(System.in);
		// take 2 input from user
		// 1st input is length
		System.out.println("Enter the length");
		int l = input.nextInt();
		// 2nd input is breath
		System.out.println("Enter the breath");
		int b = input.nextInt();

		if (l >= 0 && b >= 0) {
			// apply the area of rectangle formula
			int areaRect = l * b;
			// print it
			System.out.println("Area of Rectangle for length: " + l + " and width: " + b + " is " + areaRect);
		} else {
			System.out.println("Invalid Input pls enter positive integer");
		}
		input.close();
	}

}
