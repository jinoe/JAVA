package com.tjoeun.shareAreaTest;

import java.text.DecimalFormat;

//	연산을 하는 클래스, 실행시간이 긴 스레드
public class CalculatorThread extends Thread{

//	공유 영역으로 사용할 클래스 객체를 필드로 선언한다.
	private ShareArea sharearea;	// 자동 null 초기화
	
//	공유영역 => 같은 주소를 사용해야함
//	1. public, package 등으로 생성하여 변수에 직접 접근
//	2. 객체가 생성될때 생성자를 이용하는 방법
//	   객체가 생성자로 있을때 setter로 대입하는 방법
	
	public CalculatorThread() { }
	public CalculatorThread(ShareArea shareArea) {
		this.sharearea = shareArea;
	}
	public ShareArea getSharearea() {
		return sharearea;
	}
	public void setSharearea(ShareArea sharearea) {
		this.sharearea = sharearea;
	}
	@Override
	public void run() {
//		무한급수를 이용한 원주율 계산(시간이오래걸림)
		double total = 0.0;
		long start = System.currentTimeMillis();
		for(int i=1;i<2000000000;i+=2) {
			if(i/2%2 == 0) {
				total += 1.0/i;
			} else {
				total += -1.0/i;
			}
		}
		sharearea.result = total * 4;
		System.out.println();
		System.out.println("Cal 원주율: "+sharearea.result);
		long end = System.currentTimeMillis();
		DecimalFormat df = new DecimalFormat("#,##0 sec");
		System.out.println("소요시간: "+df.format(end-start));
		
		synchronized (sharearea) {
			sharearea.notify();
		}
//		sharearea.ready = true;
	}
	
	
}
