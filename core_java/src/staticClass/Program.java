package staticClass;

public class Program {
	public static boolean isPalindrome(int n1) {
		int n2 = 0;
		int check = n1;
		
		while(n1 != 0) {
			int currNumber = n1 % 10;
			n2 *= 10;
			n2 += currNumber;
			n1 /= 10;
		}
		
		if(n2 == check) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean isPrime(int n) {
		for(int i=2; i<=n/2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
