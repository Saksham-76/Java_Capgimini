package assignment10Jan;

public class HappyNumber {
	public static void isHappy(int n) {
		int temp = n;
        int sum;
        int count = 0;
        
        while (true) {
            sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + (digit * digit);
                temp = temp / 10;
            }

            if (sum == 1) {
                System.out.println(n + " is a Happy Number");
                break;
            }
            else if (count > 20) {
                System.out.println(n + " is not a Happy Number");
                break;
            }

            else {
                temp = sum;
                count++;
            }
        }
	}
	public static void main(String[] args) {
		int n = 98;
		isHappy(n);
	}
}
