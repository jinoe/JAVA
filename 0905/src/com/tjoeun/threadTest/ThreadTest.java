package com.tjoeun.threadTest;

public class ThreadTest {

	public static void main(String[] args) {

//		<< Thread 클래스를 상속받아 작성된 멀티 스레드 실행 방법 >>
//		1. Thread 클래스를 상속받아 멀티스레드를 작성한 클래스 객체를 만든다.
		DigitThread digit = new DigitThread();
//		2. Thread 클래스를 상속받아 작성된 클래스 객체에서 start() 메소드로 멀티스레드를 실행한다.
//		아래와 같이 run() 메소드를 Override 했다고 해서 run() 메소드를 실행하면 run() 이라는 일반메소드가 실행된다.
//		digit.run();
//		digit.run();
//		멀티스레드로 실행하려면 반드시 start() 메소드를 실행한다음 해야한다.
		
//		<< Runnable 인터페이스의 Run() 추상메소드를 구현 시킨다. >>
		AlphaThread alpha = new AlphaThread();
		Thread thread = new Thread(alpha);
		
		BGMThread bgmThread = new BGMThread();
		bgmThread.setDaemon(true); // => 데몬쓰레드
		
//		digit.start();   => start는 클래스에 오버라이드 된 메소드를 호출스택에 저장하여 실행시키는것
//		thread.start();	
		new Thread(new AlphaThread()).start();
//		bgmThread.start();
		for (int i = (int) 'A'; i <= (int) 'Z'; i++) {
			System.out.printf("%c ", i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
//		=> 즉, start() 메서드를 실행하면 Thread를 새로 생성하여 start한다. start하게되면 run() 메서드가 호출된다. // run() 만 실행함.
	}
}
