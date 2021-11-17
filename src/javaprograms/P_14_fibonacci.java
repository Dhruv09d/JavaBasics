package javaprograms;

public class P_14_fibonacci {

	public static void main(String args[]) {
	// n1  n2  nv	
//		0  1   1    2 3 5 8 13
//         n1  n2	nv	
		int n1 = 0, n2 = 1, nxtVal;
		
		
		int terms = 8;
		for (int i = 0; i < terms; i++) {
			
			if (i == 0 || i == 1) {
				System.out.print(i  + "\t");
			} else {
				nxtVal = n1 + n2;
				n1 = n2;
				n2 = nxtVal;
				
				System.out.print(nxtVal  + "\t");
			}
					
		}
		
		
	}
	
	
}
