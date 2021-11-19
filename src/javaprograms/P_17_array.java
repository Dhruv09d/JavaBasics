package javaprograms;
import java.util.Scanner;
public class P_17_array {
//	static void printArray(int arr[]){  
//		for(int i=0;i<arr.length;i++)  
//		System.out.println(arr[i]);  
//	}  
	public static void main(String args[]) {
		
		int a[]=new int[5];//declaration and instantiation  
		a[0]=10;//initialization  
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
		a[4]=50;  
		//traversing array  
		for(int i=0;i<a.length;i++)//length is the property of array  
		System.out.println(a[i]);  
		
		System.out.println("using foreach");  
		
//		or
		for(int j: a) 
			System.out.println(j);  
		
		
		System.out.println("Another Way");  
//		************************************
		int b[]={33,3,4,5};//declaration, instantiation and initialization  
		for(int j: b) 
			System.out.println(j); 
		
		
//		manually input array
		int m[] = new int[4];
		int inp;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.println("Enter the value at index " + i + " : ");
			m[i] = sc.nextInt();
		}
		
		for (int j: m)
			System.out.print(j + "\t");  
		
		
		System.out.print("\n");
		
//	*******************************************
//		printArray(new int[]{10,22,44,66});//passing anonymous array to method  
	
	
//		ArrayIndexOutOfBoundsException
		
		
		int[][] arr=new int[3][3];//3 row and 3 column  
	
	}
	
	
}
