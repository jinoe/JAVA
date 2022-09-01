package com.tjoeun.interfaceTest;

public interface Calc {
	public static final double PI = 3.141592;
	int ERROR = - 999999;	// 변수는 public static final 자동추가
	
	public abstract int add(int num1, int num2); //덧셈
	int sub(int num1, int num2); // 함수는 abstract 자동추가
	int mul(int num1, int num2);
	int div(int num1, int num2);
}

