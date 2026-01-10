package core_java;

public class Demo {
	public static void main(String[] args) {
//		int a=10;
//		long b=a;
//		System.out.println(b); //Widening
//		
//		long c = 20;
//		int d = (int)c;
//		System.out.println(d); //Narrowing
//		
//		double d1 = 55.55;
//		int i1 = (int)d1; //Narrowing 
//		System.out.println(i1);
		
		byte a1 = 2;
		float a2 = a1;
		System.out.println(a2);
		
		float b1 = 5.3f;
		byte b2 = (byte)b1;
		System.out.println(b2);
		
		char c1 = 'g';
		int c2 = c1;
		System.out.println(c2);
		
		int d1 = 65;
		char d2 = (char)d1;
		System.out.println(d2);
		
	}
}
