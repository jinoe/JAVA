package com.tjoeun.interfaceTest;

// 일반 클래스에 인터페이스의 추상함수를 전부다 구현할거면 Ok
// 전부다 구현하지 않을것이라면 추상클래스로 만들어야함 => 구현하지않으면 추상메소드로 남아있기 때문에 추상메소드로 타입이 지정되어야함

public abstract class Calculator implements Calc{

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public int sub(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}
	
}
