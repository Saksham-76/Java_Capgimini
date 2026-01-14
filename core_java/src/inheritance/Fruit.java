package inheritance;

public class Fruit {
	String color;
	String name;
	
	public static void main(String[] args) {
		Apple a = new Apple("Kashmiri", "Red", 240);
		a.printAll();
	}
	
}

class Apple extends Fruit {
	int price;
	
	Apple(){
		
	}
	
	Apple(String name, String color, int price){
		this.name = name;
		this.color = color;
		this.price = price;
	}
	public void printAll() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
	}
}
