package assignment09thJan;

public class DivisibleBy3And5 {
	public static void main(String[] args) {
		int number = 15;
		
//		System.out.print((number%3==0 && number%5==0)? "Yes ":"No ");
//		System.out.print("Number is Divisible by both 3 and 5");
		
		Boolean check3 = (number%3==0)? true:false;
		System.out.println(check3? "Divisible by 3": "Not divisible by 3");
		Boolean check5 = (number%5==0)? true:false;
		System.out.println(check5? "Divisible by 5": "Not divisible by 5");

		
	
		
		
	}
}
