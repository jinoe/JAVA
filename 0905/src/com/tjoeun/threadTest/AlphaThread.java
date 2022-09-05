package com.tjoeun.threadTest;

public class AlphaThread extends Test implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 26; i++) {
			System.out.printf("%d ", i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	void run2() {
		System.out.println("run2() 실행");
	}
	
	

}
