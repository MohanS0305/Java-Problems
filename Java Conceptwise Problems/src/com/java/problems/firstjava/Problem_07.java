package com.java.problems.firstjava;
import java.util.*;
public class Problem_07 {

	public static void main(String[ ] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value for n");
		int n=input.nextInt();
		int[ ] a=new int[n];
		input.close();
		int i;
		a[0]=0;
		a[1]=1;
		for(i=2;i<n;i++) {
			a[i]=a[i-1]+a[i-2];
		}
		System.out.println("Numbers are:");
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
