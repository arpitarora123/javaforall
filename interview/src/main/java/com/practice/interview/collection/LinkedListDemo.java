package com.practice.interview.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
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

		LinkedList<Person> customList = new LinkedList<Person>();

		// You can also user offer(Person) to add the element
		customList.add(new Person("Arpit", 25));
		customList.add(new Person("Swati", 25));
		customList.add(new Person("Demo", 99));

		customList.set(2, new Person("Arora", 28));

		// Removes swati
		customList.remove(1);

		// Must implements comparable
		// Collections.sort(customList);

		// Index out of bound
		// customList.set(3, new Person("Arora", 28));

		for (Person person : customList) {
			System.out.println("CustomList {}" + person);
		}

		System.out.println(customList.pop());
		System.out.println(customList.pop());

		// java.util.NoSuchElementException
		// System.out.println(customList.pop());

		// Return null if the list is empty
		System.out.println(customList.poll());

	}

	@Override
	public String toString() {
		return "ListDemo [toString()=" + super.toString() + "]";
	}
}
