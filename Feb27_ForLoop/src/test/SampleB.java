package test;

import java.util.Scanner;

public class SampleB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value:");
		int b = scan.nextInt();
		
		//int b=5;
		
		for(int a=1;a<=10;a++) {
			System.out.println(a+"x"+b+"="+a*b);
		}

	}

}
