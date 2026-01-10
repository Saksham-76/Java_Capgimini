package ConditonalStatement;

public class GivvenCharecterIsAlphabateDigitOrSpecialCharacter {
	public static void main(String[] args) {
		char ch = '_';
		
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("The input is Alphabate.");
		}else if(ch >= '0' && ch <= '9') {
			System.out.println("The input is Digit");
		}else {
			System.out.println("The input is Special Character");
		}
	}
}
