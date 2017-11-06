package com.practice.interview.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo implements Comparator<ComparatorDemo> {

	private int id;

	private String name;

	ComparatorDemo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int compare(ComparatorDemo o1, ComparatorDemo o2) {
		return o1.name.compareTo(o2.name);
	}

	public static void main(String[] args) {
		List<ComparatorDemo> list = new ArrayList<ComparatorDemo>();

		ComparatorDemo comparableDemo1 = new ComparatorDemo(1, "Arpit");
		ComparatorDemo comparableDemo2 = new ComparatorDemo(2, "Rahul");
		ComparatorDemo comparableDemo3 = new ComparatorDemo(3, "Arora");
		list.add(comparableDemo1);
		list.add(comparableDemo2);
		list.add(comparableDemo1);
		list.add(comparableDemo3);

		for (ComparatorDemo comparatorDemo : list) {
			System.out.println(comparatorDemo);
		}

		Collections.sort(list, comparableDemo1);
		System.out.println();

		for (ComparatorDemo comparatorDemo : list) {
			System.out.println(comparatorDemo);
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
