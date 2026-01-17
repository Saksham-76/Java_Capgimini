package has_a;

public class Car {
	private int id;
	private String color;
	private String brand;
	private Engine engine;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Engine getEngine() {
		return this.engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	Car() {

	}

	Car(int id, String color, String brand, Engine engine) {
		this.id = id;
		this.color = color;
		this.brand = brand;
		this.engine = engine;
	}

	public void print() {
		System.out.println(this.getId());
		System.out.println(this.getColor());
		System.out.println(this.getBrand());
		System.out.println(this.getEngine().getCC());
		System.out.println(this.getEngine().getType());
	}

}
