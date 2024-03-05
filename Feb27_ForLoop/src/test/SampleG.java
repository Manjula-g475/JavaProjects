package test;

public class SampleG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//fibonaci series using do while loop
		
		int a=0;
		int b=1;
		int c;
		
		int x=1;
		do {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			x++;
		}
		while(x<=20);

	}

}
