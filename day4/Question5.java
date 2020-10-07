package com.geekster.day4;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Number of numbers");
		int input = scan.nextInt();
		double sum = 0.00d;
		double var=1;
		for (int i = 1; i <= input; i++) {
			sum += var/ i;
		}	
		System.out.println(sum);
		scan.close();
	}

}
