/*
 * types of method 
 * 1 static 
 * 2 instance (non-static)- req obj 
 * 3.
 * 
 */




package javaprograms;


public class P_18_first_method {
	
	

public static void sumTwoNum(int num1, int num2) {
	int c = num1 + num2;
	System.out.println("Sum of Two number: " + c );
}	
public static int sumTwoNumWithReturnTypeInt(int num1, int num2) {
	int c = num1 + num2;
	
	return c;
}	

	public static void main(String args[]) {
//		static method with no return type
		System.out.println("Static method called, "
				+ "no return type: "); 
		sumTwoNum(5, 6);
		
//		*******************************************
//		static method with return type
		System.out.println("Static method called, "
				+ "int return type: ");
		int resSum = sumTwoNumWithReturnTypeInt(7, 8);
		System.out.println("Sum of Two number: " + resSum );
		
//		or 
		
		System.out.println("Sum of Two number: " +
		sumTwoNumWithReturnTypeInt(7, 8) );
		
//		*******************************************
		
		
	}
	

}
