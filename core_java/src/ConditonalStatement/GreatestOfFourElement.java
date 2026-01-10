package ConditonalStatement;

public class GreatestOfFourElement {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 1;
		int d = 9;
		
		int big = a;
		if(big < b) {
			big = b;
		}
		if(big < c) {
			big = c;
		}
		if(big < d) {
			big = d;
		}
		
		System.out.println("Greater number is: "+ big);
	}
}
