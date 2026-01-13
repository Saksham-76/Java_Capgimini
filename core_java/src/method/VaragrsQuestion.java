package method;

public class VaragrsQuestion {
	public static void print(String... s) {
		String newStr = "";
		for(String i:s) {
			newStr += i;
		}
		System.out.println(newStr);
	}
	
	public static void findMax(double...ds ) {
		double maxValue = 0.0d;
		for(double d:ds) {
			maxValue = (maxValue > d)? maxValue: d;
		}
		System.out.println("Maximum value is: "+ maxValue);
	}
	public static void main(String[] args) {
		print("Sak","sham"," ", "sin","gh");
		findMax(3.6,6.0,3.2,4.2);
	}
}
