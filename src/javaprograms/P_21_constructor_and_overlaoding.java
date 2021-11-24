package javaprograms;

class ConstructorNStuff {
	
	int num1;
	int num2;
	int res;
	int num3;
	
	double num4;
	double num5;
	
	public ConstructorNStuff() {
		num1 = 1;
		num2 = 2;
		num3 = 3;
		System.out.println(num1 + num2 + num3);
				
	}
	
	public ConstructorNStuff(int a, int b) {
		num1 = a;
		num2 = b;
		System.out.println(num1 + num2 );
	}
	public ConstructorNStuff(int a, int b, int c) {
		num1 = a;
		num2 = b;
		num3 = c;
		System.out.println(num1 + num2 + num3);
	}
	public ConstructorNStuff(double g, double h, int c) {
		num4 = g;
		num5 = h;
		num3 = c;
		System.out.println(num3 + num4 + num5);
	}
	
}

public class P_21_constructor_and_overlaoding {

	public static void main(String args[]) {
		ConstructorNStuff obj_no_param = new ConstructorNStuff();
		
		ConstructorNStuff obj_two_param = new ConstructorNStuff(5, 6);
		
		ConstructorNStuff obj_three_param = new ConstructorNStuff(9, 8, 7);
		
		ConstructorNStuff obj_three_diffDtype_param = 
				new ConstructorNStuff(9.43, 8.2, 7);
				
	}
	
}
