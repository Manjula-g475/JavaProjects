package test;

import java.util.Scanner;

public class SampleF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		Scanner xyz = new Scanner(System.in);
		int b= xyz.nextInt();
		while(a<=10) {
			System.out.println(a+"x"+b+"="+a*b);
			a=a+1;
		}

	}

}
