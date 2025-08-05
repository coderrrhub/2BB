package Lecture4;

public class Selection4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char day = 'a';
//		byte day = 12;
//		short s = 999;
		int day = 34;
		final int x = 1;
		final int y = 2;
		final int z = 3;
		switch(day) {
		case x:
				System.out.println("Mon");
				break;
		case y: System.out.println("Tues");
		break;
		case z: System.out.println("Wed");
		break;
		// case 8 + 2:
		case z + y: System.out.println("Hellll");
		default: System.out.println("No days");
		}
	}

}
