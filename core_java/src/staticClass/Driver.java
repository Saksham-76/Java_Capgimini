package staticClass;

public class Driver {
	public static void main(String[] args) {
		boolean isPalindrome = Program.isPalindrome(Data.num1);
		boolean isPrime = Program.isPrime(Data.num2);
		
		if(isPalindrome == true) {
			System.out.println(Data.num1 + " is Palindriome.");
		}else {
			System.out.println(Data.num1 + " is not Palindriome.");
		}
		
		if(isPrime == true) {
			System.out.println(Data.num2 + " is Prime Number.");
		}else {
			System.out.println(Data.num2 + " is not a Prime Number.");
		}
	}
}
