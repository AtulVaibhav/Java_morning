package in.fundamentals;

public class Operators {
    public static void arithmeticOperator(){
    	int a = 20;
    	int b = 15;
    	System.out.println(a+b);
    	System.out.println(a-b);
    	System.out.println(a*b);
    	System.out.println(a/b);
    	System.out.println(a%b);
    	System.out.println("_____________________________");
    }
    
    public static void relationalOperator(){
    	int a = 20;
    	int b = 15;
    	System.out.println(a>b);
    	System.out.println(a>=b);
    	System.out.println(a<b);
    	System.out.println(a<=b);
    	System.out.println(a==b);
    	System.out.println(a!=b);
    	System.out.println("_________________________________");
    }
    
    public static void logicalOperator(){
    	boolean x=true;
    	boolean y =false;
    	
    	int m= 10;
    	int n = 9;
    	System.out.println(x&&y);
    	System.out.println((m>n) && (m!=n));
    	System.out.println((m>n) || (m==n));
    	System.out.println(!(!(m>n) || (m==n)));
    	System.out.println("_________________________________");
    	
    }
    public static void unaryOperator(){
    	int a=20;
    	System.out.println(-a);
    	
    	int x = 10;
    	int y = x++;
    	System.out.println(x+" "+y);
    	//11,10
    	
    	y = ++x;
    	System.out.println(x+" "+y);//x = 12,11,11  y=12,12,12
    	
    	System.out.println("_______________________________");
    }
    
    public static void assignmentOperator(){
    	int a = 12;
    	System.out.println(a);
    	a += 10;// a = a+10
    	System.out.println(a);
    	a -=5;
    	System.out.println(a);
    	System.out.println("___________________________");
    }
    
    public static void ternaryOperator(){
    	int x=5;
    	int y=10;
    	int result = x>3?1:0;
    	System.out.println(result);
    	int result2 = x<y?y!=x?1:0:-1;
    	System.out.println(result2);
    	System.out.println("___________________________");
    }
    
    public static void bitwiseOperator(){
    	int x=10; //01010
    	int y=20; //10100
    	
    	System.out.println(x&y);
    	System.out.println(x|y);
    	System.out.println(x^y);
    	System.out.println(~x);  // -(x+1)
    	System.out.println("____________________________");
    }
    
     public static void shiftOperator(){
    	 int x=8;
    	 System.out.println(x<<3);
    	 int y=12;
    	 System.out.println(y>>3);
    	 System.out.println("__________________________");
     }
     
     public static void instanceOf(){
    	 String str = "Java";
    	 if(str instanceof String){
    		 System.out.println(str.toUpperCase());
    	 }
     }
	public static void main(String[] args) {
	   arithmeticOperator();
       relationalOperator();
       logicalOperator();
       unaryOperator();
       assignmentOperator();
       ternaryOperator();
       bitwiseOperator();
       shiftOperator();
       instanceOf();
	}

}
