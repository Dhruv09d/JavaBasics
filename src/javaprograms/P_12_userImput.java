package javaprograms;
import java.util.Scanner;

public class P_12_userImput {

	public static void main(String args[]) {
		
		
		Scanner userInput = new Scanner(System.in);
		
		// input int type
		System.out.print("Enter the num1: ");
		int num1 = userInput.nextInt();
		
		System.out.print("Enter the num2: ");
		int num2 = userInput.nextInt();
		
		System.out.println("Product of num1 and num2: " + num1*num2);
		
//		input char type
		System.out.print("Enter the ch1: ");
		char ch1 = userInput.next().charAt(0);
		
		System.out.print("Enter the ch2: ");
		char ch2 = userInput.next().charAt(0);
			
		System.out.println("Input char: " + ch1 + " | " + ch2);
	
		
//		input string
		System.out.print("Enter the str1: ");
		String str1 = userInput.next();
		
		System.out.print("Enter the str2: ");
		String str2 = userInput.next();
		
		
		System.out.println("Input char: " + str1 + " | " + str2);

		
		
//		Line or sentence
		System.out.print("Enter the Line1: ");
		String line1 = userInput.nextLine();
		
		System.out.print("Enter the Line2: ");
		String line2 = userInput.nextLine();
		
		
		System.out.println("Input char: " + line1 + " | " + line2);
		
//		closing scanner resource just to suppress warning 
//		we programmers don't care about warnings but errors
//		also closing is scanner is not desirable
//		Thumb rule: don't close what you didn't open. – MC Emperor
//		userInput.close();
		
	}
	
	
}
