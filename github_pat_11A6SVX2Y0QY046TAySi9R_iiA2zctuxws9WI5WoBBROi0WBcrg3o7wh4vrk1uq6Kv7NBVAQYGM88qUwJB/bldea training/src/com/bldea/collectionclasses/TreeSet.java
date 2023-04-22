package com.bldea.collectionclasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class TreeSet {
	public static void main(String[]args) {
		LinkedHashSet ll = new LinkedHashSet();
		ll.add(100);
		ll.add(50);
		ll.add(600);
		ll.add(150);
		ll.add(25);
		ll.add(900);
		ll.add(75);
		ll.add(125);
		ll.add(175);
		System.out.println(ll);
		TreeSet ts = new TreeSet();
		
		ArrayList al = new ArrayList();
		al.addAll(ll);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		System.out.println(ts);
		int pos = Collections.binarySearch(al,175);
		System.out.println(pos);
}
}