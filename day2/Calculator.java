package com.geekster.day2;
public class Calculator {

	public static void main(String args[]) {

		double a = 20.0;
		double b = 20;
		char operator = '/';

		if (operator == '+') {
			System.out.println(a + b);
		} else if (operator == '-') {
			System.out.println(a - b);
		} else if (operator == '/') {
			if (b > 0) {
				System.out.println(a / b);
			} else {
				System.out.println("Please enter a denominator > 0");
			}
		} else if (operator == '*') {
			System.out.println(a * b);
		} else {
			System.out.println("Please enter a valid character");
		}
	}

}
