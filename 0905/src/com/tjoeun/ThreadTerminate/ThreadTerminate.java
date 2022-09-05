package com.tjoeun.ThreadTerminate;

public class ThreadTerminate  extends Thread{
	
//	flag 변수를 사용하여 멀티 스레드가 진행중일때 main에서 flag 값이 변경하면 해당 쓰레드가 종료되게 하는 원리.
//	운영체제가 쓰레드들에게 돌아가면서 처리권한을 주는것을 이용
	
	
	private boolean flag  = true;
	
	public ThreadTerminate() { }
	public ThreadTerminate(String name) {
		super(name);
	}
	
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	
	@Override
	public void run() {
//		ThreadTerminate 클래스는 Thread를 상속받아서 Thread메소드의 메소드를 실행할때
//		앞에 Thread를 붙이지 않아도 그대로 사용할 수 있다.
		while(flag) {
			try {
				sleep(1);	//=> 스레드가 너무빨리실행하면 테스트 해볼때 문제가 발생할수 있으므로 최소한의 텀을 둔다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (flag==false) System.out.println("스레드종료!");
	}
}
