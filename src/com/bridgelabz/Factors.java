package com.bridgelabz;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		System.out.println("Enter a number ::");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();

		for (int i = 2; i < number; i++) {
			while (number % i == 0) {
				System.out.println(i + " ");
				number = number / i;
			}
		}

		if (number > 2) {
			System.out.println(number);
		}
	}
}
