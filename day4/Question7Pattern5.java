package com.geekster.day4;

public class Question7Pattern5 {

	public static void main(String[] args) {
		for(int i=1;i<6;i++) {
			for(int j=5;j>i;j--) {
				System.out.print("  ");
			}
			for(int k=0;k<(i*2-1);k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}