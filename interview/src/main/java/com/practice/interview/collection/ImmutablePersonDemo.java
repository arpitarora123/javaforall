package com.practice.interview.collection;

public class ImmutablePersonDemo {

	public static void main(String[] args) {
		ImmutablePerson immutablePerson = new ImmutablePerson(1, "Arpit");

		ImmutablePerson immutablePerson2 = immutablePerson;

		System.out.println(immutablePerson);

		System.out.println(immutablePerson2);

	}

}
