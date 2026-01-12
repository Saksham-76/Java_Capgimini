package method;

public class ArmstrongNumber {
	static int countDigit(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n /= 10;
		}
		return count;
	}

	public static int findPowerWithWhileLoop(int b, int p) {
		int result = 1;
		while (p != 0) {
			result *= b;
			p--;
		}
		return result;
	}

	static int isArmstrong(int n, int p) {
		int sum = 0;
		while (n != 0) {
			int currNumber = findPowerWithWhileLoop(n % 10, p);
			sum += currNumber;
			n /= 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		int n = 163;
		int p = countDigit(n);

		int result = isArmstrong(n, p);

		if (n == result) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}

	}
}
