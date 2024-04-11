package com.map;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("Vivek", 21);
		map.put("Avinash", 34);
		map.put("Arun", 24);
		System.out.println(map);
		
		map.put(null, 12);
		System.out.println(map);
		
		System.out.println(map.containsKey("Avinash"));
		System.out.println(map.containsValue(35));
		
		System.out.println(map.size());
		
		//traversal of map
		for(Map.Entry<String, Integer> entry: map.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		
		
		
		

	}

}
