package ConditonalStatement;

public class CalculaterUsingSwitchCase {
	public static void main(String[] args) {
		char op = '*';
		int a = 5;
		int b = 6;
		switch(op) {
			case '+':
				System.out.println(a + b);
				break;
			case '-':
				System.out.println(a - b);
				break;
			case '*':
				System.out.println(a * b);
				break;
			case '/':
				System.out.println(a / b);
				break;
				
			default:
				System.out.println("Invalid Operator");
		}		
			
	}
}
