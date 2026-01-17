package inheritance.superKeyword;

public class Human {
	String name;
	int age;
	char gender;

	Human() {

	}

	Human(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public static void main(String[] args) {
		Student s = new Student("Raji", 21, 'F', 95.4f);
		Employee e = new Employee("Saksham", 33, 'M', 101, 40000l);
		s.print();
		e.print();
	}
}

class Employee extends Human {
	int id;
	long salary;

	Employee() {

	}

	Employee(String name, int age, char gender, int id, long salary) {
		super(name, age, gender);
		this.id = id;
		this.salary = salary;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.gender);
		System.out.println(this.id);
		System.out.println(this.salary);
	}
}

class Student extends Human {
	float percentage;

	Student() {

	}

	Student(String name, int age, char gender, float percentage) {
//		super(name, age, gender);
		super.name = name;
		super.age = age;
		super.gender = gender;
		this.percentage = percentage;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.gender);
		System.out.println(this.percentage);
	}
}