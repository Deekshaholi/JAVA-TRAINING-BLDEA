package com.bldea.collectionclasses;

import java.util.LinkedList;

public class LinkedListCode {
public static void main(String[]args) {
	LinkedList ll = new LinkedList();
	ll.add(100);
	ll.add(50);
	ll.add(150);
	ll.add(25);
	ll.add(75);
	ll.add(125);
	ll.add(175);
	System.out.println(ll);
	ll.addFirst(1000);
	ll.addLast(2000);
	System.out.println(ll);
	ll.offer(5000);
	System.out.println(ll);
	ll.push(111);
	System.out.println(ll);
	
	ll.pop();
	System.out.println(ll);
	
	
	
	
}
}
