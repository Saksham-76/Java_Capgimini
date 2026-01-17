package schoolManagementApplication;

public class Student extends Person{
	private int rollNumber;
	private char grade;
	private Course course;
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	} 
}
