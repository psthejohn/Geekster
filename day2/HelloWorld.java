package com.geekster.day2;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");

//		Scanner input = new Scanner(System.in);
//		System.out.print("Please input your name : ");
//		int input1  = input.nextInt();
//		int input2  = input.nextInt();
//		
//		double result = input1/(double) input2;
//		System.out.println("Your input is  : "+input1);
//		input.close();
		
//		Scanner in = new Scanner (System.in);
//		System.out.println("please enter farenheit temp : ");
//		
//		double in1 = in.nextDouble();
//		
//		double result = (in1-32)*5/9;
//		
//		System.out.println("Celsius temperature is : "+ result);
		
		Scanner in = new Scanner (System.in);
		System.out.print("Please enter a number to check if it is  odd or even : ");
		
		int input1 = in.nextInt();
		if(input1%2==0) {
			System.out.println("Number "+input1+" is Even");
		}else if(input1%2!=0) {
			System.out.println("Number "+input1+" is Odd");
		}
		in.close();
	}
}