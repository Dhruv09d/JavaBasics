//if statement
//if-else statement
//if-else-if ladder
//nested if statement



package javaprograms;

public class Five_ifStatement {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		// if only 
		System.out.println("if only");
		if (a < b) {
			System.out.println("a is smaller");
		}
		
		
		// if else
		System.out.println("\nif else");
		if (a > b) {
			System.out.println("a is greater");
		} else {
			System.out.println("b is greater");
		}
		
		
//		if else if ladder
		System.out.println("\nif else if ladder");
		if (a > b && a > c) {
			System.out.println("a is greater");
		} 
		
		else if(b > a && b > c) {
			System.out.println("b is greater");
		} 
		else {
			System.out.println("c is greater");
		}
		
//		nested if 
		System.out.println("\nnested if ");
		if (a > b) {
			if (a > c ) {
				System.out.println("a is greater");
			}
			else {
				System.out.println("c is greater");
			}
		} else if (b > a) {
			if (b > c ) {
				System.out.println("b is greater");
			}
			else {
				System.out.println("c is greater");
			}
		} else {
			System.out.println("c is greater");
		}
	
	}
}
