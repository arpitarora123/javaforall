package com.practice.interview.java8;

import java.util.Arrays;

public class StringLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays.stream(new String[] { "Arpit", "Arora", "RASHMI" }).filter(s -> s.startsWith("Ar"))
				.map(s -> s.toUpperCase()).forEach(System.out::print);

		System.out.println("\n" + Arrays.stream(new String[] { "Arpit", "Arora", "RASHMI" })
				.filter(s -> s.startsWith("Ar")).map(s -> s.toUpperCase()).reduce("", String::concat));
	}
}
