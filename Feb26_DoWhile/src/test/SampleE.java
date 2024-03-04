package test;

import java.util.Scanner;

public class SampleE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the Value:");
		int b= scan.nextInt();
		do {
			System.out.println(a+"x"+b+"="+a*b);
			a=a+1;
		}
		while(a<=10);
		
		

	}

}
