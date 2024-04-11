package com.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test2 {
    public static void findRepeatingCharacters(String str){
    	Map<Character,Integer> map = new LinkedHashMap<>();
    	for(int i=0;i<str.length();i++){
    		if(map.containsKey(str.charAt(i))){
    			map.put(str.charAt(i), map.get(str.charAt(i))+1);
    		}else{
    			map.put(str.charAt(i),map.getOrDefault(str.charAt(1),1));
    		}
    	}
    	
    	for(Map.Entry<Character, Integer> entry:map.entrySet()){
    		if(entry.getValue()>1){
    			System.out.println(entry.getKey());
    		}
    	}
    	
    	
    }
	public static void main(String[] args) {
		String str = "ABCDACDE";
		findRepeatingCharacters(str);

	}

}
