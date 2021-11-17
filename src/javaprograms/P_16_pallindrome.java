package javaprograms;

import  java.util.Scanner;

public class P_16_pallindrome {
	
	public static void main(String args[]) {
		
		
		int n, rev = 0, m;
		
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = n;
		/*
		 * pall.. = 
		 * 121 = 121 == yes
		 * 123 = 321 == No
		 * 
		 * 
		 * rev = 3
		 * num = 12
		 * 
		 *  rev = 32
		 *  num = 1
		 *  
		 *  321
		 *  
		 * 
		 */
		
		
		 while(n != 0) {
		 
		        rev = rev * 10 + n % 10;
		        n = n / 10;
		       
		        
		 }
		 System.out.println(rev);
		 
		 
		 if (m == rev) {
			 System.out.println("true");
		 } else {
			 System.out.println("false");
		 }
		
		 System.out.println(rev);
		
	}
	
}
