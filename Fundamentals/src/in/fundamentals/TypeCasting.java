package in.fundamentals;

public class TypeCasting {

	public static void main(String[] args) {
		//implicit type-casting
		byte a = 100;
		int b = a;
		System.out.println(a+" "+b);
		
		//explicit type-casting
		int c = 100;
		byte d = (byte)c;
		System.out.println(c+" "+d);
		
		
		//data-loss
		int x = 150;
		byte y = (byte)x;
		System.out.println(x+" "+y);
		
		

	}

}
