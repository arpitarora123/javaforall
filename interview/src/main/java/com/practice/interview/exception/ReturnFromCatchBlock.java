package com.practice.interview.exception;

public class ReturnFromCatchBlock {
	public int oneOrTwo() {
		try {
			// Output will be -1
			return -1;
			// throw new NullPointerException();

		} catch (NullPointerException np) {
			System.out.println("Hello catch Null pointer block!");
			return 1;
		} catch (Exception ex) {
			System.out.println("Hello catch block!");
			return 1;
		} finally {
			// finally block will be executed even if we have return or throw in
			// try and/or catch block
			System.out.println("Hello finally block!");
			// if if return from the finally block it will override the return
			// value from try block, below line will print 2
			// return 2;
		}
	}
}
