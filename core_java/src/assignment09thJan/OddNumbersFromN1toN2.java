package assignment09thJan;

public class OddNumbersFromN1toN2 {
	public static void main(String[] args) {
		int n1 = 6;
		int n2 = 31;
		
		//Using Do-While Loop
		
		do {
			if(n1 % 2 != 0) {
				System.out.print(n1+ " ");
			}
			n1++;
		}while(n1 <= n2);
		System.out.println();
		//Using while loop
		n1 = 6;
		n2 = 31;
		
		while(n1 <= n2) {
			if(n1 % 2 != 0) {
				System.out.print(n1 + " ");
			}
			n1++;
		}
	}
}
