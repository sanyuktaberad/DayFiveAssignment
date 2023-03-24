package com.bridgelabz;

import java.util.Scanner;

public class PowerOf2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Range :");
		int range = scan.nextInt();
		int powerOfTwo = 1;
		for (int i = 1; i <= range; i++) {
			powerOfTwo = 2 * powerOfTwo;
			System.out.println("Power Of Two at " + i + " -> " + powerOfTwo);
		}
	}

}
