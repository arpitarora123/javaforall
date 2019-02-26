package com.practice.interview.exception;

public class ReturnFromCatchBlock {
	public int oneOrTwo() {

		// try {
		//
		// } catch (Exception | NumberFormatException | ArithmeticException ex)
		// {
		//
		// }

		try {
			// Output will be -1
			throw new NullPointerException();
			// return -1;
			// System.exit(0);

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
			// if we return from the finally block it will override the return
			// value from try block, below line will print 2
			return 2;
		}
	}
}
