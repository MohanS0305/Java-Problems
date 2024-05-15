package com.firstjava.problems;

import java.util.Scanner;

public class Problem_02 {

	public static void main(String[] args) {
		// Take name as input and print a greeting message for that particular name.
		
		// take input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name :");
		// ask the input from user
		String name = input.nextLine();
		// greeting message along with name
		System.out.println("Hello " + name + ", good to see you!");
		input.close();
	}

}
