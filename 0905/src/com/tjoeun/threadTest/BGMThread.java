package com.tjoeun.threadTest;

public class BGMThread extends Thread{

//	데몬쓰레드란 다른쓰레드가 종료되면 같이 종료되는 쓰레드
	@Override
	public void run() {
		while(true) {
			System.out.println("BGM이 연주되는중...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
