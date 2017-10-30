package com.practice.interview.collection;

public final class ImmutablePerson {

	private final int id;

	private final String name;

	public ImmutablePerson(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "ImmutablePerson [id=" + id + ", name=" + name + "]";
	}

}
