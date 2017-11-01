package com.practice.interview.multithreading;

/*
 * Deadlock is getting creating due to ordering of the locks we are acquiring
 * 
 * To prevent arising of dead lock condition acquire lock in same order. 
 */

public class DeadLockPrevention {

	String firstName = "Arpit";
	String lastName = "Arora";

	Thread t1 = new Thread("Thread t1") {
		@Override
		public void run() {
			synchronized (firstName) {
				System.out.println("Thread 1: Holding lock 1...");
				try {
					sleep(100);
				} catch (InterruptedException ex) {

				}
				System.out.println("Thread 1: Waiting for lock 2...");

				synchronized (lastName) {
					System.out.println("Thread 1: Holding lock 1 & 2...");
					System.out.println("We are in internal " + getName());
					System.out.println("Thread 1: Releasing lock 1 & 2...");
				}
			}
		}
	};

	Thread t2 = new Thread("Thread t2") {
		@Override
		public void run() {
			synchronized (firstName) {
				System.out.println("Thread 2: Holding lock 1...");

				System.out.println("Thread 2: Waiting for lock 2...");

				synchronized (lastName) {
					System.out.println("Thread 2: Holding lock 1 & 2...");
					System.out.println("We are in internal " + getName());
					System.out.println("Thread 2: Releasing lock 1 & 2...");
				}
			}
		}
	};

	public static void main(String[] args) {

		DeadLockPrevention dc = new DeadLockPrevention();
		System.out.println("Let's start the threads");
		dc.t1.start();
		dc.t2.start();

		// java.lang.IllegalThreadStateException
		// dc.t2.start();

	}
}
