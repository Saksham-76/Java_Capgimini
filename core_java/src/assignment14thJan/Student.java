package assignment14thJan;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Result s1 = new Result(101, 94.5f, 'A');

		s1.setMarks(98.5f);
		System.out.println(s1.getMarks());
		s1.setGrade('B');
		System.out.println(s1.getGrade());
	}
}

class Result {
	private int id;
	private float marks;
	private char grade;

	Result() {

	}

	Result(int id, float marks, char grade) {
		this.id = id;
		this.marks = marks;
		this.grade = grade;
	}

	public float getMarks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id: ");
		int id = sc.nextInt();

		if (this.id != id) {
			System.out.println("your id is wrong.");
			return -1;
		}

		return this.marks;
	}

	public void setMarks(float marks) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id: ");
		int id = sc.nextInt();

		if (this.id != id) {
			System.out.println("your id is wrong.");
			return;
		}

		this.marks = marks;
	}

	public char getGrade() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id: ");
		int id = sc.nextInt();

		if (this.id != id) {
			System.out.println("your id is wrong.");
			return 'Z';
		}

		return this.grade;
	}

	public void setGrade(char grade) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id: ");
		int id = sc.nextInt();

		if (this.id != id) {
			System.out.println("your id is wrong.");
			return;
		}

		this.grade = grade;
	}
}
