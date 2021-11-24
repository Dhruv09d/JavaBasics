package javaprograms;


class ourFirstClass {
	
	int num1; // instance_variable
	int num2;
	int result;
	
	
	public ourFirstClass(int num1, int num2) {
		this.num1  = num1;
		this.num2 = num2;
				
	}
	
	
	public int product() {
		result = num1 * num2;
		return result;
		
	}
	public int sum() {
//		this.num1  = num1; 
//		this.num2  = num2;
			
		result = this.num1 + this.num2;
		return result;
		
	}
}


public class P_19_class {
	
	public static void main(String args[])  {
//		int a = 10;
//		int b = 70;
//		className obj_name = new ourFirstClass();
		ourFirstClass obj = new ourFirstClass(20, 80);
		
		int result = obj.product();
		System.out.println("Inside Main, result: " + result);	
		
		int res = obj.sum();
		System.out.println("Inside Main, res: " + res);
	}
	
	
	
	
	

}
