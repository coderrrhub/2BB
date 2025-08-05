package Lecture5;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =14;
		int m = 20;
//		int sum = n + m;
		System.out.println(addTwoNumber(n, m));
		
		int x = 200;
		int y = 400;
//		int sum1 = x + y;
		System.out.println(addTwoNumber(x, y));
	}
	
	static int addTwoNumber(int a, int b) {
		int sum = a + b;
		return sum;
	}

}
