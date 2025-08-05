package Lecture5;

public class BostonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 378;
		int sum1 = sumOfDigit(n);
		int sum2 = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0 && isPrime(i)) {
				int cnt = countNoOfTimes(n, i);
				sum2 += (sumOfDigit(i) * cnt);
			}
		}
		
		System.out.println(sum1 + " "+ sum2);
		if(sum1 == sum2) {
			System.out.println("Boston");
		} else {
			System.out.println("Not");
		}
	}
	
	static boolean isPrime(int n) {
		if(n == 1) {
			return false;
		}
		for(int i = 2; i*i <= n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	static int countNoOfTimes(int n, int primeFactor) {
		int cnt = 0;
		while(n % primeFactor == 0) {
			cnt++;
			n /= primeFactor;
		}
		
		return cnt;
	}
	
	static int sumOfDigit(int n) {
		int sum = 0;
		while(n > 0) {
			int rem = n % 10;
			sum += rem;
			n /= 10;
		}
		
		return sum;
	}

}
