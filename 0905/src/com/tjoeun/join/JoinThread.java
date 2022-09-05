package com.tjoeun.join;

public class JoinThread extends Thread {
	
	int start;
	int end;
	int total=0;
	
	public JoinThread() { }
	
	
	public JoinThread(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		for(int i=start;i<=end;i++) {
			total += i;
		}
	}
	
}
