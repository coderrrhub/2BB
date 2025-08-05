package Lecture4;

public class Selection6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		for(int i = 1; i <= n; i++) {
			if(i == 7) 
				break;
			
			if( i % 2 == 1) {
				continue; // skip the below line and move to the updation part
			}
			
			System.out.println(i);
		}
	}

}
