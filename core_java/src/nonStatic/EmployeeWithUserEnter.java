package nonStatic;
import java.util.Scanner;
public class EmployeeWithUserEnter {
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
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Object you want to create: ");
		int n = sc.nextInt();
		
		while(n != 0) {
			EmployeeWithUserEnter e = new EmployeeWithUserEnter();
			System.out.print("Enter the id: ");
			e.id = sc.nextInt();
			System.out.print("Enter the name: ");
			e.name = sc.next();
			System.out.print("Enter the salary: ");
			e.salary = sc.nextDouble();
			
			e.printData();
			n--;
		}
		
	}
}
