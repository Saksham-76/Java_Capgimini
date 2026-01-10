package operator;

public class GreatestofFourNumber {
	public static void main(String[] args) {
		int a = 500;
		int b = 611;
		int c = 811;
		int d = 922;
		
		int n = ((a>b) && (a>c) && (a>d))? a: ((b>c) && (b>d))? b : (c>d)? c:d;
		System.out.println("Biggest number is "+ n);
		
		
		int big = a>b? a:b;
		big = big>c? big:c;
		big = big>d? big:d;
		
		System.out.println("Greatest number is "+ big);
	}
}
