package method;

public class DigitsInTheNumber {
	static int countDigit(int n) {
		int count = 0;
		while(n != 0) {
			count++;
			n /= 10;
		}
		return count;
	}
	public static void main(String[] args) {
		int n = 1231;
		System.out.println("Number of count of digits are: "+ countDigit(n));
	}
}
