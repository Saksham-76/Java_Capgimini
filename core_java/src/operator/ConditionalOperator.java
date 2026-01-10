package operator;

public class ConditionalOperator {
public static void main(String[] args) {
	int a = 4;
	int b = 6;
	
	String res = (a < b)? "a is smaller than " : "a is greater than ";
	System.out.println(res + b);
}
}
