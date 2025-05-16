package com.logical;

import java.util.HashSet;
import java.util.Iterator;


public class SetClass {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("aniket");
		hs.add("test");
		System.out.println(hs);
		System.out.println(hs.remove("test"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		Iterator<String> i = hs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
