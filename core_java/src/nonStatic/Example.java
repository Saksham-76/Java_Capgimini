package nonStatic;

public class Example {
	{
		System.out.println("N-S 1");
	}
	{
		System.out.println("N-S 2");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		Example e1 = new Example();
		Example e2 = new Example();
		System.out.println("main end");
	}
}
