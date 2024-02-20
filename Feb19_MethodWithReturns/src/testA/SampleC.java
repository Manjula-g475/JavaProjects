package testA;

public class SampleC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//method Overloading
		
		addValues(12,89);
		addValues(23,34,457);
		addValues(33.2,4);
		addValues(11.2,45);
		
	}
	public static void addValues(int m, int n) {
		System.out.println(m+n);

	}
	public static void addValues(int m, int n,int p) {
		System.out.println(m+n+p);
	}
	public static void addValues(double m,double n) {
		System.out.println(m+n);
	}
	public static void addValues(double m,double n,double p) {
		System.out.println(m*n*p);
	}
	

}
