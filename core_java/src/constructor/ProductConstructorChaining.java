package constructor;

public class ProductConstructorChaining {
	int id;
	String name;
	int price;
	
	ProductConstructorChaining(int id){
		this.id = id;
	}
	
	ProductConstructorChaining(int id, String name){
		this(id);
		this.name = name;
	}
	ProductConstructorChaining(int id, String name, int price){
		this(id, name);
		this.price = price;
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
	}
	
	public static void main(String[] args) {
		ProductConstructorChaining p = new ProductConstructorChaining(01, "Pen", 10);
		p.display();
	}
}
