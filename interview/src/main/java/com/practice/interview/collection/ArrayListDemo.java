package com.practice.interview.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		// Initial default Capacity is 10
		// Good for random access O(1)
		// Good for inserting item at the end
		// Not good for item removal
		// Not good for item insertion at the beginning or in the middle
		List<String> list = new ArrayList<String>();
		list.add("India");
		list.add(1, "Australia");
		list.add(2, "New Zealand");

		// New entry, shifts/Move the records
		list.add(1, "Germany");

		System.out.println("Size " + list.size());

		for (String string : list) {
			System.out.println("List " + string);
		}

		// no new entry, update the existing record
		list.set(1, "Germany update");

		// Indext out of bound
		// list.set(4, "Germany update");

		System.out.println("Size {} " + list.size());

		for (String string : list) {
			System.out.println("List {}" + string);
		}

		List<Integer> intList = new ArrayList<Integer>();
		// Size 0
		System.out.println(intList.size());
		// toString []
		System.out.println(intList.toString());
		// length 0
		System.out.println(intList.toArray().length);

		intList.add(1);
		intList.add(2);
		// Size 2
		System.out.println(intList.size());
		// toString [1, 2]
		System.out.println(intList.toString());
		// length 2
		System.out.println(intList.toArray().length);

	}

	@Override
	public String toString() {
		return "ListDemo [toString()=" + super.toString() + "]";
	}
}
