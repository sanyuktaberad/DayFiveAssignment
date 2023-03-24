package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Which Harmonic Number want to Print");
		double number = scan.nextInt();
		double result = 0;
		for (int i = 1; i <= number; i++) {
			result = result + (float) 1 / i;
		}
		System.out.println("the value of Harmonic Number " + number + " is " + result);
	}
}
