package com.geekster.day4;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0;
		int larger = 0;
		int smaller = 0;
		System.out.println("Please enter number of numbers to be entered : ");
		x = scan.nextInt();
		int arr[] = new int[x];
		for (int i = 0; i < x; i++) {
			arr[i] = scan.nextInt();
		}
		int baseNumber = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>baseNumber) {
				larger = arr[i];
			}
			else if(arr[i]<baseNumber) {
				smaller = arr[i];
			}
		}
		System.out.println("Larger "+larger+'\n'+"Smaller "+smaller);
		scan.close();
	}

}
