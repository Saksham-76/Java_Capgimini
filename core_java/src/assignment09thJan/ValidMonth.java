package assignment09thJan;

public class ValidMonth {
	public static void main(String[] args) {
		int month = -12;
		
		String ans = (month >=1 && month <= 12)? "This is a valid month Number": "This is not valid month number.";
		
		System.out.println(ans);
		
	}
}
