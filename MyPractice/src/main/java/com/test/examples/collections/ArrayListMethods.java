package com.test.examples.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		List<Integer> listOne = new ArrayList<Integer>();
		
		list.add(10);
		list.add(30);
		list.add(90);
		System.out.println("just a list"+list);
		list.add(1, 20);
		System.out.println("Adding a value through particular position"+list);
		listOne.add(100);
		listOne.add(110);
		System.out.println("Adding a list to another list "+list.addAll(listOne)); 
		System.out.println("List with both list dispaly here "+list);
		list.clear();
		System.out.println("checking the clear method "+list);
		list.addAll(0, listOne);
		System.out.println("using add all with index value"+list);
		/*In the below list contains when i pass the listOne to check it says false but the value 
		there in the list are listOne values but when i pass them individually it say true. why?
		Ans: we have contains and containsAll if we want a single value we go for contains but 
		If we want a entire list to check then we go for containsAl*/
		System.out.println("checking contains method "+list.contains(100));
		System.out.println("Checking containsAll method "+list.containsAll(listOne));
		System.out.println("geting a value through index (Get method) "+list.get(1)); 
		System.out.println("hashCode method "+list.hashCode());
		System.out.println("finding index value "+list.indexOf(110));
		System.out.println("checking the list "+list.isEmpty());
		//System.out.println("last index of the list "+ list/*list.lastIndexOf(listOne)*/); ?
		System.out.println("Removeing the value from the object "+list.remove(0));
		System.out.println(list);
		System.out.println(list.remove(list));
		System.out.println(list.size());
		
		
		
		
	}
}
