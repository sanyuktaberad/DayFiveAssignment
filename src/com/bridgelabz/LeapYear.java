package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Year : ");
		int year = scan.nextInt();
		if (year > 999 && year < 9999) {
			if ((year % 4 == 0 && year / 100 != 0) || (year / 400 == 0)) {
				System.out.println("leap year");
			} else {
				System.out.println("not leap year");
			}
		} else {
			System.out.println("Please enter 4 digit value");
		}
	}

}
