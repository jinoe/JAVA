package com.tjoeun.InterfaceTest3;

public class CompleteCalc extends Calculator {

	@Override
	public int mul(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int div(int num1, int num2) {
		return num1/num2;
	}
	
//	@Override
//	public void description() {
//		System.out.println("Calc 인터페이스의 default 메소드를 CompleteCalc 클래스에서 OverRide한 메소드");
//	}
	
}
