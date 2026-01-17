package arrays;

public class EvenElementsReturn {
	public static int[] evenElement(int[] arr) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				count++;
			}
		}
		
		int[] newArr = new int[count];
		int k=0;
		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
			if(arr[i] % 2 == 0) {
				newArr[k++] = arr[i];
//				System.out.println(arr[i]);
			}
		}
		
		return newArr;
		
	}
	
	public static void print(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr = {4,7,9,12,54,17};
		
		int[] newArr = evenElement(arr);
		
		print(arr);
		print(newArr);
	}
}
