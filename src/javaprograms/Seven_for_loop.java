package javaprograms;

public class Seven_for_loop {
	
	
	public static void main(String args[]) {
		// Simple for loop
		
		// printing first 10 numbers
		int arr[] = new int[10];
		for (int i = 1; i < 11; i++ ) {
			System.out.println(i);
			arr[i-1] = i;
		}
		
		System.out.println("For each");
		// foreach loop
		for (int j: arr) {
			System.out.println(j);
		}
		
	}
}
