package arrays;

public class RemoveElementInIndex {
	public static int[] removeElementInIndex(int[] arr, int ele, int index) {
		int[] newArr = new int[arr.length-1];
		int k=0;
		for(int i=0; i<arr.length; i++) {
			if(i != index) {
				newArr[k] = arr[i];
				k++;
			}
		}
		
		return newArr;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] ans = removeElementInIndex(arr, 2, 1);
		
		ZigZagMerge.print(ans);
	}
}
