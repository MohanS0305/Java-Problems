package com.java.problems;
import java.util.Scanner;
public class Problem_8 {

	public static void main(String[] args) {
		
		/*
		 * Debug this code - Why is this code incorrect So as you solve programming
		 * problems - you will need to debug and find errors in your own code.
		 * 
		 * Task You are given a program which does the following
		 * 
		 * Accepts the count of test cases - t - in the 1st line The only line of each
		 * test case consists of an integer N For each test case, output to the console
		 * the value that is double the integer N Can you try and debug / fix the error
		 * in the given program?
		 * input
		 * 3
         * 1
         * 2
         * 3
         * output
         * 2
         * 4
         * 6
		 */
		
		Scanner read = new Scanner(System.in);
        int t = read.nextInt(); // change next() to nextInt()
        
        for(int i=0; i<t; i++)
        {
            int n = read.nextInt(); // add semicolon to end of this statement
            System.out.println(n*2);
        }
        read.close();
	}

}
