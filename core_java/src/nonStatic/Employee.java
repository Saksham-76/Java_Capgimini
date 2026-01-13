package nonStatic;

public class Employee {
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
	
	public static void main(String[] args) {
		Employee e1  = new Employee();
		Employee e2  = new Employee();
		e1.id = 102;
		e1.name = "Dinga";
		e1.salary = 4.05;
		System.out.println("id: "+ e1.id);
		System.out.println("name: "+ e1.name);
		System.out.println("Salary: "+ e1.salary);
		e1.work();
		e1.printData();
		
		e2.id = 105;
		e2.name = "Raju";
		e2.salary = 9.05;
		System.out.println("id: "+ e2.id);
		System.out.println("name: "+ e2.name);
		System.out.println("Salary: "+ e2.salary);
		e2.work();
		e2.printData();
	}
}
