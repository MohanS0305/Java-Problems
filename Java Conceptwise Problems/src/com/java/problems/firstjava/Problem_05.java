package com.java.problems.firstjava;

import java.util.Scanner;

public class Problem_05 {

	public static void main(String[] args) {
		// Take 2 numbers as input and print the largest number.
		
		// ask input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 1st no :");
		// take input from user
		int n1 = input.nextInt();
		System.out.println("Enter the 2nd no :");
		// take input from user
		int n2 = input.nextInt();
		
		if (n1 > n2) { // check number1 is grater than number2
			// print n1
			System.out.println(n1);
		} else { // otherwise
			// print n2
			System.out.println(n2);
		}
		input.close();
	}

}
