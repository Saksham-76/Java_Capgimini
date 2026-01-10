package ConditonalStatement;

public class WithoutBreak {
	public static void main(String[] args) {
		switch(1) {
		case 1: 
//			System.out.println("c1");
			int a = 5;
		
		System.out.println(a);
		
		case 2: {
			System.out.println("c2");
		}
		
		case 3: {
			System.out.println("c3");
		}
		
		default: {
			System.out.println("No match");
		}
		}
	}
}
