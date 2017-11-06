package com.practice.interview.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo implements Comparable<ComparableDemo> {

	private int id;

	private String name;

	ComparableDemo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int compareTo(ComparableDemo obj) {
		return this.id - obj.id;
	}

	public static void main(String[] args) {
		List<ComparableDemo> list = new ArrayList<ComparableDemo>();

		ComparableDemo ComparableDemo1 = new ComparableDemo(1, "Arpit");
		ComparableDemo ComparableDemo2 = new ComparableDemo(2, "Arpit");
		ComparableDemo ComparableDemo3 = new ComparableDemo(3, "Arora");
		list.add(ComparableDemo1);
		list.add(ComparableDemo2);
		list.add(ComparableDemo1);
		list.add(ComparableDemo3);

		for (ComparableDemo comparableDemo : list) {
			System.out.println(comparableDemo);
		}

		Collections.sort(list);

		for (ComparableDemo comparableDemo : list) {
			System.out.println(comparableDemo);
		}

		System.out.println();

		// String and other wrapper classes have default implementation for
		// comaprable
		ArrayList<String> al = new ArrayList<String>();
		al.add("Czech");
		al.add("India");
		al.add("France");

		for (String string : al) {
			System.out.println(string);
		}

		Collections.sort(al);

		System.out.println();
		for (String string : al) {
			System.out.println(string);
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ComparableDemo [id=" + id + ", name=" + name + "]";
	}
}
