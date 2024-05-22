package com.java.problems.firstjava;

import java.util.Scanner;

public class Problem_03 {

	public static void main(String[] args) {
		// Write a program to input principal, time, and rate (P, T, R) from the user
		// and find Simple Interest.

		// ask input from user
		Scanner input = new Scanner(System.in);
		// take the input from user
		System.out.println("Enter the simple interest principle here :");
		// P is the initial amount of money.
		int p = input.nextInt();
		System.out.println("Enter the simple interest rate here :");
		// R is the rate of interest per year, usually given as a percentage.
		float r = input.nextFloat();
		System.out.println("Enter the simple interest time here :");
		// T is the time duration for which the money is borrowed or invested, usually given in years.
		int t = input.nextInt();

		// formula for simpleInterest is SI = P x R x T / 100
		int si = (int) (p * r * t) / 100;
		System.out.println(si);
		input.close();
	}

}
