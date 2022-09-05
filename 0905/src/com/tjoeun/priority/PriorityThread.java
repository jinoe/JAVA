package com.tjoeun.priority;

//	쓰레드 우선 순위
public class PriorityThread extends Thread {

	public PriorityThread() {
	}

	public PriorityThread(String name) {
		super(name); // => Thread 클래스 내부에 public Thread(String name) { this.name = name } 생성자가 존재함.
	}

	@Override
	public void run() {

		Thread thread = Thread.currentThread();
		int sum = 0;
		for (int j = 0; j < 1000
				; j++) {
			for (int i = 0; i < 10000000; i++) {
				sum += i;
			}
		}
		System.out.println("현재클래스 우선순위: " + thread.getPriority());

	}
}
