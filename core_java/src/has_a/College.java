package has_a;

public class College {
	private String clgName;
	private String location;
	private Student student;
	private Trainer trainer;
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	
	public void print() {
//		System.out.println("-----------College-------");
		System.out.println("College Name: " + this.getClgName());
		System.out.println("College Location: " + this.getLocation());
		System.out.println("Student Name: " + this.getStudent().getName());
		System.out.println("Student id: " + this.getStudent().getId());
		System.out.println("Trainer Name: " + this.getTrainer().getName());
		System.out.println("Trainer Subject: " + this.getTrainer().getSubject());
//		System.out.println(this.getTrainer().getStudent());
	}
	

}
