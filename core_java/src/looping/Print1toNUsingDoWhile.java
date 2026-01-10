package looping;

public class Print1toNUsingDoWhile {
	public static void main(String[] args) {
		int n =10;
		int i=1;
		
		do {
			System.out.print(i + " ");
			i++;
		}while(i <= n);
	}
}
