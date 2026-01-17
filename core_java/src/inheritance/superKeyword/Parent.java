package inheritance.superKeyword;

public class Parent {
	String name;
	public Parent(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		Child c = new Child("XYZ", 888);
		System.out.println(c.name);
		System.out.println(c.phone);
	}
}

class Child extends Parent{
	long phone;
	
	public Child(String name, long phone) {
		super(name);
		this.phone = phone;
	}
	
	
}
