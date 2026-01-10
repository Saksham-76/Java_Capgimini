package assignment09thJan;

public class CountZeros {
	public static void main(String[] args) {
		int n = 10870650;
		int count = 0;
		
		while(n != 0) {
			int currNumber = n % 10;
			if(currNumber == 0) {
				count++;
			}
			n /= 10;
		}
		
		System.out.println("Total Zeros are: "+ count);
	}
}
