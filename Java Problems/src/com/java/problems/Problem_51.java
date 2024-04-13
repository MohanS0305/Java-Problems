package com.java.problems;

public class Problem_51 {

	public static void main(String[] args) {
		/*
		 * Call two arms equally strong if the heaviest weights they each are able to
		 * lift are equal.
		 * 
		 * Call two people equally strong if their strongest arms are equally strong
		 * (the strongest arm can be both the right and the left), and so are their
		 * weakest arms.
		 * 
		 * Given your and your friend's arms' lifting capabilities find out if you two
		 * are equally strong.
		 * 
		 * Example
		 * 
		 * For yourLeft = 10, yourRight = 15, friendsLeft = 15, and friendsRight = 10,
		 * the output should be solution(yourLeft, yourRight, friendsLeft, friendsRight)
		 * = true; For yourLeft = 15, yourRight = 10, friendsLeft = 15, and friendsRight
		 * = 10, the output should be solution(yourLeft, yourRight, friendsLeft,
		 * friendsRight) = true; For yourLeft = 15, yourRight = 10, friendsLeft = 15,
		 * and friendsRight = 9, the output should be solution(yourLeft, yourRight,
		 * friendsLeft, friendsRight) = false.
		 */
		System.out.println(solution(15, 10, 15, 10));
	}
	
	private static boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
		// get your arm max weight
		int yours = Math.max(yourLeft, yourRight);
		// get friends arm max weight
		int friends = Math.max(friendsLeft, friendsRight);
		// check both max weight are equal or not
		if (yours != friends) { // not equal
			return false; // return false
		}
		// add your both arm and add friends both arm
		// your arm and friends arm both weight are equal return true
		return yourLeft + yourRight == friendsLeft + friendsRight; 
	}
}
