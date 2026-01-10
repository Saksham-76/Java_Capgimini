package looping;

public class PrintNto1UsingDoWhile {
	public static void main(String[] args) {
		int n = 10;
		
		do {
			System.out.print(n + " ");
			n--;
		}while(n >= 1);
	}
}
