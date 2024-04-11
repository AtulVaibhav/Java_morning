package com.map;

import java.util.HashMap;
import java.util.Map;

public class Duplicates {
    public static void findDuplicates(int[] arr){
    	Map<Integer,Integer> map = new HashMap<>();
    	for(int data:arr){
    		if(map.containsKey(data)){
    			map.put(data, map.get(data)+1);
    		}else{
    			map.put(data, map.getOrDefault(data, 1));
    		}
    	}
    	System.out.println(map);
    	System.out.println("Duplicate elements");
    	for(Map.Entry<Integer, Integer> entry : map.entrySet()){
    		if(entry.getValue()>1){
    			System.out.println(entry.getKey());
    		}
    	}
    }
	public static void main(String[] args) {
		int[] arr = {1,2,1,3,4,2,5,9,7,9,8};
		findDuplicates(arr);

	}

}
