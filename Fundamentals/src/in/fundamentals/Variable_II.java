package in.fundamentals;
/**
 * Static Variable
 * variables declared outside the function with static keyword
 * className/object, but recommended way:className
 * static variables get initialized during class loading
 * Syntax: static data_type varName = value;
 * every object share the common copy of static data
 *
 */
public class Variable_II {
    static int data = 500;
	public static void main(String[] args) {
		//Using className:
		System.out.println(Variable_II.data);
		
		//Using object
		Variable_II obj1 = new Variable_II();
		System.out.println(obj1.data);
		
		Variable_II obj2 = new Variable_II();
		
		System.out.println("_______________________");
		System.out.println("Before modifying the data");
		System.out.println(obj1.data);
		System.out.println(obj2.data);
		
		
		System.out.println("_______________________");
		System.out.println("After modifying the data");
		obj1.data = 1000;
		System.out.println(obj1.data);
		System.out.println(obj2.data);
		
		
		
		

	}

}
