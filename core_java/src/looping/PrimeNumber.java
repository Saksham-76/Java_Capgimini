package looping;

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 37;
		if(n%2 == 0) {
			System.out.println("This is not prime number");
		}else {
			for(int i=2; i<= n/2; i++) {
				if(n%i == 0) {
					System.out.println("This number is not prime.");
					break;
				}
				if(i == n/2) {
					System.out.println("This is a prime number");
					break;
				}
			}
		}
		
	}
}
