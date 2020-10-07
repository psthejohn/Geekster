package com.geekster.day3;

import java.util.Scanner;

public class NumberPatters {

	public static void main(String args[]) {
	System.out.println("============ Number Patterns  ==============");
	System.out.println("Please input number of Lines :: ");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	for(int i=1;i<=num;i++) {
		int counter =1;

		for(int j=0; j<i;j++) {
		System.out.print(counter+" ");
		counter++;
		}
		System.out.println();
	}
	sc.close();
	}
}
