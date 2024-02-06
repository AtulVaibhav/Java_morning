package in.fundamentals;

public class Method_II {
   int a = 100;
   static int b = 200;
   
   
   public void m1(){
	 System.out.println(a);
	 System.out.println(b);
   }
   
 public static void m2(){
	   System.out.println(new Method_II().a);
	   System.out.println(b);
   }
	public static void main(String[] args) {
		Method_II obj = new Method_II();
		obj.m1();
		
		Method_II.m2();
	}

}
