package looping;

public class FindToDivisorsOf30 {
	public static void main(String[] args) {
		int count = 0;
		int n = 30;
		
		for(int i=1; i<=30; i++) {
			if(n%i==0) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
