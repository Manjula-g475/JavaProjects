package test;

import java.util.Arrays;
import java.util.LinkedList;

public class SampleA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> m = new LinkedList<Integer>();
		
		//add functions 
		m.add(45);
		m.add(70);
		m.add(56);
		System.out.println(m);
		m.addFirst(12);
		System.out.println(m);
		m.addLast(23);
		System.out.println(m);
		m.add(2,66);
		System.out.println(m);
		m.addAll(Arrays.asList(77,43,65,78));
		System.out.println(m);
		m.addAll(4,Arrays.asList(78,90));
		System.out.println(m);
		
		//remove functions
		m.remove();
		System.out.println(m);
		m.removeFirst();
		System.out.println(m);
		m.removeLast();
		System.out.println(m);
		m.removeAll(Arrays.asList(70,78));
		System.out.println(m);
		m.removeFirstOccurrence(56);
		System.out.println(m);
		m.removeLastOccurrence(43);
		System.out.println(m);
		m.remove(3);
		System.out.println(m);
		

	}

}
