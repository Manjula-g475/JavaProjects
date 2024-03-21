package test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SampleB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> a = new LinkedList<>();
		Integer [] b= {20,76,54,26,87,90,12,56};
		
		a.addAll(Arrays.asList(b));
		System.out.println(a);
		
		System.out.println(a.contains(87));
		System.out.println(a.contains(8));
		
		System.out.println(a.addAll(Arrays.asList(20,76,54,26)));
		System.out.println(a.addAll(Arrays.asList(20,76,45)));
		
		LinkedList<Integer> x= new LinkedList<Integer>();
		/*x = (LinkedList)a.clone();
		System.out.println(x);*/
		
		System.out.println(a.equals(Arrays.asList(20,76,54,26,87,90,12,56)));
		System.out.println(a.equals(x));
		
		a.add(37);
		
		System.out.println(a);
		System.out.println(x);
		
		System.out.println(a.equals(x));
		
		
		
		
		

	}

}
