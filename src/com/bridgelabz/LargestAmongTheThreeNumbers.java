package com.bridgelabz;

import java.util.Scanner;

public class LargestAmongTheThreeNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter First Number");
		int numberOne = scan.nextInt();

		System.out.println("Enter Second Number");
		int numberTwo = scan.nextInt();

		System.out.println("Enter Third Number");
		int numberThree = scan.nextInt();
		if (numberOne > numberTwo && numberOne > numberThree) {
			System.out.println(numberOne + " is greater amongst three number.");
		} else if (numberTwo > numberThree) {
			System.out.println(numberTwo + " is greater amongst three number.");
		} else {
			System.out.println(numberThree + " is greater amongst three number.");
		}
	}
}
