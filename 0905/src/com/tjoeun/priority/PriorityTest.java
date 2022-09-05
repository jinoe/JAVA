package com.tjoeun.priority;

public class PriorityTest {
	public static void main(String[] args) {
		
//		쓰레드 우선순위: 1~10 사이를 지정할  수 있다.
//		우선순위가 높은 스레드가 CPU의 할당을 받을 확률이 높다.
//		System.out.println(Thread.MAX_PRIORITY);
//		System.out.println(Thread.NORM_PRIORITY);
//		System.out.println(Thread.MIN_PRIORITY);
		
/*
		PriorityThread pt1 = new PriorityThread();
		PriorityThread pt2 = new PriorityThread();
		PriorityThread pt3 = new PriorityThread();
		
		pt1.setPriority(Thread.MAX_PRIORITY);
		pt2.setPriority(Thread.NORM_PRIORITY);
		pt3.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println(pt1.getPriority());
		System.out.println(pt2.getPriority());
		System.out.println(pt3.getPriority());
		
		pt2.start();
		pt3.start();
		pt1.start();
*/	
		// 높을수록 높은 우선순위
		for(int i = Thread.MIN_PRIORITY;i<=Thread.MAX_PRIORITY;i++) {
			PriorityThread pt = new PriorityThread("쓰레드-"+i);
			pt.setPriority(i);
			pt.start();
		}
	}
}
