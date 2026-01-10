package ConditonalStatement;

public class GreaterOfThreeNumber {
	public static void main(String[] args) {
		int a = 5;
		int b = 17;
		int c = 8;
		
//		if(a > b && a > c) {
//			System.out.println("Greater number is "+ a);
//		}else if( b > c) {
//			System.out.println("Greater number is "+ b);
//		}else {
//			System.out.println("Greater number is "+ c);
//		}
//		int big = 0;
//		if(a > b && a > c) {
//			big = a;
//		}
		
		if(a > b && b > c) {
			System.out.println("Greater number is: "+ a);
		}else {
			int n = (b>c)? b:c;
			System.out.println("Greater number is: "+ n);
		}
		
		
	}
}
