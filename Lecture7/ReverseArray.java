package Lecture6;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		int start = 0, end = arr.length-1;
		while(start <= end) {
			swap(arr, start, end);
			start++;
			end--;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
	}
	
	static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
