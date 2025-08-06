package Lecture6;

public class SwapElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		swap2(arr, 0, arr.length-1);
		System.out.println(arr[0] +"  "+arr[arr.length-1]);
		
		int a = 10;
		int b = 20;
		swap(a, b);
		System.out.println(a+ "  "+b);
	}
	
	static void swap2(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
