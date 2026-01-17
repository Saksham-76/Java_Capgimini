package has_a;

public class CollegeDriver {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setId(101);
		s.setName("Rahul");
		
		Trainer t = new Trainer();
		
		t.setName("Raju");
		t.setStudent(s);
		t.setSubject("JAVA");
		
		
		College c = new College();
		c.setClgName("IEM");
		c.setLocation("Kolkata");
		c.setStudent(s);
		c.setTrainer(t);
		
		c.print();
	}
}
