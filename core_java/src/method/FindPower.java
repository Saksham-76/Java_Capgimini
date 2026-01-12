package method;

public class FindPower {
	public static int findPowerWithForLoop(int b, int p) {
		int result = 1;
		for(int i=1; i<=p; i++) {
			result *= b;
		}
		return result;
	}
	
	public static int findPowerWithWhileLoop(int b, int p) {
		int result = 1;
		while(p != 0) {
			result *= b;
			p--;
		}
		return result;
	}
	public static void main(String[] args) {
		int b = 2;
		int p = 3;
		
		System.out.println("With using For loop: " + findPowerWithForLoop(b, p));
		System.out.println("With using While loop: " + findPowerWithWhileLoop(b, p));
	}
}
