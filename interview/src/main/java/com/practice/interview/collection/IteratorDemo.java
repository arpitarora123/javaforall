package com.practice.interview.collection;

import java.util.ArrayList;
import java.util.Iterator;

// Q: Why we need iterator
public class IteratorDemo {

	public static void main(String[] args) {
		// ArrayList iterating with for each loop
		ArrayList al = new ArrayList();
		al.add("A");
		al.add(1);
		al.add("B");
		al.add(2);
		al.add("C");
		al.add(3);

		// Tricky output

		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + " ");
			al.remove(i);
		}
		System.out.println();
		System.out.println("Output generated using to string");
		System.out.println(al.toString());

		System.out.println("Output generated using iterator");
		Iterator iterator = al.iterator();

		while (iterator.hasNext()) {
			// We will end up in infinite loop if we don't use iterator.next()

			// illegal state exception if call before first next
			// iterator.remove();
			System.out.print(iterator.next() + " ");

			// Will remove one element and then will go to next iterator.next()
			// - > ConcurrentModificationException
			// al.remove(0);

			// removes last element from the iterator and the list(Collection)
			// as well
			iterator.remove();

		}
		System.out.println();
		System.out.println("Output generated using to string after iterator");
		System.out.println(al.toString());

	}

}
