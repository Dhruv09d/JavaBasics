package javaprograms;

public class P_9__break {
	
	public static void main(String args[]) {
		for (int i = 0; i < 10; i++ ) {
			if (i == 5) {
				System.out.println("Break");
				break;
			}
			else 
				System.out.println("Outside if: " + i);
		}
		
		System.out.println("OutSide loop");
	}
	
}
