package assignment10Jan;

public class FindLeapYearWithIfElse {
	
	public static boolean isLeapYear(int year) {
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int year = 2024;
		boolean leapYear =  isLeapYear(year);
		if(leapYear == true) {
			System.out.println(year + " is Leap year");
		}else {
			System.out.println(year + " is not leap year");
		}
	}
}
