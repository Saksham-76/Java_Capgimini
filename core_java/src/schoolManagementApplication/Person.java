package schoolManagementApplication;

public class Person {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		
		s.setRollNumber(101);
		s.setGrade('A');
		
		Course c = new Course();
		
		c.setCourseId(1111);
		c.setCourseName("JAVA");
		s.setCourse(c);
		
		s.setName("Raju");
		s.setAge(22);
		
		
		
		
		StudentCourse sc = new StudentCourse();
		sc.showStudentCourseDetails(s);
	}
}
