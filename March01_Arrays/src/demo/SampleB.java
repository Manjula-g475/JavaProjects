package demo;

public class SampleB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x[] = new double[6];
		x[0]=34.8;
		x[1]=7.0;
		x[2]=40.5;
		x[3]=6.8;
		x[4]=60.0;
		x[5]=35;
		
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

