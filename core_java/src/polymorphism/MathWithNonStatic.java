package polymorphism;

public class MathWithNonStatic {
	public  float add(float n1, float n2) {
		System.out.println("2 float type");
		return n1 + n2;
	}
	
	public double add(double n1, double n2) {
		System.out.println("2 double type");
		return n1 + n2;
	}
	
	public void add(int a, int b) {
		System.out.println("2 int type");
		System.out.println(a + b);
	}
	public void add(int a, int b, int c) {
		System.out.println("3 int type");
		System.out.println(a + b + c);
	}
	public int add(int a, int b, int c, int d) {
		System.out.println("4 int type");
		return a + b + c + d;
	}
	public static void main(String[] args) {
		MathWithNonStatic m = new MathWithNonStatic();
		m.add(2, 4);
		m.add(3,4,5);
		System.out.println(m.add(4.5f, 5.5f));
		System.out.println(m.add(45.5d, 5.5d));
		System.out.println(m.add(4, 5, 6, 7));

	}
}
