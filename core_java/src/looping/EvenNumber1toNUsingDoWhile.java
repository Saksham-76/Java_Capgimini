package looping;

public class EvenNumber1toNUsingDoWhile {
	public static void main(String[] args) {
		int n=10;
		int i=1;
		
		do {
			if(i%2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}while(i <= n);
	}
}
