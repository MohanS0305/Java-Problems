package com.java.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_68 {

	public static void main(String[] args) {
		/*
		 * Count items matching a rule
		 * 
		 * You are given an array items, where each items[i] = [typei, colori, namei]
		 * describes the type, color, and name of the ith item. You are also given a
		 * rule represented by two strings, ruleKey and ruleValue.
		 * 
		 * The ith item is said to match the rule if one of the following is true:
		 * 
		 * ruleKey == "type" and ruleValue == typei. ruleKey == "color" and ruleValue ==
		 * colori. ruleKey == "name" and ruleValue == namei. Return the number of items
		 * that match the given rule.
		 * 
		 * Example 1:
		 * 
		 * Input: items =
		 * [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold",
		 * "iphone"]], ruleKey = "color", ruleValue = "silver" Output: 1 Explanation:
		 * There is only one item matching the given rule, which is
		 * ["computer","silver","lenovo"]. Example 2:
		 * 
		 * Input: items =
		 * [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold",
		 * "iphone"]], ruleKey = "type", ruleValue = "phone" Output: 2 Explanation:
		 * There are only two items matching the given rule, which are
		 * ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item
		 * ["computer","silver","phone"] does not match.
		 * 
		 * Constraints:
		 * 
		 * 1 <= items.length <= 104 1 <= typei.length, colori.length, namei.length,
		 * ruleValue.length <= 10 ruleKey is equal to either "type", "color", or "name".
		 * All strings consist only of lowercase letters.
		 */

		List<List<String>> items = new ArrayList<>();
		items.add(Arrays.asList("phone", "blue", "pixel"));
		items.add(Arrays.asList("computer", "silver", "lenovo"));
		items.add(Arrays.asList("phone", "gold", "iphone"));

		String ruleKey = "color";
		String ruleValue = "silver";

		System.out.println(countMatches(items, ruleKey, ruleValue));
	}

	private static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		// check ruleKey is type
		if (ruleKey.equals("type")) {
			return ruleValueCount(items, ruleValue, 0);
		} else if (ruleKey.equals("color")) { // check ruleKey is color
			return ruleValueCount(items, ruleValue, 1);
		} else { // check ruleKey is of name
			return ruleValueCount(items, ruleValue, 2);
		}
	}

	private static int ruleValueCount(List<List<String>> items, String ruleValue, int index) {
		// get the length for items list
		int len = items.size();
		// declare count for count the matching rule items
		int count = 0;
		// based on length iterate the loop
		for (int i = 0; i < len; i++) {
			// check ruleValue is of ruleKey
			if (items.get(i).get(index).equals(ruleValue)) {
				count++; // increment count by 1
			}
		}
		return count;
	}

}
