package test;

import java.util.Arrays;
import java.util.LinkedList;

public class SampleC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> c = new LinkedList<Integer>();
		
		c.addAll(Arrays.asList(34,43));
		c.addAll(2,Arrays.asList(23,98,576,54,765));
		System.out.println(c);
		
		//offer works as add 
		c.offer(67);
		System.out.println(c);
		c.offerFirst(321);
		System.out.println(c);
		c.offerLast(89);
		System.out.println(c);
		
		//get the values of particular index
		System.out.println(c.get(5));
		System.out.println(c.getFirst());
		System.out.println(c.getLast());
		
		//get the value 
		System.out.println(c.peek());
		System.out.println(c.peekFirst());
		System.out.println(c.peekLast());
		
		//get the 1st value and remove
		System.out.println(c.poll());
		System.out.println(c.pollFirst());
		System.out.println(c.pollLast());
		
		//remove
		System.out.println(c.pop());
		
		//add
		c.push(233);
		System.out.println(c);

	}

}
