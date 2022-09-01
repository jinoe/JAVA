package com.tjoeun.abstractClass;

import java.util.ArrayList;

abstract class Animal{	
	abstract void move();	// 추상메소드 => 재정의 하여 사용
	void eating() { }	// 일반메소드
}

class Human extends Animal{
	@Override
	void move() {
		System.out.println("사람이 두발로 걷습니다.");	// 오버라이드
	}
	void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	@Override
	void move() {
		System.out.println("호랑이가 네발로 걷습니다."); // 오버라이드
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{

	@Override
	void move() {
		System.out.println("독수리가 하늘을 날아 갑니다.");
	}
	public void flying() {
		System.out.println("독수리가 날개를 쫙 펴고 날아갑니다.");
	}
	
}

class Test{
	public static void test() {
		System.out.println("테스트");
	}
}


public class InstanceTest {
	
	public static void main(String[] args) {
		
	// 1. 배열을 이용한 다형성 구현

//		Animal animal[] = {new Human(), new Tiger(), new Eagle()};	// 업캐스팅
//		animal[0].move();
//		animal[1].move();
//		animal[2].move();
	
	// 2. 함수를 이용한  다형성 구현
		Animal hAnimal = new Human();	// 업캐스팅
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		moveAnimal(hAnimal);
		moveAnimal(tAnimal);
		moveAnimal(eAnimal);
		
		InstanceTest instanceTest = new InstanceTest();
		
		instanceTest.moveAnimal2(hAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal:animalList) {
			if(animal instanceof Human) {
				Human human = (Human) animal;	// 자식클래스타입으로 생성된 부모클래스 객체를 다시 자식클래스 객체에 대입시킴 => 다운캐스팅 (부모객체(자식타입) -> 자식객체)
				human.readBooks();				// 업캐스팅 상태에서는 부모클래스(추상클래스)의 추상메소드(OverRide한) 메소드밖에 사용하지 못하지만
			} else if(animal instanceof Tiger) {// 업캐스팅 후 다운캐스팅을 하면 해당 자식클래스의 일반메소드도 사용할 수 있다.
				Tiger tiger = (Tiger) animal;
				tiger.hunting();
			} else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle) animal;
				eagle.flying();
			}
		}
		
		Test.test();
	//	static 정리
	//	static은 함수, 변수에 붙여서 사용한다.
	//	같은 클래스에서 static을 사용하면 바로 사용할수 있다.
	//	다른 클래스에서 static을 사용한 함수&변수에 접근하려면 클래스명.함수명() 으로 접근할 수있다 => 해당 클래스 객체를 생성하지 않아도 된다.
	//	메인 함수는 static이 항상 붙고 메인함수에서 동일 클래스의 다른 함수를 호출하려면 해당 함수는 static으로 선언되어야 한다. => static이 아니면 해당 클래스 객체를 생성한 후 접근해야한다.
		
	}

	private static void moveAnimal(Animal animal) {		// static은 static에만 접근할 수 있다.
		animal.move();
	}
	private void moveAnimal2(Animal animal) {		// static을 쓰지 않으면 현재 클래스의 객체를 생성 하여 접근할 수 있다.
		animal.move();
	}
}
