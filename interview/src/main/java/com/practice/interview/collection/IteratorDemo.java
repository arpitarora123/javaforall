package com.practice.interview.collection;

import java.util.ArrayList;

// Q: Why we need iterator
public class IteratorDemo {

	public static void main(String[] args) {
		// ArrayList iterating with for each loop
		ArrayList al = new ArrayList();
		al.add("A");
		al.add(1);
		al.add("B");
		al.add(2);

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
			al.remove(i);
		}

	}

}
