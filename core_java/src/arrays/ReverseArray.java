package arrays;

public class ReverseArray {
	
	public static void swap(int i, int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void reverse(int[] arr) {
		int i=0;
		int j=arr.length-1;
		
		while(i<j) {
			swap(i,j,arr);
			i++;
			j--;
		}
	}
	
	public static void print(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		print(arr);
		reverse(arr);
		print(arr);
	}
}
