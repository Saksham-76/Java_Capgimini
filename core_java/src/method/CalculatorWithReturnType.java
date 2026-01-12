package method;

public class CalculatorWithReturnType {
	public static int sub(int a, int b) {
		return a - b;
	}

	public static int mul(int a, int b) {
		return a * b;
	}

	public static int div(int a, int b) {
		return a / b;
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
//		int add = add(2, 4);
//		int sub = sub(10,4);
//		int mul = mul(3,5);
//		int div = div(9,3);
		int a = 8;
		int b = 8;
		char op = '/';

		switch (op) {
		case '+':
			int add = add(a, b);
			System.out.println("add: " + add);
			break;
		case '-':
			int sub = sub(a, b);
			System.out.println("sub: " + sub);
			break;
		case '*':
			int mul = mul(a, b);
			System.out.println("mul: " + mul);
			break;
		case '/':
			int div = div(a, b);
			System.out.println("div: " + div);
			break;
		default:
			System.out.println("Enter Wrong operator.");
		}

//		System.out.println("add: "+ add);
//		System.out.println("sub: "+ sub);
//		System.out.println("mul: "+ mul);
//		System.out.println("div: "+ div);
	}
}
