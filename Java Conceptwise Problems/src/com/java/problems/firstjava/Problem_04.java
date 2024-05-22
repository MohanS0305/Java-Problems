package com.java.problems.firstjava;

import java.util.Scanner;

public class Problem_04 {

	public static void main(String[] args) {
		// Take in two numbers and an operator (+, -, *, /) and calculate the value.
		// (Use if conditions)
		
		// ask the input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 1st no :");
		// take input from user
		int n1 = input.nextInt();
		System.out.println("Enter the 2nd no :");
		int n2 = input.nextInt();
		System.out.println("Enter any operator from one of these +, -, *, /");
		char userCh = input.next().trim().charAt(0);
		// based on user operator perform calculation
		if (userCh == '+') {
			System.out.println(String.format("Addition of %d & %d is %d", n1,n2, n1+n2));
		} else if (userCh == '-') {
			System.out.println(String.format("Subtraction of %d & %d is %d", n1,n2, n1-n2));
		} else if (userCh == '*') {
			System.out.println(String.format("Multiplication of %d & %d is %d", n1,n2, n1*n2));
		} else if (userCh == '/') {
			System.out.println(String.format("Division of %d & %d is %d", n1,n2, n1/n2));
		} else {
			System.out.println("Pls enter correct choice.");
		}
		input.close();
	}

}
