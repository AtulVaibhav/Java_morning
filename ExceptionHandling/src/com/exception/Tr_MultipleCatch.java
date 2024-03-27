package com.exception;

public class Tr_MultipleCatch {
   public void m1(){
	   try{
		   int[] arr = {1,2,3};
		   System.out.println(arr[6]);
		   
		   String str = "Hello";
		   System.out.println(str.charAt(7));
	   }catch(NullPointerException npe){
		   System.out.println("Exception handled by first catch");
	   }catch(ArrayIndexOutOfBoundsException ex){
		   System.out.println("Exception handled by second catch");
	   }catch(Exception e){
		   System.out.println("Exception handled by third catch");
	   }
   }
	public static void main(String[] args) {
		new Tr_MultipleCatch().m1();

	}

}
