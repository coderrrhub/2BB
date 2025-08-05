package Lecture4;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12346577;
		int sum = 0;
		int pos = 1;
		while(n > 0) {
			int rem = n % 10;
			if(pos % 2 == 0) {
				sum = sum + rem;
			}
			n = n / 10;
			pos++;
		}
		
		System.out.println(sum);
	}

}
