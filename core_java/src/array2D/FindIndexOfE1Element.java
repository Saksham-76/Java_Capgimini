package array2D;

import java.util.Scanner;

public class FindIndexOfE1Element {
	public static void findElement(int[][] arr, int e1) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j] == e1) {
					System.out.println(i+ " " + j);
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the elements: ");
		int[][] a = new int[2][3];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("enter the element: ");
		int e1 = sc.nextInt();
		
		findElement(a, e1);
		
	}
}
