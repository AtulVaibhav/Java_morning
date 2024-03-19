package com.stringbuffer;

public class Test3 {
   public static String getReverse(String str){
	   StringBuffer sb = new StringBuffer(str);
	   return(sb.reverse().toString());
   }
	public static void main(String[] args) {
		System.out.println(getReverse("Java"));

	}

}
