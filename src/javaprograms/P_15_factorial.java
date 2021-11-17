package javaprograms;

import java.util.Scanner;

public class P_15_factorial {

	public static void main(String args[]) {
		
		/*
		 n = n * (n-1) * (n-2) *  ... * 1
		 5 = 5 * 4 * 3 ... 1
	  */
		
		int n, i;
		Scanner sc = new Scanner(System.in);
		
//		 taking user input
		System.out.print("Enter the number: ");
		n = sc.nextInt();
		int res = 1;
		for (i = n; i > 0; i--) {
			res = res * i;
		}
		
		System.out.println(res);
		
		i = n;
		res = 1;
		while(i > 0) {
			res = res * i;
			i--;
		}
		System.out.println(res);
		
//		do while 
		
		
		
		
	}
	
}
