package arrays;

public class BiggestAndSmallestElement {
	
	
	public static int[] check(int[] arr) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			min = min < arr[i]? min:arr[i];
			max = max > arr[i]? max:arr[i];
		}
		
		return new int[] {min, max};
	}
	
	public static void main(String[] args) {
		int[] arr = {3,4,5,67,2,3,59};
		
		int[] ans = check(arr);
		
		System.out.println("Minimun: "+ ans[0]);
		System.out.println("Maximum: "+ ans[1]);
	}
}
