package com.tjoeun.Inheritance;

// 계층구조 Object -> Parent 클래스 -> Child 클래스
public class InheritanceTest {
	public static void main(String[] args) {

		Parent parent = new Parent();
		System.out.println(parent);
		Parent parent2 = new Parent("홍길동", true);
		System.out.println(parent2);

		System.out.println("=============================");

		Child child = new Child(); // super()가 실행되어 Parent의 생성자를 실행
		System.out.println(child);

		Child child2 = new Child("성춘향", false, 16, "이쁜이");
		System.out.println(child2); // => 부모클래스로 부터 상속받은 toString 사용
	}
}
