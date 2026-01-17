package arrays;
import java.util.Scanner;
public class AllArrayType {
	
	public static void arrayInt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int[] a = new int[sc.nextInt()];
		
		for(int i=0; i<a.length; i++) {
			System.out.print("enter the "+ i +"th element: ");
			a[i] = sc.nextInt();
			System.out.println();
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
	}
	public static void arrayChar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		char[] a = new char[sc.nextInt()];
		
		for(int i=0; i<a.length; i++) {
			System.out.print("enter the "+ i +"th element: ");
			a[i] = sc.next().charAt(0);
			System.out.println();
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
	}
	public static void arrayFloat() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		float[] a = new float[sc.nextInt()];
		
		for(int i=0; i<a.length; i++) {
			System.out.print("enter the "+ i +"th element: ");
			a[i] = sc.nextFloat();
			System.out.println();
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
	}
	public static void arrayBoolean() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		boolean[] a = new boolean[sc.nextInt()];
		
		for(int i=0; i<a.length; i++) {
			System.out.print("enter the "+ i +"th element: ");
			a[i] = sc.nextBoolean();
			System.out.println();
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
//		int[] a = new int[5];
//		a[0] = 1;
//		a[1] = 2;
//		a[2] = 3;
//		a[3] = 4;
//		a[4] = 5;
//		
//		for(int i=0; i<a.length; i++) {
//			System.out.print(a[i] + " ");
//		}
//		System.out.println();
//		
//		char[] c = new char[3];
//		c[0] = 'a';
//		c[1] = 'b';
//		c[2] = 'c';
//		for(int i=0; i<c.length; i++) {
//			System.out.print(c[i] + " ");
//		}
//		System.out.println();
//		
//		String[] s = new String[3];
//		
//		s[0] = "Dinga";
//		s[1] = "Dingi";
//		s[2] = "Raju";
//		for(int i=0; i<s.length; i++) {
//			System.out.print(s[i] + " ");
//		}
//		System.out.println();
//		
//		boolean[] b = new boolean[3];
//		
//		b[0] = true;
//		b[1] = false;
//		b[2] = true;
//		for(int i=0; i<b.length; i++) {
//			System.out.print(b[i] + " ");
//		}
//		System.out.println();
//		
//		float[] f = new float[3];
//		
//		f[0] = 1.2f;
//		f[1] = 11.2f;
//		f[2] = 14.3f;
//		for(int i=0; i<f.length; i++) {
//			System.out.print(f[i] + " ");
//		}
//		System.out.println();
		arrayInt();
		arrayChar();
		arrayFloat();
		arrayBoolean();
	}
}
