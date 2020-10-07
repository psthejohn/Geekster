package com.geekster.day4;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		System.out.println("please enter number of numbers");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		double sum = 0.00d;
		double var = 1;
		for (int i = 1; i <= input; i++) {
			if (i % 2 == 0) {
				sum -= var / i;
			} else {
				sum += var / i;
			}
		}
		System.out.println(sum);
		scan.close();
	}
}
