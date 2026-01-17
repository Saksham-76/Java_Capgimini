package inheritance.upcastingdowncasting;

public class Parent {
	public void m1() {
		System.out.println("Parent member");
	}

	public static void main(String[] args) { 
		Parent p = new Child(); // Up Casting
		p.m1(); 
		Child c1 = (Child) p; // Down Casting
		c1.m1();
		c1.m2();
	}
}

class Child extends Parent {
	public void m2() {
		System.out.println("Child Member");
	}
}
