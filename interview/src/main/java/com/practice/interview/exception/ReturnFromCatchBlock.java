package com.practice.interview.exception;

public class ReturnFromCatchBlock {
	public int oneOrTwo() {
		try {
			throw new NullPointerException();
		} catch (NullPointerException np) {
			
		} 
		catch (Exception ex) {
			System.out.println( "Hello catch block!" );
			return 1;
		} 
		finally {
			System.out.println( "Hello finally block!" );
			return 2;
		}
	}
}
