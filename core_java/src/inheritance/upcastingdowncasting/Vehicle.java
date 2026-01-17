package inheritance.upcastingdowncasting;

public class Vehicle {
	public void  travel() {
		System.out.println("Your are travelling");
	}
	
	public static void main(String[] args) {
		Vehicle v1 = new Car();
		v1.travel();//upcasting
		Car c2 = (Car)v1;
		c2.travel();
		c2.noOfPassengers(); // Down casting
		
		v1 = new Bike();
		v1.travel();//upcasting
		Bike b1 = (Bike) v1;
		b1.travel();
		b1.noOfWheels(); // Down Casting
		
		v1 = new Train();
		v1.travel(); // Up casting
		Train t1 = (Train) v1;
		t1.travel();
		t1.tickets(); // Down Casting
		
		v1 = new Car();
		Train t2 = (Train) v1;
	}
}

class Car extends Vehicle {
	public void noOfPassengers() {
		System.out.println("Total number of passengers is 4");
	}
}

class Bike extends Vehicle {
	public void noOfWheels() {
		System.out.println("Total number of wheels is 2");
	}
}

class Train extends Vehicle {
	public void tickets() {
		System.out.println("Price of ticekt is 250rs");
	}
}
