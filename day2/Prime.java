package com.geekster.day2;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		System.out.print("Please input a number : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int a = 0;
		for (int i = 2; i < input; i++) {
			if (input % i == 0) {
				a++;
			}
		}
		if (a > 0) {
			System.out.println("Not a Prime Number");
		} else {
			System.out.println("Prime number");
		}
		sc.close();
	}
}