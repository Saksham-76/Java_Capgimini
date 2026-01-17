package arrays;

public class MergetwoSortedArray {
	public static int[] merge(int[] arr, int[] brr) {
		
		int i=0;
		int j=0;
		int[] ans = new int[arr.length + brr.length];
		int k=0;
		
		while(i<arr.length && j<brr.length) {
			if(arr[i] > brr[j]) {
				ans[k++] = arr[i++];
			}else {
				ans[k++] = brr[j++];
			}
		}
		
//		while(i<arr.length) {
//			ans[k++] = arr[i++];
//		}
//		while(j<brr.length) {
//			ans[k++] = brr[j++];
//		}
		
		return ans;
	}
	public static void print(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,4,6};
		int[] brr = {3,5,7,9};
		
		int[] ans = merge(arr, brr);
		
		print(ans);
	}
}
