package com.geekster.october17.Recursion;

public class Recursion {

	public static void main(String[] args) {
//		printIncreasing(5);
//		printDecreasing(5);
//		printDecreasingIncreasing(6);
//		System.out.println(printFactorial(5));
//		System.out.println(power(2,5));
		int[] arr = { 1, 2, 4, 5, 6, 3, 2 };
//		printArr(arr, 0);
		maxArr(arr,0);
	}

//	public static void printIncreasing(int num) {
//		if (num == 0) {
//			return;
//		}
//		printIncreasing(num - 1);
//		System.out.println(num);
//	}
//
//	public static void printDecreasing(int num) {
//		if (num == 0) {
//			return;
//		}
//		System.out.println(num);
//		printIncreasing(num - 1);
//	}
//	public static void printDecreasingIncreasing(int num) {
//		if (num == 0) {
//			return;
//		}
//		if (num % 2 != 0) {
//			System.out.println("Hii " + num);
//		}
//		printDecreasingIncreasing(num - 1);
//		if (num % 2 == 0) {
//			System.out.println("Bye " + num);
//		}
//	}
//	public static int printFactorial(int num) {
//		if(num ==1) {
//			return 1;
//		}
//		int x = printFactorial(num-1);
//		int fact = x*num;
//		return fact;
//	}
//	public static int power(int num,int pow) {
//		if(pow == 0) {
//			return 1;
//		}
//		int l = power(num,pow-1);
//		l*=num;
//		return l;
//	}
//	public static void printArr(int[] arr) {
//		if(arr.length==0) {
//		return;	
//		}
//		int[] newArr = new int[arr.length-1];
//		for(int i=0;i<newArr.length;i++) {
//			newArr[i] = arr[i+1];
//		}
//		System.out.println(arr[0]);
//		printArr(newArr);
//	}
	public static void printArr(int[] arr, int index) {
//		int x = arr.length;
//		if(x==0) {
//			return;
//		}
//		System.out.println(x);
//		x--;
//		printArr(arr);
		if (index == arr.length) {
			return;
		}
		System.out.println(arr[index]);
		printArr(arr, index + 1);
	}
	public static void maxArr(int[] arr, int index) {
		
	}

}
