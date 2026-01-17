package arrays;

public class ZigZagMerge {
	public static int[] merge(int[] arr, int[] brr) {
		int[] ans = new int[arr.length + brr.length];
		
		int i=0;
		int j=0;
		int k = 0;
//		boolean check = true;
		
		while(i<arr.length && j<brr.length) {
//			if(check == true) {
//				ans[k++] = arr[i++];
//				check = false;
//			}else {
//				ans[k++] = brr[j++];
//				check = true;
//			}
//			
			if(k % 2 == 0) {
				ans[k++] = arr[i++];
			}else {
				ans[k++] = brr[j++];
			}
		}
		
		while(i<arr.length) {
			ans[k++] = arr[i++];
		}
		
		while(j<brr.length) {
			ans[k++] = brr[j++];
		}
		
		return ans;
	}
	public static void print(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] brr = {6,7,8,9};
		
		int[] ans = merge(arr, brr);
		
		print(ans);
 	}
}
