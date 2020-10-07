package com.geekster.day4;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0;
		int positiveNumber = 0;
		int negativeNumber = 0;
		int zero = 0;
		System.out.println("Please enter number of numbers to be entered : ");
		x = scan.nextInt();
		int arr[] = new int[x];
		for(int i=0;i<x;i++) {
			arr[i] = scan.nextInt();
			if(arr[i] == 0) {
				zero++;
			}
			else if(arr[i]>0) {
				positiveNumber++;
			}
			else {
				negativeNumber++;
			}
		}
		System.out.println("Positive Number "+positiveNumber+'\n'+"Negative Number "+negativeNumber+'\n'+"Zero "+zero);
		scan.close();
	}

}
