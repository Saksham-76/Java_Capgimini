package assignment10Jan;

public class PalindromeCheck {
	public static String isPalindrome(int n1) {
		int n2 = 0;
		int check = n1;
		while(n1!=0) {
			int currNumber = n1 % 10;
			n2 *= 10;
			n2 += currNumber;
			n1 /= 10;	
		}
		if(check == n2) {
			return "Good";
		}else {
			return "Bad";
		}
	}
	public static void main(String[] args) {
		int n = 19871;
		System.out.println(isPalindrome(n));
	}
}
