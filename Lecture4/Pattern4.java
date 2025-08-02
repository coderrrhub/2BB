package Lecture3;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int row = 1;
		while(row <= N) {
			int counter = 1;
			while(counter <= row) {
				System.out.print("*");
				counter++;
			}
			
			// preparation for the next line
			System.out.println();
			row++;
		}
	}

}
