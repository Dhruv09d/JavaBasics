package javaprograms;

public class eleven_primeNumber {

	public static void main(String args[]) {
		
		int num = 1;
		boolean isPrime = true; 
		
		if (num == 0|| num == 1 ) {
			System.out.println(num + " Not a Prime number");
			System.exit(0);
		}
		
		for(int i = 2; i <= num / 2; i++ ) {
			if (num % i == 0) {
				isPrime = false;
				System.out.println(num + " Not a Prime number");
				System.exit(0);
			}
		}
		
		if (isPrime)
			System.out.println(num + " is a Prime Number");
		
	}
}
