package com.practice.interview.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSort {
	public static void main(String[] args) {
		// Not good for random access
		// Good for inserting item at the beginning O(1)
		// Good for item removal
		// Good for item insertion at the beginning
		// Not good for item insertion at the end
		// Java LinkedList used doubly LinkedList

		List<String> list = new LinkedList<String>();
		list.add("India");
		list.add(1, "Australia");
		list.add(2, "New Zealand");

		for (String string : list) {
			System.out.println("List {}" + string);
		}

		Collections.reverse(list);
		System.out.println("After reverse");
		for (String string : list) {
			System.out.println("List {}" + string);
		}

		Collections.sort(list);
		System.out.println("After sorting");
		for (String string : list) {
			System.out.println("List {}" + string);
		}
	}

	@Override
	public String toString() {
		return "ListDemo [toString()=" + super.toString() + "]";
	}
}
