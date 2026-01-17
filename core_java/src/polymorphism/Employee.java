package polymorphism;

public class Employee {
	int id;
	String name;
	long salary;
	String department;
	
	Employee(int id){
		this.id = id;
	}
	
	Employee(int id, String name) {
//		this.id = id;
		this(id);
		this.name = name;
	}
	Employee(int id, String name, long salary){
//		this.id  = id;
//		this.name = name;
		this(id, name);
		this.salary = salary;
	}
	Employee(int id, String name, long salary, String department){
//		this.id  = id;
//		this.name = name;
//		this.salary = salary;
		this(id, name, salary); // Constructor chaining
		this.department = department;
	}
	
	public void print() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(this.department);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(101);
		Employee e2 = new Employee(102, "Raju");
		Employee e3 = new Employee(103, "Dinga", 40000);
		Employee e4 = new Employee(104, "Saksham", 30000, "IT");
		e1.print();
		System.out.println("----------------");
		e2.print();
		System.out.println("----------------");
		e3.print();
		System.out.println("----------------");
		e4.print();
	}
}
