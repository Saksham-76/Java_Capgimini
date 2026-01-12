package assignment09thJan;

public class EvenAndOddDigitInAnumber {
	public static void main(String[] args) {
		int n = 54;
//		long a = 0054l;
		int countEven = 0;
		int countOdd = 0;
		System.out.println("value of n "+ n);
		
		while(n != 0) {
			int currNumber = n % 10;
			if(currNumber % 2 == 0 && currNumber != 0) {
				countEven++;
			}else if(currNumber % 2 != 0 && currNumber != 0) {
				countOdd++;
			}
			n /= 10;
		}
		
		System.out.println("Total Even number is: "+ countEven);
		System.out.println("Total Odd number is: "+ countOdd);
	}
}
