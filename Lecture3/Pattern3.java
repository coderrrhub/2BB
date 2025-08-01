package Lecture3;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 4;
		int row = 1;
		while(row <= N) {
			int counter = 1;
			while(counter <= N) {
				System.out.print(counter);
				counter++;
			}
			
			// preparation for the next line
			System.out.println();
			row++;
		}
	}

}
