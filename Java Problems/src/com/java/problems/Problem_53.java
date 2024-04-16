package com.java.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_53 {

	public static void main(String[] args) {
		// remove duplicate element in a array
		// make sure it's case-sensitive
		String[] a = { "sam", "ram", "alex", "mohan", "kishore", "MOHAN", "Sam" };
		System.out.println(Arrays.toString(removeDuplicate(a)));
	}

	private static String[] removeDuplicate(String[] a) {
		// get the array length
		int len = a.length;
		// convert all the element in lower case
		// create one empty array list for store dynamically
		List<String> uniqueElement = new ArrayList<>();
		// based on length iterate the loop
		for (int i = 0; i < len; i++) {
			if (uniqueElement.contains(a[i])) {
			} else
				uniqueElement.add(a[i]);
		}

		// get the array list length
		int uLen = uniqueElement.size();
		// create one string array length of array list length
		String[] unique = new String[uLen];
		// starting index is 0
		int index = 0;
		// take each element in array list store it in string array
		for (String u : uniqueElement) {
			unique[index] = u;
			index++; // increment index by 1
		}

		return unique; // finally return unique element in a string array
	}

}
