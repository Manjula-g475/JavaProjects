package test;

import java.util.Arrays;
import java.util.TreeSet;

public class SampleA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> a = new TreeSet<String>();
		
		a.add("abx");
		a.add("erf");
		a.add("lor");
		a.add("efg");
		System.out.println(a);
		
		a.addAll(Arrays.asList("ws","g","sds","aaa","rfr"));
		System.out.println(a);
		
		a.remove("erf");
		System.out.println(a);
		
		a.removeAll(Arrays.asList("g","rfr","lor"));
		System.out.println(a);
		
		System.out.println(a.size());
		
		System.out.println(a.contains("dd"));
		
		System.out.println(a.contains("abx"));
		
		
		
		//a.clear();
		//System.out.println(a);
		
		TreeSet<String> b = new TreeSet<String>();
		
		b.add("hh");
		b.add("hb");
		System.out.println(a.equals(b));
		
		b.clear();
		System.out.println(b.isEmpty());
		


		
		
		
		
		
		
		

	}

}
