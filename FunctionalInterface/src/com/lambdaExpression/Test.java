package com.lambdaExpression;

@FunctionalInterface
interface Calculation{
	//void m1();
	//int m2();
	
	//int largestElement(int a,int b);
	
	int maximumElement(int[] arr);
	
}

//class CalculationImpl implements Calculation{
//
//	@Override
//	public void m1() {
//		System.out.println("Hello m1()");
//		
//	}
//	
//}

public class Test {

	public static void main(String[] args) {
//		Calculation cal = new CalculationImpl();
//		cal.m1();
		
//		Calculation cal = ()->{System.out.println("Hello m1()");};
//		cal.m1();
		
//		Calculation cal = ()->{ return 10;};
//		System.out.println(cal.m2());
		
//		Calculation cal = (a,b)->{
//			if(a>b){
//				return a;
//			}
//			return b;
//		};
//		
//		System.out.println(cal.largestElement(34, 67));
//		
		
		Calculation cal = (arr)->{
			int max = arr[0];
			for(int data:arr){
				if(data>max){
					max = data;
				}
			}
			return max;
		};
		int[] arr = {4,5,3,2,7,9};
		System.out.println(cal.maximumElement(arr));
		
	}

}
