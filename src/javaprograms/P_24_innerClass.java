package javaprograms;


class outer {
	
	
	int a;
	public void displaySomething() {
		System.out.println("Inside Outer class");
	}
	
	
	class inner {	
		public void displaySomethingInside() {
			System.out.println("Inside Display!!");
		}
	}
	
	static class innerStatic {
		public void displaySomethingInsideStatic() {
			System.out.println("Inside static inner Display!!");
		}
	}
	
}



public class P_24_innerClass {
	public static void main(String args[]) {
		
		outer obj_outer = new outer();
		outer.inner obj_inner = obj_outer.new inner();
		obj_inner.displaySomethingInside();
		
		outer.innerStatic obj_static_inner = new outer.innerStatic();
		obj_static_inner.displaySomethingInsideStatic();
		
	}
}
