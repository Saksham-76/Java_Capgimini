package method;

public class SmallestOfThreeNumber {
	public static void smallest(int a, int b, int c) {
		if(a < b && a < c) {
			System.out.println(a + " is smallest.");
		}else if(b < c) {
			System.out.println(b + " is smallest.");
		}else{
			System.out.println(c + " is smallest.");
		}
	}
	public static void main(String[] args) {
		smallest(4, 12, 1);
	}
}
