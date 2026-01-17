package arrays;

public class ReplaceElementFromIndex {
	public static void replaceElementInIndex(int[] arr, int ele, int index) {
		
		for(int i=0; i<arr.length; i++) {
			if(i == index) {
				arr[i] = ele;
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		replaceElementInIndex(arr, 26, 1);
		
		ZigZagMerge.print(arr);
	}
}
