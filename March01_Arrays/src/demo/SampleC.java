package demo;

public class SampleC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x[] = {3.5,6.0,7.4,4.5,9.0,8.0};
		
		int index =0;
		System.out.println("while loop");
		while(index<6) {
			System.out.println(x[index]);
			index=index+1;
			
		}
		
		System.out.println("for loop");
		for(int i=0;i<6;i++) {
			System.out.println(x[i]);
		}
		
		System.out.println("for each loop");
		for (double b:x) {
			System.out.println(b);
		}

	}

}
