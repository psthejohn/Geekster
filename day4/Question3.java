package com.geekster.day4;

public class Question3 {
//	int count = 0;

	public static void main(String[] args) {
		System.out.println("Write a program to print out all Armstrong numbers between 1 and 500.");
		// iteration of numbers from 1-500
		for (int i = 1; i < 501; i++) {
			// grouping numbers according to one digit
			if (numberOfDigits(i) == 1) {
				// logic
				int copy = i;
				if ((copy * copy * copy) == i) {
					System.out.println(i + " is an Armstrong Number.");
				}
			}
			// grouping numbers according to two digit
			if (numberOfDigits(i) == 2) {
				// logic
				int unitDigit = i % 10;
				int tensDigit = (i - i % 10) / 10;
				// System.out.println("Unit Digit of " + i + " is : " + unitDigit + '\n' + "Tens
				// Digit of " + i + " is : "+ tensDigit + '\n');
				if ((unitDigit * unitDigit * unitDigit) + (tensDigit * tensDigit * tensDigit) == i) {
					System.out.println(i + " is an Armstrong Number.");
				}
			}
			// grouping numbers according to three digit
			if (numberOfDigits(i) == 3) {
				// logic
				int unitDigit = i % 10;
				int tensDigit = (i % 100 - i % 10) / 10;
				int hundredsDigit = (i - i % 100) / 100;
				// System.out.println("Unit Digit of " + i + " is : " + unitDigit + '\n' + "Tens
				// Digit of " + i + " is : "
				// + tensDigit + '\n' + "Hundreds Digit of " + i + " is : " + hundredsDigit);
				if ((unitDigit * unitDigit * unitDigit) + (tensDigit * tensDigit * tensDigit)
						+ (hundredsDigit * hundredsDigit * hundredsDigit) == i) {
					System.out.println(i + " is an Armstrong Number.");
				}
			}
		}
	}

	public static int numberOfDigits(int num) {
		int digits = 0;
		while (num != 0) {
			num /= 10;
			digits++;
		}
		return digits;
	}
}