package looping;

public class SumOfDigitOfNumber {
	public static void main(String[] args) {
		int n = 123;
		int ans = 0;
		do {
			int m = n % 10;
			ans += m;
			n=n/10;
		}while(n != 0);
		
		System.out.println("Sum: "+ ans);
		
		
		n = 124;
		ans = 0;
		while(n != 0) {
			int m = n %10;
			ans += m;
			n = n /10;
		}
		
		System.out.println("Sum: " + ans );
	}
}
