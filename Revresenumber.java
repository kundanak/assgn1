package com.assignment.work;

import java.util.Scanner;

public class Revresenumber {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		System.out.println("Number reverse");
		int n=input.nextInt();
		
		int original=n;
		int reverse=0;
		
		int remainder;
		
		while(original!=0){
			remainder=original%10;
			reverse=reverse*10;
			reverse=reverse*10+remainder;
			original=original/10;
		}
		
System.out.println("The reverse number is : "+reverse);
		

	}

}
