package com.practice.interview.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class IterattingHashMapKeySet {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("arpit", "arora");
		hm.put("Pooja", "ARORA");

		Set keySet = hm.keySet();
		// List keyValue = (List) hm.values();

		// Iterator lets you remove the code while iterating
		Iterator iterator = keySet.iterator();
		while (iterator.hasNext()) {

			// If there is no next statement in the loop it will be an infinite
			// loop
			System.out.println("HashMap is not empty!");
			System.out.println(iterator.next());
			// iterator.remove();
			// hm.put("Rahul", "Arora");
		}

	}

}
