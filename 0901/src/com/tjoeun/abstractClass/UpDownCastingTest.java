package com.tjoeun.abstractClass;

class Base{
//	package 접근 권한은 같은 package 에서는 public처럼 사용되고 다른 package에서는 private 처럼 사용된다.
	
	String name;	// 접근권한을 생략하면 package 권한을 의미한다.
	void say() {
		System.out.println(name+"님 안녕하세요.");
	}
}

class Sub extends Base{
	int age;
	@Override
	void say() {
		System.out.printf("%s님은 %d살 입니다.\n", name, age);
	}
	
}

public class UpDownCastingTest {
	public static void main(String[] args) {
		Base base = new Base();
		base.name = "김씨";		// => package로 선언하여 게터세터 없이 바로 접근가능.
		base.say();
	
		Sub sub = new Sub();
		sub.name = "이씨";
		sub.age = 20;
		sub.say();
		
//		Base b = new Sub();		   => 부모클래스는 자식 클래스를 품을수 있다.
//		Sub s = new Base();		   => 에러발생
		
	// 객체의 실제값은 주소값이다.
	// 부모클래스에서 자식 클래스타입의 객체주소를 대입하면 아무문제 없이 처리된다.
	// 자식 클래스에서 부모클래스타입의 객체가 생성된 주소를 대입하면 에러가 발생한다.
		
		
//		업캐스팅이란? (튜닝에서 순정으로)
//		부모클래스 객체에 자식클래스를 집어넣는것
		Base b = sub;
		b.say();
//		Sub s = (Sub) base;		// 실행시키면 오류발생 
//		부모클래스 객체에 자식클래스 타입객체의 주소를 대입했으므로 자식클래스의 say()가 실행된다.
		
		
//		다운캐스팅이란? (튜닝->순정->튜닝)
//		업캐스팅된 자식클래스를 다시 자식 클래스타입으로 바꾸는것
		
		
//		instanceof 연산자는 객체가 instanceof 뒤에 지정된 클래스 타입으로 안전하게 형변환이 가능한지 검사한다.
		if(sub instanceof Base) {
			System.out.println("sub 오브젝트는 Base 클래스 타입으로 형변환 가능");
		} else {
			System.out.println("sub 오브젝트는 Base 클래스 타입으로 형변환 불가능");			
		}
		if(base instanceof Sub) {
			System.out.println("base 오브젝트는 Sub 클래스 타입으로 형변환 가능");
		} else {
			System.out.println("base 오브젝트는 Sub 클래스 타입으로 형변환 불가능");			
		}
	}
}
