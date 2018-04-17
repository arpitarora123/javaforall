package com.practice.interview;

public class AutoBoxing {
	public static void main(String[] args) {
		Integer i = new Integer(5);

		int pi = Integer.valueOf(i);

		String s = "2";

		int j = new Integer(s);

		double d = Double.parseDouble(s);
		// System.out.println(++j);
		System.out.println(++j + " " + ++d);
	}
}
