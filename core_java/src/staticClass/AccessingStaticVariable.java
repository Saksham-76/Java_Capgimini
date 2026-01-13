package staticClass;

public class AccessingStaticVariable {
	static int a = 10;
	static int b;
	static String pm = "modi";
	static String c;

	public static void e1() {
		int a = 20; // local variable
		System.out.println(a); // local variable will print
		System.out.println(AccessingStaticVariable.a); // global static variable

	}

	public static void e2() {
		System.out.println(Student.name);
	}

	public static void main(String[] args) {
		AccessingStaticVariable.e1();
		e2();
		Student.print();
	}
}

class Student {
	static String name = "Saksham";
	
	public static void print() {
		System.out.println("Print");
	}
}
