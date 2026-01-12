package method;
import java.util.Scanner;
public class TakeInputOfUserDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.print("Enter your weight: ");
		int weight = sc.nextInt();
		
		System.out.print("Enter your height: ");
		int height = sc.nextInt();
		
		System.out.print("Enter your Gender: ");
		char gender = sc.next().charAt(0);
		
		System.out.print("Enter your Phone Number: ");
		long phNumber = sc.nextLong();
		String n = sc.nextLine();
		
		System.out.print("Enter your Email: ");
		String email = sc.nextLine();
		
		
		
		System.out.println("Name: "+ name);
		System.out.println("age: "+ age);
		System.out.println("weight: "+ weight);
		System.out.println("height: "+ height);
		System.out.println("gender: "+ gender);
		System.out.println("phNumber: "+ phNumber);
		System.out.println("Email: "+ email);
		
	}
}
