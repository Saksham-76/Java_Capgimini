package object;

public class Laptop {
	String brand;
	int price;
	static int prevPrice;

	Laptop() {
	}

	Laptop(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	public void compare(Laptop l1) {
		if (this.price > l1.price) {
			System.out.println(this.brand + " is higher price.");
		} else {
			System.out.println(l1.brand + " is higher price.");
		}
	}

	public static void main(String[] args) {
		Laptop l1 = HelpLaptop.verifyPrice("HP", 550000);
//		Laptop l2 = HelpLaptop.getLaptopWithData("Dell", 15000);
//		l1.brand = "HP";
//		l1.price = 50000;
//		l2.brand = "Dell";
//		l2.price = 45000;
//		l1.compare(l2);
		
//		System.out.println(l1.brand);
//		System.out.println(l1.price);

	}
}
