package polymorphism;

public class FindMax {
	public int max(int a, int b) {
		return (a > b)? a:b;
	}
	
	public int max(int a, int b, int c) {
		return ((a > b) && (a > c))? a:(b>c)? b:c; 
	}
	
	public int max(int a, int b, int c, int d) {
		return ((a>b) && (a>c) && (a>d))? a:((b>c) && (b>d))? b:(c>d)? c:d;
	}
	
	public float max(int a, float b) {
		return ((float)a > b)? a:b;
	}
	
	public static void main(String[] args) {
		FindMax m = new FindMax();
		System.out.println(m.max(2, 6));
		System.out.println(m.max(5, 6, 10));
		System.out.println(m.max(12, 16, 30, 40));
		System.out.println(m.max(12, 4.4f));
	}
}
