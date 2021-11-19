package javaprograms;
import java.util.Scanner;
public class Z_array {

	
	public static void main(String args[]) {
		
//		1-D array 
//		[1, 2, 3, 4, 5]
		
		
//		datatype var_arr[] = new datatype[SIZE];
//		int a[] = new int[5];
//		a[0] = 12;
//		a[1] = 25;
//		a[2] = 37;
//		a[3] = 40;
//		a[4] = 53;
//		
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Index "+ i + " : " + a[i]);
//		}
//		
////		int i =0;
//		for(int val: a) {
//			System.out.println(val) ;
//		}
//		
//		int b[] = {1, 3, 4, 6, 8};
//		
//		for(int val: b) {
//			System.out.println(val) ;
//		}
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the size of array");
//		int size = sc.nextInt();
//		
//		
//		int a[] = new int[size];
//		
//		
//		for(int i = 0; i < size; i++) {
//			System.out.println("Enter the value at index: " + i + " : " );
//			a[i] = sc.nextInt();
//			
//		}
//		
//		for (int j: a) {
//			System.out.print(j + "\t");
//		}
//		
//		
		int arr[][] = new int[2][3];
		
		int arr1[][] = {
						{1, 2, 3},
						{4, 5, 6}
					};
		
		int arr2[][] = new int[2][3];
 		/*
		 * [       0   1  2
		 * 		0 [00  01 02]
		 * 		1 [10  11 12]
		 * ]
		 * 
		 * * [     0   1  2
		 * 		0 [0   1  2]
		 * 		1 [0   1  2]
		 * ]
		 * 
		 * 
		 */
		
		
		for (int i = 0; i< 2; i++ ) {
			
			for (int j = 0; j < 3; j++ ) {
				System.out.println("Enter the value at index: "
						+ "[" + i + "][" + j + "]: " );
				arr[i][j] = sc.nextInt();  
//				System.out.println(arr[i][j] + "\t"); 
			}
		}
		
//		printing 
//		for (int i = 0; i< 2; i++ ) {
//			
//			for (int j = 0; j < 3; j++ ) {
//				System.out.print(arr[i][j] + "\t"); 
//			}
//			System.out.print("\n"); 
//		}
		
		
		for (int i = 0; i< 2; i++ ) {
			
			for (int j = 0; j < 3; j++ ) {
				arr2[i][j] =  arr[i][j] + arr1[i][j];
//				System.out.println(arr[i][j] + "\t"); 
			}
		}
		
		
		for (int i = 0; i< 2; i++ ) {
		
		for (int j = 0; j < 3; j++ ) {
			System.out.print(arr2[i][j] + "\t"); 
		}
		System.out.print("\n"); 
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
