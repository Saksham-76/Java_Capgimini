package constructor;

public class Student {
	int id;
	String name;

	public Student() {
		System.out.println("Construtor");
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println(id);
		System.out.println(name);
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.display();
		Student s2 = new Student(101, "Saksham");
		s2.display();
	}
}
