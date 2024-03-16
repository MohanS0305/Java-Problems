package com.java.problems;

import java.util.Scanner;

public class Problem_20 {

	public static void main(String[] args) {
		
		/*
		 * In ChefLand, human brain speed is measured in bits per second (bps). Chef has
		 * a threshold limit of X bits per second above which his calculations are prone
		 * to errors. If Chef is currently working at Y bits per second, is he prone to
		 * errors?
		 * 
		 * If Chef is prone to errors print YES, otherwise print NO.
		 * 
		 * Input Format The only line of input contains two space separated integers X
		 * and Y — the threshold limit and the rate at which Chef is currently working
		 * at.
		 * 
		 * Output Format If Chef is prone to errors print YES, otherwise print NO. You
		 * may print each character of the string in uppercase or lowercase (for
		 * example, the strings yes, Yes, yEs, and YES will all be treated as
		 * identical). Constraints 1≤X,Y≤100 sample input 7 9 sample output YES
		 */
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); // chef threshold limit is x bits per second
		int y = sc.nextInt(); // chef is currently working at y bits per second
		if (x < y) { // threshold limit x is < than to currently working at y
		    System.out.println("YES"); // print yes
		} else {
		    System.out.println("NO"); // print no
		}
		sc.close();
	}
}
