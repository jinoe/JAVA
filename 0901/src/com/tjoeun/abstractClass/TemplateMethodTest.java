package com.tjoeun.abstractClass;

abstract class Car{
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("start");
	}
	public void turnOff() {
		System.out.println("turn off");
	}
	
	final void run() {				// final을 사용하면 더이상 상속 할수 없는 고정된 메소드&변수로 바뀐다.
		startCar();
		drive();
		stop();
		turnOff();
	}
}

// 템플릿 메소드
// 추상 메소드나 내용이 구현된 일반 메소드를 사용해서 코드의 흐림(시나리오)을 정의하는메소드로
// 프레임워크에서 많이 사용하는 설계패턴이다.
// 추상 클래스로 선언된 부모 클래스에서 템플릿 메소드를 활용해서 전체적인 흐름을 정의하고 자식
// 클래스에서 다르게 구현되어야 하는 부분은 추상 메소드로 선언해서 자식 클래스에서 Override 해서
// 구현하도록한다.

class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자동차가 스스로 자율주행합니다.");
		System.out.println("자동차가 스스로 방향을 주행합니다.");	
	}

	@Override
	public void stop() {
		System.out.println("자동차가 스스로 멈춥니다.");
	}
	
//	public void run() { } => final(수정불가)
	
}

class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
	}

	@Override
	public void stop() {
		System.out.println("사람이 브레이크를 밟아서 자동차를 멈춥니다.");
	}
	
}

public class TemplateMethodTest {
	public static void main(String[] args) {
		
		Car manualCar = new ManualCar();
		manualCar.run(); 		// => 템플릿 메소드
	}
}



