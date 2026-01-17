package arrays;

public class SumOfDigits {
	public static int digitSum(int n) {
		int sum = 0;
		
		while(n != 0) {
			sum += n % 10;
			n /= 10;
		}
		
		return sum;
	}
	
	public static void replace(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int curr = arr[i];
			arr[i] = digitSum(curr);
		}
	}
	public static void print(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr = {12,32,4,16};
		replace(arr);
		print(arr);
	}
}
