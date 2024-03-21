package test;

import java.util.ArrayList;
import java.util.List;

public class SampleB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> arraylist = new ArrayList<>();
		
		arraylist.add("Hii");
		arraylist.add("Good Mrng");
		arraylist.add("Have");
		arraylist.add("a");
		arraylist.add("nice");
		arraylist.add("day");
		System.out.println(arraylist);
		
		arraylist.add(1,"Good Evng");
		System.out.println(arraylist);
		
		System.out.println(arraylist.size());
		
		System.out.println(arraylist.indexOf(3));
		System.out.println(arraylist.indexOf("nice"));
		
		System.out.println(arraylist.get(4));
		
		arraylist.set(1,"Hello");
		System.out.println(arraylist);
		
		
		
		
		
		
		

	}

}
