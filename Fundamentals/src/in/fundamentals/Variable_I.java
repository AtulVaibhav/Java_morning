package in.fundamentals;
/**
 * Instance Variable:
 * variables declared outside function without static keyword
 * object is required to access instance variable.
 * Syntax: data_type varName = value;
 * every object maintains its own copy of instance variable
 */
public class Variable_I {
    int data = 200;
	public static void main(String[] args) {
		//creating an object:
		//className objName = new className();
		
		Variable_I obj = new Variable_I();
		System.out.println(obj.data);
		
		Variable_I obj2 = new Variable_I();
		System.out.println("__________________________");
		System.out.println("Before modifying the data");
		System.out.println(obj.data);
		System.out.println(obj2.data);
		System.out.println("_______________________");
		System.out.println("After modifying the data");
		obj.data = 500;
		System.out.println(obj.data);
		System.out.println(obj2.data);
		
		
		
		
	}

}
