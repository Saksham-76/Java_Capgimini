package assignment10Jan;

public class EvenAndOddDigitSame {
	public static String isSameEvenAndOdd(int n) {
		int evenCount = 0;
		int oddCount = 0;
		
		while(n != 0) {
			int currNumber = n % 10;
			if(currNumber % 2 == 0) {
				evenCount++;
			}else {
				oddCount++;
			}
			n /= 10;
		}
		
		if(evenCount == oddCount) {
			return "True";
		}
		
		return "False";
	}
	public static void main(String[] args) {
		int n = 234;
		
		System.out.println(isSameEvenAndOdd(n));
		
	}
}
