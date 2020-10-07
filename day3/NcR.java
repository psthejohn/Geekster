package com.geekster.day3;

import java.util.Scanner;

public class NcR {
	public static void main(String args[]) {
		System.out.println("============ Number Patterns  ==============");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input n :: ");
		int n = sc.nextInt();
		System.out.println("Please input r :: ");
		int r = sc.nextInt();
		
		
		System.out.println("output is :: " + facto(n)/ (facto(r) * facto(n-r)));
		sc.close();
	}

	public static int facto(int n) {
			int k=1;
			for(int i=1;i<=n;i++) {
			 k*=i;
			}
			return k;
		}
	}
