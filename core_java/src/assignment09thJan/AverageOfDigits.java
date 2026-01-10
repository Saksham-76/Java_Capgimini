package assignment09thJan;

public class AverageOfDigits {
	public static void main(String[] args) {
		int n = 123;
		int sum = 0;
		int count = 0;
		
		while(n != 0) {
			sum += n % 10;
			count++;
			
			n /= 10;
		}
//		System.out.println(sum);
//		System.out.println(count);
		
		System.out.println("The Average is: "+ sum/count);
	}
}
