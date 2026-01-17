package polymorphism;

public class Math {
	public static float add(float n1, float n2) {
		System.out.println("2 float type");
		return n1 + n2;
	}
	
	public static double add(double n1, double n2) {
		System.out.println("2 double type");
		return n1 + n2;
	}
	
	public static void add(int a, int b) {
		System.out.println("2 int type");
		System.out.println(a + b);
	}
	public static void add(int a, int b, int c) {
		System.out.println("3 int type");
		System.out.println(a + b + c);
	}
	public static int add(int a, int b, int c, int d) {
		System.out.println("4 int type");
		return a + b + c + d;
	}
	
	public static void main(String[] args) {
		add(2, 4);
		add(3,4,5);
		System.out.println(add(4.5f, 5.5f));
		System.out.println(add(45.5d, 5.5d));
		System.out.println(add(4, 5, 6, 7));
	}
}
