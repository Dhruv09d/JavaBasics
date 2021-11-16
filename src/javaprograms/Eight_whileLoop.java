package javaprograms;

public class Eight_whileLoop {

	public static void main(String args[]) {
//		WHile Loop
		
//		Only difference b/w while and do while is
//		if initially the condition is false 
//		Do while will execute at least once 
		

//		int limit = -1;
		
		int limit = -1;
		int i = 0;
		
		while (i <= limit) {
			System.out.println("inside while: " + i);
			i+=1; // i++ or i = i + 1 
		}

		
		
//		do while
		i = 0;	
		do {
			System.out.println("inside Do while: " + i);
			i+=1; // i++ or i = i + 1 
		} while(i <= limit);
		
	}
	
}
