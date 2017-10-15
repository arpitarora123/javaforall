package com.practice.interview.outer.inner;

interface AnonymousClass {
	
}

public class AnonymousInner {
	int count = 0;
	public AnonymousClass test() {
		return new AnonymousClass() {
			{
			int	count = 10;
			System.out.println("Hello Anonymous Inner class " + ++count);
			}
			};
	}
	
	public static void main(String args[]) {
		AnonymousInner anonymousInner = new AnonymousInner();
		anonymousInner.test();
	}
}
