package assignment09thJan;

public class CapitalOrSmallAlphabate {
	public static void main(String[] args) {
		char ch = '$';
		
		if(ch >= 'a' && ch <= 'z') {
			System.out.println("This is small alphabate.");
		}
		else if(ch >= 'A' && ch <= 'Z') {
			System.out.println("This is Capital Alphabate");
		}else {
			System.out.println("Enter wrong character");
		}
	}
}
