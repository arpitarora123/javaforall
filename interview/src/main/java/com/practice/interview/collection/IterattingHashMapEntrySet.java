package com.practice.interview.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class IterattingHashMapEntrySet {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("arpit", "arora");
		hm.put("Pooja", "ARORA");

		Set entrySet = hm.entrySet();
		Collection keyValue = hm.values();

		for (Object c : entrySet.toArray()) {
			System.out.println(c);

		}

		// Iterator lets you remove the code while iterating
		Iterator iterator = entrySet.iterator();
		while (iterator.hasNext()) {

			// Map.Entry pair = (Map.Entry) iterator.next();
			// If there is no next statement in the loop it will be an infinite
			// loop
			System.out.println("HashMap is not empty!");
			System.out.println(iterator.next());
			// iterator.remove();
			// hm.put("Rahul", "Arora");
		}
	}
}
