package nonStatic;

public class EmployeeUsingThisKeyword {
	int id;
	String name;
	double salary;
	
	public void work() {
		System.out.println(name + " is working");
	}
	public void printData() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	public void initialize(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public static void main(String[] args) {
		EmployeeUsingThisKeyword e = new EmployeeUsingThisKeyword();
		e.initialize(102, "Ram", 4.14d);
		e.printData();
		
	}
}
