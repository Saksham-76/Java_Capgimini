package method;

public class Calculator {
	public static void sub(int a, int b) {
		System.out.println(a - b);
	}
	public static void mul(int a, int b) {
		System.out.println(a * b);
	}
	public static void div(int a, int b) {
		System.out.println(a / b);
	}
	public static void add(int a, int b) {
		System.out.println(a + b);
	}
	public static void main(String[] args) {
		add(5,6);
		sub(9,3);
		mul(3,4);
		div(10,5);
	}
}
