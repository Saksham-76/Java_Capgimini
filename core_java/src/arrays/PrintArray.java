package arrays;

public class PrintArray {
	public static void print(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public static void print(String[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] a = {4,6,7,9};
		String[] s = {"Hello", "Dinga", "Raju"};
		
		print(a);
		print(s);
	}
}
