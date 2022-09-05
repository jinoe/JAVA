package com.tjoeun.join;

public class JoinThreadTest {
	public static void main(String[] args) {
		JoinThread jt1 = new JoinThread(0,50);
		
		JoinThread jt2 = new JoinThread(51,100);
		
		jt1.start();
		jt2.start();
	
//		jt1 쓰레드가 끝난 다음에 jt2 쓰레드가 실행됨
		try {
			jt1.join();
			jt2.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(jt1.total);
		System.out.println(jt2.total);
		
		System.out.println(jt1.total+jt2.total);
		
//		join()메소드는 2개이상의 스레드가 실행될 때 다른 스레드의 결과를 참조해서 실행해야 할 경우 사용한다.
//		join()메소드를 실행한 클래스가 끝나기를 기다렸다가 실행된다.
	
	}
}
