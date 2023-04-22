package com.bldea.collectionclasses;
import java.util.ArrayList;
import java.util.ArrayList;

public class ArrayListCode1 {
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
al.clear();
System.out.println(al);
ArrayList al1 = new ArrayList();
al1.add("Dhoni");
al1.add("Virat");
al1.add("Kohli");
al.addAll(al1);
System.out.println(al);
System.out.println(al.contains(al1));
}}
