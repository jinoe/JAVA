package com.tjoeun.syncronizedBlockTest;

public class TransferThread extends Thread {
	ShareArea shareArea;

	public TransferThread() {
	}

	public TransferThread(ShareArea shareArea) {
		this.shareArea = shareArea;
	}

	@Override
	public void run() {
//		동기화란 작업의 순서를 정한다는 의미로 공유영역을 사용하는 스레드가 실행중일 때 같은
//		공유 영역을 사용하는 다른 스레드가 실행되지 못하도록 하는것을 말한다.
//		이런 현상을 방지하기 위해서 동기화 블록을 사용하고 동기화 블록에는 절대로 스레드 사이에
//		작업 전환이 이루어 지면 안되는 내용을 코딩한다.
		
//		syncronized 블록 내부에 있는 코드가 실행될때는 다른 스레드가 간섭하지 못한다.
		synchronized (shareArea) {
			for (int i = 0; i < 20; i++) {
				shareArea.lee.deposit(1000000);
				System.out.println(i + 1 + " 이몽룡 계좌 100만원 입금");
				shareArea.hong.withDraw(1000000);
				try {
					sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}

			}
		}
	}

	public ShareArea getShareArea() {
		return shareArea;
	}

	public void setShareArea(ShareArea shareArea) {
		this.shareArea = shareArea;
	}

}
