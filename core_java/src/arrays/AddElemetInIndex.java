package arrays;

public class AddElemetInIndex {
	public static int[] addElementInIndex(int[] arr, int ele, int index) {
		int[] newArr = new int[arr.length + 1];
		
		int i=0;
		int k=0;
		while(i<newArr.length) {
			if(i == index) {
				newArr[i] = ele;
			}else {
				newArr[i] = arr[k++];
			}
			i++;
		}
		
		return newArr;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] ans = addElementInIndex(arr, 22, 3);
		
		ZigZagMerge.print(ans);
	}
}
