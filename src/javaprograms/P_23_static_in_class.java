package javaprograms;

class Emp {
	int id, salary;
	static String owner;
	
	static {
		owner = "Lara";
		System.out.println("inside static: " + owner);
	}
	
	public Emp() {
		id = 1;
		salary = 200;
//		name = "Json Brody";
		System.out.println("inside constructor: " + owner);
	}
	
	public void show() {
		System.out.println(id + " : " + salary + " : " + owner);
	}	
}

public class P_23_static_in_class {
	
	public static void main(String args[]) {
		
		Emp obj = new Emp();
		obj.id = 10;
		obj.salary = 3000;
//		obj.owner = "Lara";
		
		obj.show();
		
		Emp obj1 = new Emp();
//		obj1.owner = "Lara";
		obj1.show();
		
		Emp obj2 = new Emp();
//		obj2.owner = "Lara";
		obj2.show();
	}
}
