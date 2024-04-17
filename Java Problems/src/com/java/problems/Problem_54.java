package com.java.problems;

public class Problem_54 {

	public static void main(String[] args) {
		/*
		 * An IP address is a numerical label assigned to each device (e.g., computer,
		 * printer) participating in a computer network that uses the Internet Protocol
		 * for communication. There are two versions of the Internet protocol, and thus
		 * two versions of addresses. One of them is the IPv4 address.
		 * 
		 * Given a string, find out if it satisfies the IPv4 address naming rules.
		 * 
		 * Example
		 * 
		 * For inputString = "172.16.254.1", the output should be solution(inputString)
		 * = true;
		 * 
		 * For inputString = "172.316.254.1", the output should be solution(inputString)
		 * = false.
		 * 
		 * 316 is not in range [0, 255].
		 * 
		 * For inputString = ".254.255.0", the output should be solution(inputString) =
		 * false.
		 * 
		 * There is no first number.
		 */
		System.out.println(solution("172.316.254.1"));
	}
	
	private static boolean solution(String inputString) {
		// IP address should be this pattern
		String ipPattern = "25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9]";
		// split the string based on dot
		String[] ips = inputString.split("[.]");
		// check ips length is not equal to 4
		if (ips.length != 4) {
			return false; // just return false;
		}
		// take each number String
		for (String ip : ips) {
			// check if the number string not matches the above pattern
			if (!ip.matches(ipPattern)) {
				return false; // return false
			}
		}
		return true; // otherwise return true
	}
}
