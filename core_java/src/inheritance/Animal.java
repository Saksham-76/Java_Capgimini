package inheritance;

public class Animal {
	String name;
	String color;
	int noOfLegs;

	public void printAll() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(noOfLegs);
	}

	public static void main(String[] args) {
		Dog d = new Dog("Sheru", "Black", 4);
		d.printAll();
	}
}

class Dog extends Animal {
	Dog() {

	}

	Dog(String name, String color, int noOfLegs) {
		this.name = name;
		this.color = color;
		this.noOfLegs = noOfLegs;
	}

}