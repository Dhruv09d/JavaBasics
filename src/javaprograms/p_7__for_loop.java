package javaprograms;

public class p_7__for_loop {
	
	
	public static void main(String args[]) {
		// Simple for loop
		
		// printing first 10 numbers
		int arr[] = new int[10];
		
		for (int i = 0; i < 10; i++ ) {
			System.out.println("index: "+ (i) + " : " + (i+1));
			arr[i] = i+1; // arr[0] = 1
		}
		
		System.out.println("For each");
		// foreach loop
//		arr[] = [1, 2, 3, 4,5, 6, 7, 8, 9, 10]
		for (int j: arr) {
			System.out.println("index: "+ (j - 1) + " : " + j);
		}
		
	}
}
