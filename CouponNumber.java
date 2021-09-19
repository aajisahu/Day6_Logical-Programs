package com.day6;
import java.util.Random;
import java.util.Scanner;

public class CouponNumber {

	public static int generateRandom() {
		
		Random rand = new Random();
		int random = rand.nextInt(999999);
		return random;
		
	}
		
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of coupon : ");
		int coupon = sc.nextInt();
		sc.close();
		
		for (int i=1; i<=coupon; i++) {
			generateRandom(); //calling random method to generate coupon
			System.out.println(i +".Code for coupon :" + generateRandom()); //printing the values of getRandom method value as coupon
			
			
		}
		
	}
	
}
