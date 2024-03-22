package test;

import java.util.Arrays;
import java.util.LinkedList;

public class SampleB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> x = new LinkedList<Integer>();
		
		System.out.println(x);
		x.addAll(Arrays.asList(29,34,65,44,18,45));
		System.out.println(x);
		x.addAll(2,Arrays.asList(2,7));
		System.out.println(x);
		
		System.out.println(x.contains(65));
		System.out.println(x.contains(55));
		System.out.println(x.size());
		System.out.println(x.equals(Arrays.asList(3,2,65)));
		System.out.println(x.equals(Arrays.asList(29,34,2,7,65,44,18,45)));
		System.out.println(x.isEmpty());
		
		x.clear();
		System.out.println(x.isEmpty());
		System.out.println(x);

	}

}