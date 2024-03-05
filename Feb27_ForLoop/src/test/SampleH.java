package test;

public class SampleH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//fibonaci series using for Loop
		
		int a=0;
		int b=1;
		int c;
		
		for(int x=1;x<=15;x++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}

	}

}
