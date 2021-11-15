
//		Types of variable in java 
		
//		1. local variable
//		2. Instance variable
//		3. Static variable

package javaprograms;

public class Two_javaVariables {
	
	
	static int static_Var = 69;  // Static variable
	
	static void some_method() {
		int local_var = 21;  // local variable
		
		System.out.println("Local variable: " + local_var);
	}
	
	
	public static void main(String args[]) {
		 
		int instance_var = 25; //instance variable    
		
		// can simply print instance and static variable 
		System.out.println("instance variable: " + instance_var);
		System.out.println("static variable: " +  static_Var);
		// need to call the method to get the local variable, 
//		method is static so there is no need to create an obj 
		some_method();
		
		
		
	
	}

}
