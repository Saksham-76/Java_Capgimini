package assignment09thJan;

public class PalindromeNumber {
	public static void main(String[] args) {
		int n1 = 1212;
		int temp = 0;
		int n2 = n1;
		while(n1 != 0) {
			int currNumber = n1 % 10;
			temp = (temp*10) + currNumber;
			n1 = n1 / 10;
		}
		
		if(n2 == temp) {
			System.out.println("This is palindrome");
		}else {
			System.out.println("This is not palindrome");
		}
	}
}
