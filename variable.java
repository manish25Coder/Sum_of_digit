package demoOne;

import java.util.Scanner;

public class variable {

	public static void main(String[] args) {
	 int digit , n=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter three digits nos");
		int num=sc.nextInt();
		while(num>0) {
		digit = num % 10;  //getting the remainder
		n = n + digit;   
		num = num / 10; 
		}
		
		System.out.println("total of three digits is"+n);
	}}

	

