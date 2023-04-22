package com.bldea.collectionclasses;

import java.util.ArrayList;

public class ArrayListcode2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		System.out.println(al);
		System.out.println(al.isEmpty());
		ArrayList al2 = (ArrayList)al.clone();
		System.out.println(al2);
		System.out.println(al.contains(150));
		System.out.println(al.contains(1500));
		
	 System.out.println(al.hashCode());
	 System.out.println(al.getClass());
	 System.out.println(al.lastIndexOf(125));
	 //returns last value of index no
	 System.out.println(al.lastIndexOf(150));
	 
	 System.out.println(al.lastIndexOf(122));
	 //returns -1 if there is no is not in list
	 
	 al.remove(4);
	 System.out.println(al);
	 
	 ArrayList al1 = new ArrayList();
		al1.add("Dhoni");
		al1.add("Virat");
		al1.add("Kohli");
		al.addAll(al1);
		System.out.println(al);
		al.removeAll(al1);
		System.out.println(al);	
		al.add(0,"Virat");
		
		System.out.println(al);
		
		al.set(0,"Rohit");
		System.out.println(al);	
		System.out.println(al.size());
		Object[] array = al.toArray();
		
}}	 

