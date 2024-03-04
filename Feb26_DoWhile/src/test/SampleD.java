package test;

import java.util.Scanner;

public class SampleD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1;
		Scanner xyz = new Scanner(System.in);   //user input
		System.out.println("Enter The Value:");
		int b = xyz.nextInt();  
		//int b=200;
		do {
		
		System.out.print(a);
		System.out.print("x");
		System.out.print(b);
		System.out.print("=");
		System.out.println(a*b);
		a=a+1;
	   }
		while(a<=10);
		xyz.close();     //closing of scanner
		
	}

}
