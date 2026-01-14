package object;

public class HelpLaptop {
	public static Laptop getLaptop() {
		return new Laptop();
	}
	
	public static Laptop getLaptopWithData(String brand, int price) {
		return new Laptop(brand, price);
	}
	public static Laptop verifyPrice(String brand, int price) {
		if(price < 30000 || price > 200000) {
			System.out.println("Enter valid Price.");
			return null;
		}
		System.out.println("Laptop is created.");
		return getLaptopWithData(brand, price);
	}
}
