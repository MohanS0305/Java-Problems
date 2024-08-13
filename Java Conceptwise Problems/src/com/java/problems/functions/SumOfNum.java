package com.java.problems.functions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {

		// create scanner for input
		try (Scanner input = new Scanner(System.in)) {
			// ask first input from user
			System.out.println("Enter the first number:");
			// take first input from user
			int num1 = input.nextInt();

			// ask second input from user
			System.out.println("Enter the second number:");
			// take second input from user
			int num2 = input.nextInt();

			// call sumNum() method
			int result = sumNum(num1, num2);
			// print the sum
			System.out.println("Sum of two numbers is " + result);

		} catch (InputMismatchException ime) {
			System.err.println("Invaild input pls enter numbers");
		}
	}

	private static int sumNum(int num1, int num2) {
		// add the num1 & num2 and then return it
		return num1 + num2;
	}
}
