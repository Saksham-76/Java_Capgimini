package polymorphism;

public class Child extends Parent{
	@Override
	public void home() {
		System.out.println("red");
	}
	
	public static void home2() { // MEthod hiding
		System.out.println("Child static method");
	}
	public void bike() {
		System.out.println("Bike");
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();
		p.home2();
		Child s = new Child();
		s.home2();
		s.bike();
		
		Parent p2 = new Child();
		p2.home2();
	}
}
