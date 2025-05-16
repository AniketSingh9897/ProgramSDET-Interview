package com.logical;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("A", 1);
		hm.put("B", 2);
		hm.put("C", 3);
		hm.put("D", 4);
		System.out.println(hm);
		System.out.println(hm.get("C"));
		hm.remove("C");
		System.out.println(hm);
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		// hashtable -pass table set collections
		while (it.hasNext()) {
			Map.Entry mp = (Map.Entry) it.next();//
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	}
}
