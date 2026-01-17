package inheritance.superKeyword;

public class Product {
	String brand;

	Product() {

	}

	Product(String brand) {
		this.brand = brand;
	}

	public static void main(String[] args) {
		Mobile m = new Mobile(10000, "Aitel", "Realme");
		Laptop l = new Laptop(40000, "Intel I7", "Hp");

		m.printBrand();
//		System.out.println(m.brand);
		System.out.println(m.price);
		System.out.println(m.sim);

//		System.out.println(l.brand);
		l.printBrand();
		System.out.println(l.price);
		System.out.println(l.processor);
	}

}

class Mobile extends Product {
	int price;
	String sim;

	Mobile() {

	}

	Mobile(int price, String sim, String brand) {
		super(brand);
		this.price = price;
		this.sim = sim;
	}
	
	public void printBrand() {
		System.out.println(this.brand);
	}
}

class Laptop extends Product {
	int price;
	String processor;

	Laptop() {

	}

	Laptop(int price, String processor, String brand) {
		super(brand);
		this.price = price;
		this.processor = processor;
	}
	
	public void printBrand() {
		System.out.println(this.brand);
	}
}
