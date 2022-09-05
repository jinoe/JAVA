package com.tjoeun.shareAreaTest;

public class shareAreaTest {
	public static void main(String[] args) {
		
//		공유영역으로 사용할 클래스 객체를  생성
//		기본 자료형으로 선언한 변수는 일반 변수, 클래스로 선언한 변수(객체, 인스턴스)는 참조 변수라고 부른다.
//		일반 변수는 데이터 자체를 기억하지만 참조 변수는 생성되는 크기를 특정지을 수 없을므로
//		클래스로 만든 변수는 메모리 어딘가에 객체가 생성되면 그 객체가 생성된 주소를 기억한다.
		ShareArea shareArea = new ShareArea();
		
//		<< 공유 영역을 만드는 방법 >>
//		1. 공유영역을 공유해서 사용할 클래스 객체를 선언하고 생성된 공유영역의 주소를 넣어준다.

/*		CalculatorThread calculator = new CalculatorThread();
		PrintThread print = new PrintThread();
		
		calculator.sharearea = shareArea;	// 메모리 주소 대입 (클래스 필드가 public이나 package(기본값) 일때)
		print.sharearea = shareArea;

//		공유영역 테스트
		calculator.sharearea.result = 1000;
		System.out.println("calcualtor: "+calculator.sharearea.result);
		System.out.println("print: "+print.sharearea.result);
 */	
		
//		2. 생성자로 초기화
		CalculatorThread calculator = new CalculatorThread(shareArea);
		PrintThread print = new PrintThread(shareArea);
		
//		3. setter를 사용하여 대입연산 (클래스 필드가 private 일때)
		calculator.setSharearea(shareArea);
		print.setSharearea(shareArea);
		
//		HashCode 값 검사
		System.out.println(calculator.getSharearea());
		System.out.println(print.getSharearea());
		
//		스레드를 실행한다.
		calculator.start();
		print.start();
		

	}
}
