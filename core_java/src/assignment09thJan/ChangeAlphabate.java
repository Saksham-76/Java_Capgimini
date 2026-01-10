package assignment09thJan;

public class ChangeAlphabate {
	public static void main(String[] args) {
		char ch = 'T';
		
		if(ch >= 'A' && ch <= 'Z') {
			ch += 32;
		}else if(ch >= 'a' && ch <= 'z') {
			ch -= 32;
		}else {
			System.out.println("You have enter wrong character");
		}
		
		System.out.println("Changed: "+ ch);
	}
}
