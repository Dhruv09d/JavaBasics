package javaprograms;

public class P_10_continue {
	public static void main(String args[]) {
		for (int i = 0; i < 10; i++ ) {
			if (i == 5) {
				System.out.println("5 is skipped, continue");
				continue;
			}
			else 
				System.out.println("Outside if: " + i);
			
			System.out.println("Outside if-else: " + i);
		}
		
		System.out.println("OutSide loop");
	}
}
