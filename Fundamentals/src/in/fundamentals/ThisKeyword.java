package in.fundamentals;

class Pen{
	Pen(){
		System.out.println("current value of this---->"+this.hashCode());
	}
}


public class ThisKeyword {

	public static void main(String[] args) {
		Pen p = new Pen();
		System.out.println("value of p---->"+p.hashCode());
		
		System.out.println("_________________________________");
		Pen p2 = new Pen();
		System.out.println("value of p2---->"+p2.hashCode());
		
	}

}
