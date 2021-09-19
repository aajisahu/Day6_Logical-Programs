package com.day6;
import java.util.Scanner;

public class RecerseNumber {

	// Parameterized constructor
	RecerseNumber(int n){ 
		int reverseNumber=0;
		while(n!=0) {
			reverseNumber=reverseNumber*10;
			reverseNumber=reverseNumber + n%10;
			n=n/10;
			
		}
		System.out.println("Reverse of entered number is: " + reverseNumber );
	}
	
		

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number to Reverse Value: ");
		int input = scanner.nextInt();
		
		if (input !=0)
		new RecerseNumber(input);//creating object of the constructor and passing the user inputed value
		
		else
			System.out.print("You have entered a wrong number : try again ");
		
		scanner.close();

	}

}