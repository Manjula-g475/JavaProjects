package demo;

import java.util.Arrays;

public class SampleE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a[] = {1.2,2.3,3.4,4.56,6.7};

		double b[] =a;

		System.out.println(a);
		System.out.println(b);	

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		
		b[1] = 55.66;
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		
		double c[] = Arrays.copyOf(a, a.length);
		
		System.out.println(c);
		
		c[2]=66.77;
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
	}

	

}
