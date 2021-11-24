package javaprograms;

class const_methods_eg {
	
	int  num1, num2, res;
	
	public const_methods_eg(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	public void product() {
		System.out.println(this.num1 * this.num2);
	}
	

}

public class P_22_constructor_n_methods {

	public static void main(String args[]) {
		
		const_methods_eg obj = new const_methods_eg(5, 6);
		
		const_methods_eg obj1 = new const_methods_eg(6, 7);
		
		obj.product();
		
		obj1.product();
		
		
		
		
		
		
		
	}
	
	
	
	
}
