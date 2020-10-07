package com.geekster.day4;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// user input
		System.out.print("Please enter number of numbers :: ");
		Scanner scan = new Scanner(System.in);
		int numbers = scan.nextInt();
		System.out.print('\n' + "Please enter Angle value for Cos :: ");
		double angle = scan.nextDouble();
		// logic
		int counter = 0;
		double result = 0.000d;
		for (int i = 1; i < numbers; i++) {
			// code if even'th digit
			if(i==1) {
				result+=1;
			}
			if (i % 2 == 0) {
				if (counter % 2 == 0) {
					result -= Math.pow(angle, i) / factor(i);
				} else {
					result += Math.pow(angle, i) / factor(i);
				}
				counter++;
			}
			// code if odd'th digit
		}
		System.out.print('\n' + "Result is :: " + result);
		scan.close();
	}

	public static int factor(int a) {
		for (int i = 1; i <= a; i++) {
			a *= a;
		}
		return a;
	}
}