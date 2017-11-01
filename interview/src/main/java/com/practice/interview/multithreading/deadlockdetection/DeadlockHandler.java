package com.practice.interview.multithreading.deadlockdetection;

import java.lang.management.ThreadInfo;

public interface DeadlockHandler {
	void handleDeadlock(final ThreadInfo[] deadlockedThreads);
}