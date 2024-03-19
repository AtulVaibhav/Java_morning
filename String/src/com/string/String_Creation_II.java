package com.string;

public class String_Creation_II {

	public static void main(String[] args) {
		String str = new String("Hello");
		String str2 = new String("Hello");
		if(str==str2){
			System.out.println("Points to same location");
		}else{
			System.out.println("Points to different location");
		}
	}

}
