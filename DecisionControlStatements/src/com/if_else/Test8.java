package com.if_else;

public class Test8 {

	public static void main(String[] args) {
		//break
		for(int i=1;i<=10;i++){
			if(i==5)break;
			System.out.println(i);
		}
		
		System.out.println("_______________________________");
		
		//continue:
		for(int i=1;i<=10;i++){
			if(i==5)continue;
			System.out.println(i);
		}

	}

}
