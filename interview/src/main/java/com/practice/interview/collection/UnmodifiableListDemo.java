package com.practice.interview.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Arpit");
		list.add("Arora");
		list.add("Rashmi");
		list.add("Kannaujia");

		/*
		 * Collections method throws NullPointerException if provided collection
		 * to them is null
		 */
		// List<String> unmodifiableList = Collections.unmodifiableList(null);

		List<String> unmodifiableList = Collections.unmodifiableList(new ArrayList<String>());
		// java.lang.UnsupportedOperationException
		// unmodifiableList.add("Why to modify");
		// unmodifiableList.add("Please do not modify");

		for (String s : list) {
			System.out.print(s + " ");
		}

		System.out.println();
		// Prints nothing as the initial unmodifiable list is empty
		for (String s : unmodifiableList) {
			System.out.print(s + " ");
		}

		/*
		 * We can assign new list reference to unmodifiable list as it's not
		 * final
		 */
		unmodifiableList = list;
		System.out.println();
		for (String s : unmodifiableList) {
			System.out.print(s + " ");
		}

	}

}
