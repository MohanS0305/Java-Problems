package com.java.problems.firstjava;

import java.util.Scanner;

public class Problem_01 {

	public static void main(String[] args) {
		/* Write a program to print whether a number is even or odd, 
		 also take input from the user.*/
		
		// take input from user
		Scanner input = new Scanner(System.in);
		// ask input from user
		System.out.println("Enter the number :");
		int no = input.nextInt();
		// check the no is even or not
		if (no % 2 == 0) { // no is divisible by 2 it's even no
			System.out.println(no + " is even number");
		} else {
			System.out.println(no + " is odd number"); // otherwise odd no
		}
		input.close();
	}

}
