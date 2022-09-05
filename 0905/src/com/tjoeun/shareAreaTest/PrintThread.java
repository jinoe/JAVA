package com.tjoeun.shareAreaTest;

//	연산 결과를 출력하는 스레드, 실행시간이 짧은 스레드
public class PrintThread extends Thread {

//	공유 영역으로 사용할 클래스 객체를 필드로 선언한다.
	private ShareArea sharearea;	// 자동 null 초기화
	
	public PrintThread() { }
	
	public PrintThread(ShareArea shareArea) {
		this.sharearea =shareArea;
	}

	public ShareArea getSharearea() {
		return sharearea;
	}

	public void setSharearea(ShareArea sharearea) {
		this.sharearea = sharearea;
	}

	@Override
	public void run() {
//		CalculatorThread의 실행이 끝날때(ready=true 될때)까지 대기해야한다.
//		쓰레드가 너무 빨리 실행되면 정상적인 처리가 되지않기 때문에 sleep() 메소드로 주기적으로 멈춰줘야한다.
/*
		while(!sharearea.ready) {
			try {
				System.out.print(". ");		// 점을 찍는동안은 프로세스 낭비가 된다.
				sleep(100);					// Critical Area에 접근한뒤 아무 동작도 안하기때문
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
*/
//		위에 주석으로 처리한 부분은 스레드 사이에 불필요한 작업전환이 이루어진다.
//		얼음(wait()), 땡(notofy(),notifyALL()) 사용
//		notify() 메소드는 wait()로 일시정지된 스레드를 임의의 순서로 깨운다.
//		notifyALL()은 일시정지된 스레드를 일괄적으로 깨운다.
//		wait(), notify(), notifyALL() 메소드는 모두 동기롸 블록 내부에 코딩해야한다.

//		동기화 블록
//		동기화 블록의 인수는 여러 스레드가 같이 사용하는 공유영역으로 사용되는 객체 이름이다.
		synchronized (sharearea) {
			try {
				sharearea.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("Ptn 원주율: "+sharearea.result);
	}
}
