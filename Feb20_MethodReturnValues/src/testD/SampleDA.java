package testD;

public class SampleDA {

	
     
		public static void add(int a,int b ){  // public visible to all packages & class
			System.out.println(a+b);
		}
		private static void sub(int a,int b ){ // private visible to only within class
			System.out.println(a+b);
		}
		protected static void mul(int a,int b ){ //protected visible to package
			System.out.println(a+b);
		}
		static void div(int a,int b ){    // default visible within the same package
			System.out.println(a+b);
		}
	

}
