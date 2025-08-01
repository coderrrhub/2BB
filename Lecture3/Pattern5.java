package Lecture3;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int N = 5;
		int space = N-1;
		int star = 1;
		int row = 1;
		while(row <= N) {
			// work
			// print for space
			int i = 1;
			while(i <= space) {
				System.out.print(" ");
				i++;
			}
			
			// print for star
			int j = 1;
			while(j <= star) {
				System.out.print("*");
				j++;
			}
			// preparation for the next line
			System.out.println();
			row++;
			star++;
			space--;
		}
	}

}
