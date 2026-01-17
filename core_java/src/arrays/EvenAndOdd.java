package arrays;
import java.util.Scanner;
public class EvenAndOdd {
	
	public static int countOddSum(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i] % 2 != 0) {
				sum += a[i];
			}
		}
		return sum;
	}
	public static int countEvenSum(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i] % 2 == 0) {
				sum += a[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int a[] = new int[sc.nextInt()];
		
		for(int i=0; i<a.length; i++) {
			System.out.print("enter the "+ i +"th element: ");
			a[i] = sc.nextInt();
			System.out.println();
		}
		int EvenSum = countEvenSum(a);
		int OddSum = countOddSum(a);
		
		System.out.println("Even Sum is: " + EvenSum);
		System.out.println("Odd Sum is: " + OddSum);
		
		
	}
}
