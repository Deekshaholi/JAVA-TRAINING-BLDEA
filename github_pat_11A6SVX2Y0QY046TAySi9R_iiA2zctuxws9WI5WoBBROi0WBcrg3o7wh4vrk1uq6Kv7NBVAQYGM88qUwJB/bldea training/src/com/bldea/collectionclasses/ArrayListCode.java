package com.bldea.collectionclasses;

import java.util.ArrayList;

public class ArrayListCode {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20.89);
		al.add(20.0f);
		al.add(40);
		System.out.println(al);
		al.add(50);
		al.add(true);
		al.add('s');
		System.out.println(al);
		ArrayList al1 = new ArrayList();
		System.out.println(al1);
		al1.addAll(al);
		System.out.println(al1);
		al1.addAll(2,al); //refers to position and value 
		System.out.println(al1);

		
	
	
	
}
}
