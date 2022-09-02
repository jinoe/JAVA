package com.tjoeun.InterfaceTest3;

public interface Calc {
	public static final double PI = 3.141592;
	int ERROR = - 999999;	// 변수는 public static final 자동추가
	
	public abstract int add(int num1, int num2); //덧셈
	int sub(int num1, int num2); // 함수는 public abstract 자동추가
	int mul(int num1, int num2);
	int div(int num1, int num2);
	
//	default 메소드 => JDK 1.8 버전 추가
//	default 메소드는 구현부 ({}블록)를 가지는 메소드로 default 예약어를 사용해서 선언한다.
//	인터페이스를 구현받는 클래스들에서 공통으로 사용할 수 있는 메소드로 상속 또는 구현시킴
//	OverRide가 가능하다.
	
//	defalut 키워드
	default void description() { /* static 메소드가 아니기때문에 static이 아닌 함수 호출가능*/
		System.out.println("정수 계산기를 구현합니다.");
		myMethod(4);	
	}
	
//	static 메소드 => JDK 8에서 추가
//	인터페이스 객체를 생성하지 않고 "."을 찍어 접근 할 수 있다.
	static int total(int arr[]) {
		int total = 0;
		for(int i:arr) {
			total += i;
		}
		
//		myMethod(4);	//static함수에서는 static 함수만 호출가능함.
		myMethod2(4);
		return total;
	}
	
//	private 메소드 => JDK 9에서 추가
//	인터페이스를 구현한 클래스에서 사용하거나 Override 해서 사용할 수 없다.
//	인터페이스의 내부의 default 메소드에서 사용하기 위해 구현하는 메소드
	private void myMethod(int number) {
		for(int i=0;i<number;i++) {
			System.out.println("private method");
		}
	}
	
//	private static 메소드 => JDK 9에서 추가
//	인터페이스를 구현한 클래스에서 사용하거나 Override 해서 사용할 수 없다.
//	인터페이스의 내부의 static 메소드에서 사용하기 위해 구현하는 메소드
	private static void myMethod2(int number) {
		for(int i=0;i<number;i++) {
			System.out.println("private method");
		}
	}
	
	
}

