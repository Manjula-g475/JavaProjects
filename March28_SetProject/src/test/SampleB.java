package test;

import java.util.HashMap;
import java.util.HashSet;


public class SampleB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> x = new HashMap<>();
		
		x.put(1,"Hii");
		x.put(2, "Good Mrng");
		x.put(3, "Have");
		x.put(4, "A Nice");
		x.put(5,"Day");
		
		System.out.println(x);
		
		System.out.println(x.keySet());
		System.out.println(x.values());
		System.out.println(x.containsKey(1));
		System.out.println(x.containsKey(8));
		System.out.println(x.containsValue("lol"));
		System.out.println(x.containsValue("Have"));
		System.out.println(x.get(3));
		
		x.remove(5);
		System.out.println(x);
		x.remove(2, "Good Mrng");
		System.out.println(x);
		
		x.replace(4, "A good");
		System.out.println(x);
		
		x.clear();
		System.out.println(x.isEmpty());




		






		
		
		

	}

}
