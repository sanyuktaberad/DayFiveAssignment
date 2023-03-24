package com.bridgelabz;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Insert First Number");
		int numberOne = scan.nextInt();

		System.out.println("Please Insert Second Number");
		int numberTwo = scan.nextInt();

		int temp;
		temp = numberTwo;
		numberTwo = numberOne;
		numberOne = temp;
		System.out.println("After Swapping, Number 1 is " + numberOne);
		System.out.println("After Swapping, Number 2 is " + numberTwo);
	}
}
