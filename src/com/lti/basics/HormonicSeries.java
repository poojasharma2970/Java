package com.lti.basics;
import java.util.Scanner;

public class HormonicSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = s.nextInt();
		double sum =0,i ;
		for(i =1; i< n; i++) {
			sum = sum + 1/i;
		}
		System.out.println("The answer for the given series is : " + sum);
		 
	}

}
