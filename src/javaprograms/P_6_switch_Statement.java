package javaprograms;

public class P_6_switch_Statement {

	
	public static void main(String args[]) {
		// Switch implemetation
		
		int a = 20;
		int b = 10;
		int c;
		String choice = "okiu"; 
		switch(choice) {
		
		case "addition":
			c = a + b;
			System.out.println(c);
			break;
		
		
		case "multiply":
			c = a * b;
			System.out.println(c);
			break;
		
		
		case "division":
			c = a / b;
			System.out.println(c);
			break;
			
			
		case "subtract" :
			c = a - b;
			System.out.println(c);
			break;
		
		
		default:
			System.out.println("Please enter valid choice: ");
			break;
		
		}		
	}
}
