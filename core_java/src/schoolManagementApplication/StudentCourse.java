package schoolManagementApplication;

public class StudentCourse {
	public void showStudentCourseDetails(Student student) {
		System.out.println("student roll number: " + student.getRollNumber());
		System.out.println("student name: " + student.getName());
		System.out.println("age: "+ student.getAge());
		System.out.println("grade: " + student.getGrade());
		System.out.println("course id: " + student.getCourse().getCourseId());
		System.out.println("course name: " + student.getCourse().getCourseName());
	}
}
