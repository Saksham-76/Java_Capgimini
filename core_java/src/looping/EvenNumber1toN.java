package looping;

public class EvenNumber1toN {
	public static void main(String[] args) {
		int n = 10;
		int i = 1;
		
		while( i <= n) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
