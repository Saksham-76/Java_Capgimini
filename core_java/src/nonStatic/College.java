package nonStatic;

public class College {
	String name;
	String location;
	
	public void exam() {
		System.out.println("Your Exam location is "+ location);
	}
	
	public void printCollege() {
		System.out.println(name);
		System.out.println(location);
		exam();
	}
	public static void main(String[] args) {
		College c1 = new College();
		College c2 = new College();
		College c3 = new College();
		
		c1.name = "IEM";
		c1.location = "Kolkata";
		c2.name = "BCROY";
		c2.location = "Durgapur";
		c3.name = "IIT Delhi";
		c3.location = "Delhi";
		
		c1.printCollege();
		c2.printCollege();
		c3.printCollege();
	}
}

