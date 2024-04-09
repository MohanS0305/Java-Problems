package com.java.problems;

import java.util.Arrays;

public class Problem_47 {

	public static void main(String[] args) {
		/*
		 * Given a rectangular matrix of characters, add a border of asterisks(*) to it.
		 * 
		 * Example
		 * 
		 * For
		 * 
		 * picture = ["abc", "ded"] the output should be
		 * 
		 * solution(picture) = ["*****", "*abc*", "*ded*", "*****"] [input] array.string
		 * picture
		 * 
		 * A non-empty array of non-empty equal-length strings.
		 * 
		 * Guaranteed constraints: 1 ≤ picture.length ≤ 100, 1 ≤ picture[i].length ≤
		 * 100.
		 * 
		 * [output] array.string
		 * 
		 * The same matrix of characters, framed with a border of asterisks of width 1.
		 */

		String[] picture = { "abc", "ded" };
		System.out.println(Arrays.toString(solution(picture)));
	}

	private static String[] solution(String[] picture) {
		// get the array length
		int len = picture.length;
		// get the asterisks based on string character length + 2
		String astr = setAsterisks(picture[0].length());
		// create new array
		String[] temp = new String[len + 2];
		int index = 0;
		temp[0] = astr; // new array first index fill with asterisks
		// take each each element in the picture array
		for (String word : picture) {
			index++; // index increment by 1
			temp[index] = "*" + word + "*"; // before and after the word add asterisks store it in temp array
		}
		temp[index + 1] = astr; // new array last index fill with asterisks

		return temp; // finally return the temp array
	}

	private static String setAsterisks(int len) {
		String astr = "**"; // add 2 asterisks store it in astr
		// based on array length add asterisks
		for (int i = 0; i < len; i++) {
			astr += "*";
		}

		return astr; // finally return the astr
	}
}
