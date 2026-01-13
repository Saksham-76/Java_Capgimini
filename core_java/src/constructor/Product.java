package constructor;

public class Product {
	int id;
	String name;
	int price;
	int rating;
	
	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Product(int id, String name, int price, int rating) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
		System.out.println(rating);
	}
	
	public static void main(String[] args) {
		Product p1 = new Product(101, "Pen");
		Product p2 = new Product(101, "book", 50);
		Product p3 = new Product(101, "Box", 20, 5);
		
		p1.display();
		p2.display();
		p3.display();
		
	}
	
	
}
