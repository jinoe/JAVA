package com.tjoeun.syncronizedBlockTest;

public class PrintThread extends Thread {
	ShareArea shareArea;

	public PrintThread() {
	}

	public PrintThread(ShareArea shareArea) {
		this.shareArea = shareArea;
	}

	@Override
	public void run() {
		synchronized (shareArea) {
			for (int i = 0; i < 3; i++) {
				int sum = shareArea.lee.money + shareArea.hong.money;
				System.out.println("예금합계: " + sum);
				try {
					sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
