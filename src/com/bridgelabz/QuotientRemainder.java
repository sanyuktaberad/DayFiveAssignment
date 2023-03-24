package com.bridgelabz;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please Insert Number : ");
		int divident = scan.nextInt();

		System.out.println("Please Insert Divisor");
		int divisor = scan.nextInt();

		int quotient = divident / divisor;
		int remainder = divident % divisor;
		System.out.println("Quotient is : " + quotient);
		System.out.println("Remainder is : " + remainder);
	}
}
