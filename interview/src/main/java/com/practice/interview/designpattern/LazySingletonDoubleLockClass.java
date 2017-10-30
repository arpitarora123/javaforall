package com.practice.interview.designpattern;

public class LazySingletonDoubleLockClass {

	private static LazySingletonDoubleLockClass singletonDemo;

	private LazySingletonDoubleLockClass() {

	}

	public static LazySingletonDoubleLockClass getInstance() {
		if (null == singletonDemo) {
			synchronized (LazySingletonDoubleLockClass.class) {
				if (null == singletonDemo) {
					singletonDemo = new LazySingletonDoubleLockClass();
				}
			}
		}

		return singletonDemo;
	}
}
