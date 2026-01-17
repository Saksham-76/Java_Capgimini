package inheritance.upcastingdowncasting;

public class Helper {
	
	public static void main(String[] args) {
		Bike b = new Bike();
		getVechile(b);
	}
	public static void getVechile(Vehicle v) {
		if(v instanceof Bike) {
			((Bike) v).noOfWheels();
		} else if( v instanceof Car) {
			((Car) v).noOfPassengers();
		}else if(v instanceof Train) {
			((Train) v).tickets();
		}
	}
}