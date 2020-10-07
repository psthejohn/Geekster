package com.geekster.day3;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		System.out.println("============ N number of stars in N lines   ==============");
		System.out.println("Please input number of lines :: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0; i<num+1; i++) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	sc.close();
	}

}
