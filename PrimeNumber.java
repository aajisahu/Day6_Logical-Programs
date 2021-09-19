package com.day6;
import java.util.Scanner;

public class PrimeNumber {

	// Parameterized constructor
	PrimeNumber(int n){ 

		int isPrime=1;
		for (int i=2; i<= n; i++) {
			
			if ( (n % i) == 0) {

				isPrime=0;
			}

		}

		if (isPrime == 1)
			System.out.println(n + " is not a Prime Number");
		else 
			System.out.println(n + " is a Prime Number");
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number to check Prime or not : ");
		int input = scanner.nextInt();
		
		new PrimeNumber(input);//creating object of the constructor and passing the user inputed value
		scanner.close();

	}

}