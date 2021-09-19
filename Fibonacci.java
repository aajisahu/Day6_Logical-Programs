package com.day6;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		
		System.out.print("Enter a number for Fibonacci : ");
		int number = sc.nextInt();
		
		for (int i = 2; i <number;i++) {
			
			num3 = num1 + num2;
			System.out.println("" + num3);
			num1 = num2;
			num2 = num3;
		}
		
		System.out.println("Fibonacci is :" + num3);
		sc.close();

	}

}