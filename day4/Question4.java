package com.geekster.day4;
import java.util.Scanner;
public class Question4 {
	public static void main(String[] args) {
		System.out.println("please input number : ");
		Scanner scan = new Scanner(System.in);
		int num  = scan.nextInt();
		int first = 0;
		int second = 1;
		int[] arr = new int[num];
		for(int i=0;i<num; i++) {
			if(i>0) {
			arr[i] = first+second;
			}
		}
	}

}
