package assignment09thJan;

public class DigitOrNumber {
	public static void main(String[] args) {
		int n = -61;
		
		String ans = (n >= -9 && n <= 9)? "Digit": "Number";
		System.out.println("The input integer is "+ ans);
	}
}
