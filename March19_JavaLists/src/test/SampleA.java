package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class SampleA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> linkedlist = new LinkedList<>();
		List<String> arraylist = new ArrayList<>();
		List<Integer> vectorlist = new Vector<>();
		
		//adding data into the list
		linkedlist.add(20);
		linkedlist.add(10);
		linkedlist.add(50);
		linkedlist.add(25);
		linkedlist.add(45);
		linkedlist.add(90);
		System.out.println(linkedlist);
		
		//adding at particular index
		linkedlist.add(3,66);
		System.out.println(linkedlist);
		
		//size of the list
		System.out.println(linkedlist.size());
		
		//to get particular index data value
		System.out.println(linkedlist.get(1));
		
		//set the value in middle 
		linkedlist.set(4,35);
		System.out.println(linkedlist);
		
		//index of 
		System.out.println(linkedlist.indexOf(10));
		System.out.println(linkedlist.indexOf(89));
		
		
		
		
		
		
	}

}
