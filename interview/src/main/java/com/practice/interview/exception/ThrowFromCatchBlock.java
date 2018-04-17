package com.practice.interview.exception;

public class ThrowFromCatchBlock {
	public int oneOrTwo() {
		try {
			// Output will be -1
			throw new NullPointerException();
		} catch (NullPointerException np) {
			System.out.println("Hello NullPointer catch block!");
			try {
				throw new NullPointerException();
			} catch (Exception ex) {
				System.out.println("Hello inner catch block!");
			} finally {
				System.out.println("Inner finally");
			}

		} catch (Exception ex) {
			System.out.println("Hello catch block!");
		} finally {
			// finally block will be executed even if we have return or throw in
			// try and/or catch block
			System.out.println("Hello finally block!");
			// if if return from the finally block it will override the return
			// value from try block, below line will print 2
			// return 2;
		}
		return 0;
	}
}
