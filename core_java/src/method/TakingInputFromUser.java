package method;
import java.util.Scanner;
public class TakingInputFromUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		byte b = sc.nextByte();
		short s = sc.nextShort();
		int i = sc.nextInt();
		long l = sc.nextLong();
		
		float f = sc.nextFloat();
		double d = sc.nextDouble();
		
		boolean bool = sc.nextBoolean();
		
		String s1 = sc.next();
		String s2 = sc.nextLine();
		

		
		char c = sc.next().charAt(0);
		
	}
}
