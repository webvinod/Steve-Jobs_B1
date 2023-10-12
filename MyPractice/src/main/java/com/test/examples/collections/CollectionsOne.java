package com.test.examples.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsOne {
	
	public static void main(String[] args) {
		Set set = new TreeSet<>();
		set.add(10);
		set.add(20);
		set.add(40);
		set.add(90);
		System.out.println(set);
	
		Set set1 = new HashSet<>();
		set1.add(01);
		set1.add(2);
		set1.add(4);
		set1.add(9);
		System.out.println(set1);
	}
	

}
