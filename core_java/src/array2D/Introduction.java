package array2D;
import java.util.Scanner;
public class Introduction {
	
	public static void print(int[][] a) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
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
		
		print(a);
		
	}
}
