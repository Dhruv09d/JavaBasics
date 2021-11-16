package javaprograms;

import java.util.Scanner;

public class P_13_validatingUserInput {
	
public static void main(String args[]) {
		int num1;
		int num2;
		
		Scanner userInput = new Scanner(System.in);
		
		// input int type
		System.out.print("Enter the num1: ");
		boolean Cnum1 = userInput.hasNextInt();
		System.out.println(Cnum1);
		if(Cnum1) { 
			num1 = userInput.nextInt();
		} else
			num1 = 1;
//		clear input buffer in order to use hasNextInt again
		userInput.nextLine();
		
		
		System.out.print("Enter the num2: ");
		boolean Cnum2 = userInput.hasNextInt();
		System.out.println(Cnum2);
		if(Cnum2) { 
			num2 = userInput.nextInt();
		} else
			num2 = 1;
		
		System.out.println("Product of num1 and num2: " + num1*num2);
	}
}
