package assignment14thJan;

public class Vehicle {
	String color;
	
	public static void main(String[] args) {
		Bike b1 = new Bike("Honda", 100000, "Black");
		Car c1 = new Car("Suzuki", 1000000, "White");
		Bike b2 = new Bike("Honda", 80000, "Red");
		
		System.out.println(b1.brand);
		System.out.println(b1.price);
		System.out.println(b1.color);
		System.out.println(c1.brand);
		System.out.println(c1.price);
		System.out.println(c1.color);
		System.out.println(b2.brand);
		System.out.println(b2.price);
		System.out.println(b2.color);
	}
}

class Bike extends Vehicle{
	String brand;
	int price;
	
	Bike() {
		
	}
	
	Bike(String brand, int price, String color){
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
}

class Car extends Vehicle {
	String brand;
	int price;
	
	Car() {
		
	}
	
	Car(String brand, int price, String color){
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
}
