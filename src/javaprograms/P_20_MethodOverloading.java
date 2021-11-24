package javaprograms;
class methodOverloading {
	int num1 = 1;
	int num2 = 2;
	int res;
	
	public void product() {
		res = num1 * num2;
		System.out.println(res);
	}
	
	public void product(int a, int b) {
		System.out.println(a*b);
	}
	
	public void product(double a, int b) {
		System.out.println(a*b);
	}
	
	public void product(int a, int b, int c) {
		System.out.println(a*b*c);
	}
		
}

public class P_20_MethodOverloading {
	public static void main(String args[]) {		
		methodOverloading mo =  new methodOverloading();
		mo.product();
		mo.product(2, 4);
		mo.product(2.3, 2);	
		mo.product(2, 3, 4);
	}
}
