package test;

import java.util.Arrays;
import java.util.HashSet;

public class SampleA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> x = new HashSet<>();
		HashSet<Integer> y = new HashSet<>();
		
		x.addAll(Arrays.asList(1,2,3,4,5,7));
		y.addAll(Arrays.asList(3,4,5,7,8,9));
		System.out.println(x);
		System.out.println(y);
		
		HashSet<Integer> x_union_y = new HashSet<>(x);
		x_union_y.addAll(y);
		System.out.println(x_union_y);
		
		HashSet<Integer> x_intersection_y = new HashSet<>(x);
		x_intersection_y.retainAll(y);
		System.out.println(x_intersection_y);
		
		HashSet<Integer> x_diff_y = new HashSet<>(x);
		x_diff_y.removeAll(y);
		System.out.println(x_diff_y);
		
		HashSet<Integer> y_diff_x = new HashSet<>(y);
		y_diff_x.addAll(x);
		System.out.println(y_diff_x);
		
		
		
		
		
		
		

	}

}
