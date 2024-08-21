package com.java.problems.functions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		
		try (// get the scanner
		Scanner input = new Scanner(System.in)) {
			// ask the number of subject
			System.out.println("Enter the no of subject:");
			int noOfSubject = input.nextInt();
			
			// ask the total number of subject
			System.out.println("Enter marks of " + noOfSubject 
					+ " subject:");
			
			float totalMarks = 0;
			
			for (int i = 0; i < noOfSubject; i++) {
				// based on input adding totalMarks
				totalMarks += input.nextInt();
			}
			
			System.out.println("TotalMarks: " + totalMarks);
			
			// check input is positive
			if (totalMarks >= 0) {
				// invoked findStudentGrade
				findStudentGrade(totalMarks, noOfSubject);
			} else {
				// otherwise print error message
				System.err.println("Invaild input pls enter marks"
						+ " in positive numbers");
			}
		} catch (InputMismatchException ime) { // handle exception
			System.err.println("Invaild input pls enter"
					+ " marks only.");
		}
		
	}
	
	private static void findStudentGrade(float totalMarks, 
			int noOfSubject) {
		// convert the totalMarks into percentage
		float percentage = 
				(totalMarks / (noOfSubject * 100)) * 100;
		System.out.println("Percentage: " + percentage);
		
		switch ((int) percentage / 10) {
		case 9: {
			System.out.println("Grade: A+");
			break;
		}
		case 8:
		case 7: {
			System.out.println("Grade A");
			break;
		}
		case 6: {
			System.out.println("Grade B");
			break;
		}
		case 5: {
			System.out.println("Grade C");
			break;
		}
		default:
			System.out.println("Grade D");
		}
	}

}
