package operator;

public class GreatestOfThreeNumbers {
public static void main(String[] args) {
	int a = 9;
	int b = 18;
	int c = 5;
	
	int n = (((a > b) && (a > c))? a: (b>c)? b : c) ;
	System.out.println(n);
}
}
