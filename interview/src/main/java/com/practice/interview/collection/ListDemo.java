package com.practice.interview.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		// Initial default Capacity is 10
		// Good for random access O(1)

		List<String> list = new ArrayList<String>();
		list.add("India");
		list.add(1, "Australia");
		list.add(2, "New Zealand");

		// New entry, shifts/Move the records
		list.add(1, "Germany");

		System.out.println("Size {} " + list.size());

		for (String string : list) {
			System.out.println("List {}" + string);
		}

		// no new entry update the existing record
		list.set(1, "Germany update");

		// Indext out of bound
		// list.set(4, "Germany update");

		System.out.println("Size {} " + list.size());

		for (String string : list) {
			System.out.println("List {}" + string);
		}

	}

	@Override
	public String toString() {
		return "ListDemo [toString()=" + super.toString() + "]";
	}
}
