package com.bridgelabz;

import java.util.Scanner;

public class NumberIsEvenOrOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert the number");
		int number = scan.nextInt();

		if (number % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
}
