package arrays;

import java.util.Scanner;

public class SumOfElement {
	public static int[] arrayInt(int n) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[n];
		
		for(int i=0; i<a.length; i++) {
			System.out.print("enter the "+ i +"th element: ");
			a[i] = sc.nextInt();
			System.out.println();
		}
		
		return a;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		int[] a = new int[n];
		a = arrayInt(n);
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}
}
