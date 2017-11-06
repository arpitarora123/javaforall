package com.practice.interview.multithreading.deadlockdetection;

import java.util.concurrent.TimeUnit;

/*
 * Deadlock is getting creating due to ordering of the locks we are acquiring
 * 
 * To prevent arising of dead lock condition acquire lock in same order. 
 */

public class DeadlockDetectionDemo {

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
				}
			}
		}
	};

	Thread t2 = new Thread("Thread t2") {
		@Override
		public void run() {
			synchronized (lastName) {
				System.out.println("Thread 2: Holding lock 2...");

				System.out.println("Thread 2: Waiting for lock 1...");

				synchronized (firstName) {
					System.out.println("Thread 2: Holding lock 1 & 2...");
					System.out.println("We are in internal " + getName());
				}
			}
		}
	};

	public static void main(String[] args) {

		// Executor service : To learn more about it
		// ScheduledExecutorService scheduler =
		// Executors.newScheduledThreadPool(1);

		/*
		 * ThreadMXBean bean = ManagementFactory.getThreadMXBean(); long[]
		 * threadIds = bean.findDeadlockedThreads(); // Returns null if no //
		 * threads are // deadlocked.
		 * 
		 * if (threadIds != null) { ThreadInfo[] infos =
		 * bean.getThreadInfo(threadIds);
		 * 
		 * System.out.println("We are here in deadlock detection"); for
		 * (ThreadInfo info : infos) { StackTraceElement[] stack =
		 * info.getStackTrace(); // Log or store stack trace information. } }
		 */

		DeadlockDetectionDemo dc = new DeadlockDetectionDemo();
		System.out.println("Let's start the threads");

		// Deadlock detection
		DeadlockDetector deadlockDetector = new DeadlockDetector(new DeadlockConsoleHandler(), 10, TimeUnit.SECONDS);
		deadlockDetector.start();
		dc.t1.start();
		dc.t2.start();

	}
}
