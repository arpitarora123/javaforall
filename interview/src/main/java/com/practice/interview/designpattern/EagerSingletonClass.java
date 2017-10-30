package com.practice.interview.designpattern;

public class EagerSingletonClass {

	private final static EagerSingletonClass singletonDemo = new EagerSingletonClass();

	private EagerSingletonClass() {

	}

	public static EagerSingletonClass getInstance() {
		return singletonDemo;
	}
}
