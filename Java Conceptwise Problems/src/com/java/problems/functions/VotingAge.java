package com.java.problems.functions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VotingAge {

	public static void main(String[] args) {

		// create scanner for input
		try (Scanner input = new Scanner(System.in)) {
			// ask the input(age) from user
			System.out.println("Enter your age = ");

			// take input(age) from user
			int age = input.nextInt();

			// check input(age) is greater than or equal to 18
			if (age >= 18) {
				// print eligible for vote
				System.out.println("You are eligible for vote.");
			} else {
				// otherwise print not eligible for vote
				System.out.println("You are not eligible for vote.");
			}

		} catch (InputMismatchException ime) { // handle exception
			System.err.println("Invaild input pls enter numbers");
		}

	}

}
