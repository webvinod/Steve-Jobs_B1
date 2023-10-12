package com.test.examples.collections;

import java.util.HashMap;
import java.util.Map;

public class MapListOne {
	public static void main(String[] args) {
		Map map = new HashMap<>();
		map.put("Name ", " Vinod");
		map.put("id ", " 137");
		map.put("Gender ", " Male");
		System.out.println(map);
		
		Map<String,String> mapOne = new HashMap<String,String>();
		mapOne.put("Name ", " Kumar");
		mapOne.put("id ", "140");
		System.out.println(mapOne);
		
		Map<String, Map> mapTwo = new HashMap<String, Map>();
		mapTwo.put("1", map);
		mapTwo.put("2", mapOne);
		System.out.println(mapTwo);
		
	}
}
