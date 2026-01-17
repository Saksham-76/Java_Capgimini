package has_a;

public class Driver {
	public static void main(String[] args) {
		Car car = new Car();
		car.setId(101);
		car.setColor("Red");
		car.setBrand("Toyota");
		
		Engine engine = new Engine();
		engine.setCC(1000);
		engine.setType("Manual");
		
		car.setEngine(engine);
		car.print();
	}
}
