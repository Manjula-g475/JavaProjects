package test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SampleA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> x = new LinkedList<>();
		Integer[]y = {76,50,45,67,90,36,23,89,70};
		
		x.addAll(Arrays.asList(y));
        System.out.println(x);
        
        x.remove(5);
        System.out.println(x);
        
        x.removeAll(Arrays.asList(50,36,56,70));
        System.out.println(x);
        
        System.out.println(x.isEmpty());
       
        x.clear();
        System.out.println(x);
        
        System.out.println(x.isEmpty());
        
        
        List<String> m = new LinkedList<String>();
        m.add("Hii");
        m.add("Hello");
        m.add("Good Mrng");
        m.add("Smile");
        System.out.println(m);
        
        m.remove("Hello");
        System.out.println(m);
        
        m.remove(1);
        System.out.println(m);
        
        m.removeAll(Arrays.asList("Hii","Good Mrng"));
        System.out.println(m);
        
        
		

	}

}
