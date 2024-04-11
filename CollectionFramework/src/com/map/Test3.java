package com.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test3 {

	public static void main(String[] args) {
		Map<Character,Integer> map = new LinkedHashMap<>();
		map.put('Z', 1);
		map.put('A', 3);
		map.put('B', -1);
		System.out.println(map);
		map.put(null, -4);
		System.out.println(map);
		
		System.out.println("______________________________________________");
		Map<Character,Integer> map2 = new TreeMap<>();
		map2.put('Z', 1);
		map2.put('A', 3);
		map2.put('B', -1);
		System.out.println(map2);
		map2.put(null, -4);
		System.out.println(map2);

	}

}
