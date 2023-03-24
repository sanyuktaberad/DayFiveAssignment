package com.bridgelabz;

import java.util.Scanner;

public class Coin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("how many times you want to flip the coin : ");
		int userInput = scan.nextInt();
		int head = 0;
		int tail = 0;

		for (int i = 1; i <= userInput; i++) {
			double coin = Math.random();
			if (coin < 0.5) {
				System.out.println(i + ". tail");
				tail++;
			}

			else {
				System.out.println(i + ". head");
				head++;
			}
		}
		float headPercentage = (userInput - tail) * 100 / userInput;
		System.out.println("head percentage " + headPercentage + "%");
		System.out.println("head : " + head + "; tail : " + tail);
	}

}
