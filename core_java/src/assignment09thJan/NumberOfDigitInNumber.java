package assignment09thJan;

public class NumberOfDigitInNumber {
	public static void main(String[] args) {
		int n = 2194980;
		
		int count = 0;
		
		while(n != 0) {
			count++;
			n /= 10;
		}
		
		System.out.println("Total digits are: "+ count);
	}
}
