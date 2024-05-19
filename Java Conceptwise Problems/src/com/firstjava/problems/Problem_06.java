package com.firstjava.problems;

import java.util.Scanner;

public class Problem_06 {

	public static void main(String[] args) {
		// Input currency in rupees and output in USD.
		
		// if you want to convert INR in USD 
		// use this formula INR * Exchange rate
		// 1rs is 0.012usDoller | 1 * 0.012 = 0.012 USD
		
		// ask input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the rupees :");
		// take input from user
		double rupee = input.nextDouble();
		// multiply rupee * exchangeRate(0.012)
		double USD = rupee * 0.012;
		System.out.println(String.format("%.2f", rupee) + " Rs in USD " + String.format("%.2f", USD));
		input.close();
	}
}
