package com.geekster.day2;
import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("I/P - ");
		double subject1 = sc.nextDouble();
		double subject2 = sc.nextDouble();
		double subject3 = sc.nextDouble();
		System.out.println();
		int average = (int) (subject1 + subject2 + subject3) / 3;
		System.out.print("O/P - ");
		if (average > 100 || average < 0) {
			System.out.println("please enter valid marks in subjects");
		} else if (average <= 100 && average >= 90) {
			System.out.println("A");
		} else if (average <= 89 && average >= 80) {
			System.out.println("B");
		} else if (average <= 79 && average >= 70) {
			System.out.println("C");
		} else if (average <= 69 && average >= 60) {
			System.out.println("D");
		} else if (average <= 0 && average >= 59) {
			System.out.println("F");
		}
		sc.close();
	}

}
