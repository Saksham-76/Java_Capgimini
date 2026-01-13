package constructor;

public class Laptop {
	String brand;
	int price;
	
	Laptop(String brand, int price){
		this.brand = brand;
		this.price = price;
	}
	
	public static void compare(Laptop l1, Laptop l2) {
		if(l1.price > l2.price) {
			System.out.println(l1.brand + " is higher price");
		}else {
			System.out.println(l2.brand + " is higher price");
		}
	}
	
	public static void main(String[] args) {
		Laptop l1 = new Laptop("hp", 54000);
		Laptop l2 = new Laptop("dell", 145000);
		
		compare(l1, l2);
		
	}
}
