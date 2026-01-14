package encapsulation;

public class Student {
	String name;
	private int pass;

	Student() {

	}

	Student(String name, int pass) {
		this.name = name;
		this.pass = pass;
	}

	public int getPass() { // getter method
		return pass;
	}

	public void setPass(int pass) { // setter method
		this.pass = pass;
	}
}