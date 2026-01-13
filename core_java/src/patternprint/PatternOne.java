package patternprint;

public class PatternOne {
	public static void p1(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void p3(int n) {
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void p2(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=n-i; j>=1; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void p4(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=i-1; j>=1; j--) {
				System.out.print(" ");
			}
			for(int j=n; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		int n = 3;
		p1(n);
		p2(n);
		p3(n);
		p4(n);
	}
}
