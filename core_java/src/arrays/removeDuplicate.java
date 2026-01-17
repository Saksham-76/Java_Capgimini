package arrays;

public class removeDuplicate {
	public static void swap(int i, int j, int[] arr) {
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}
	public static int[] remove(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			int curr = arr[i];
			for(int j=i+1; j<arr.length; j++) {
				if(curr > arr[j]) {
					swap(i, j, arr);
				}
			}
		}
		int size = 0;
			
		for(int i=0; i<arr.length; ) {
			int count = 1;
			int curr = arr[i];
			int j=i+1;
			while(j < arr.length && arr[j] == curr) {
				count++;
				j++;
			}
			System.out.println(arr[i] + "- " + count);
			count=1;
			size++;
			i=j;
			
		}
		print(arr);

		int[] ans = new int[size];
		int k=0;
		int i=0;
		while(k<arr.length-1) {
			if(arr[k] != arr[k+1]) {
				ans[i++] = arr[k];
				System.out.println(arr[k]);
			}
			k++;
		}
		if(arr[k] != arr[k-1]) {
			ans[i++] = arr[k];
		}
		print(ans);
		
		return ans;
		
		
	}
	public static void print(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,5,3,6,4,5};
		int[] ans = remove(arr);
		print(ans);
	}
}
