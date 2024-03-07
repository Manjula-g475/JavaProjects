package test;

import java.util.Arrays;

public class SampleA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="GOOD MORNING";
		String str2="Hii Hello Good Evening";
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.length());
		System.out.println(str2.length());
		
		System.out.println(str1.toLowerCase());
		System.out.println(str2.toUpperCase());
		
		System.out.println(Arrays.toString(str1.split("O")));
		System.out.println(Arrays.toString(str2.split("llo")));
		
		System.out.println(str1.replace("G","ap"));
		System.out.println(str2.replace("i","e"));
		
		System.out.println(str1.indexOf("OR"));
		System.out.println(str2.indexOf("Ev"));
		
		System.out.println(str1.indexOf("N"));
		System.out.println(str1.lastIndexOf("N"));
		
		System.out.println(str1.contains("OR"));
		System.out.println(str1.contains("Oo"));
		System.out.println(str2.contains("Ev"));
		System.out.println(str2.contains("hie"));
		
		System.out.println(str1.equals("GOOD MORNING"));
		System.out.println(str1.equals("Good morninG"));
		System.out.println(str2.equals("Hii Hello Good Evening"));
		System.out.println(str2.equals("good morning "));
		
		System.out.println(str1.startsWith("G"));
		System.out.println(str2.startsWith("GO"));
		
		System.out.println(str1.endsWith("ello"));
		System.out.println(str2.endsWith("ng"));



	}

}
