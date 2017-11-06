package com.practice.interview.designpattern;

public class SingletonDemoImpl {

	public static void main(String[] args) {

		EagerSingletonClass singletonDemo = EagerSingletonClass.getInstance();
		System.out.println(singletonDemo);

		EagerSingletonClass singletonDemo2 = EagerSingletonClass.getInstance();
		System.out.println(singletonDemo2);

		LazySingletonUsingInnerClass lazySingletonUsingInnerClass = LazySingletonUsingInnerClass.getInstance();
		System.out.println(lazySingletonUsingInnerClass);

		LazySingletonUsingInnerClass lazySingletonUsingInnerClassq = LazySingletonUsingInnerClass.getInstance();
		System.out.println(lazySingletonUsingInnerClassq);
	}

}