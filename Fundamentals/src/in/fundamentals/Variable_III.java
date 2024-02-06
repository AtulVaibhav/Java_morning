package in.fundamentals;

/**
 * Local Variable
 * variables declared inside a function
 * local variables can be accessed inside function only.
 * outside function we can't access it directly.
 *
 */



public class Variable_III {
    public void m1(){
    	int a = 10;
    	System.out.println(a);
    }
	public static void main(String[] args) {
		Variable_III obj = new Variable_III();
		//System.out.println(obj.a);
		//System.out.println(Variable_III.a);
		obj.m1();

	}

}
