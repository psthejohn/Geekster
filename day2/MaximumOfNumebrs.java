package com.geekster.day2;
import java.util.Scanner;

public class MaximumOfNumebrs {

	public static void main(String[] args) {
		System.out.print("Please input 3 numbers : ");
		Scanner sc = new Scanner(System.in);
		double input1 = sc.nextDouble();
		double input2 = sc.nextDouble();
		double input3 = sc.nextDouble();

		if (input1 > input2 && input1 > input3) {
			System.out.println(input1 + " is the largest number");
		} else if (input2 > input3) {
			System.out.println(input2 + " is the largest number");
		} else if (input1 == input2 && input3>input2) {
			System.out.println(input3 + " is the largest");
		} else if (input2 == input3 && input1>input2 ) {
			System.out.println(input1 + " is the largest");
		} else {
			System.out.println(input3 + " is the largest");
		}
		sc.close();
	}

}
