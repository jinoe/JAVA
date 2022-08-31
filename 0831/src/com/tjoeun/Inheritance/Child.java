package com.tjoeun.Inheritance;

// 자식(하위, 서브, 파생) 클래스
// Child 클래스는 Parent 클래스를 상속받아 만든다.
// 상속이란 부모 클래스에서 정의한 모든 필드와 메소드를 자식 클래스가 물려받는 것을 말한다.
// 자식 클래스에서 별도의 선언없이 부모 클래스의 모든 기능을 사용할 수 있다.
// public class 자식클래스이름 extends 부모 클래스이름
public class Child extends Parent {

//	Child 클래스에는 Parent 클래스의 모든 필드와 메소드를 사용할 수 있다.
//	Child 클래스에서 필요한 기능을 정의한다. (튜닝)
	private int age;
	private String nickname;

//		this는 현재클래스를 의미하고 뒤에 ()가 나오면 현재 클래스의 생성자를 의미한다.
//		super는 부모클래스를 의미하고 뒤에 ()가 나오면 부모 클래스의 생성자를 의미한다.
//		super()는 코딩하지 않더라도 자바 컴파일러가 자동으로 만들어준다.
//		this()와 super()는 반드시 생성자의 가장 첫줄에 입력해야 한다.
//		부모클래스의 생성자가 자식 클래스의 생성자보다 먼저 실행된다.
//		부모클래스의 기본생성자를 지정하지 않으면 자식클래스의 super()를 실행하면 에러가난다.
	
//	--------생성자--------------
	public Child() {
		super();
	}
	
	/*	접근권한 private
	public Child(int age, String nickname) {
		super();
		this.age = age;
		this.nickname = nickname;
	}
	
	public Child(String name, boolean gender, int age, String nickname) {
		super(name, gender); // 부모클래스의 생성자로 초기화
		this.age = age;
		this.nickname = nickname;
	}
	*/
	
	// 접근권한 protected
	public Child(String name, boolean gender, int age, String nickname) {
		super.name = name;
		super.gender = gender;
		this.age = age;
		this.nickname = nickname;
	}

	

//	----------toString-------------
	@Override
	public String toString() {
		//return String.format("%s %s %d %s", super.getName(), super.isGender() ? "남" : "여", age, nickname);
		return super.toString() + Integer.toString(age) + nickname;
	}


//	이클립스가 지원하는 생성자 자동완성 기능을 사용할 때 현재 클래스에 물리적으로
//	정의하지 않은 필드(상속받은필드)는 생성자를 만드는 대화상자에 표시되지 않는다.
//	부모클래스에서 상속받은 private권한의 필드를 초기화하는 방법은 부모 클래스에서 상속받은
//	필드의 접근권한이 private이기 때문에 자식클래스에서 접근할수 없으므로 부모클래스의 생성자를 호출해서
//	초기화한다. or 부모클래스의 필드를 protected 로 변경한다.
//	일반적으로 getter & setter를 이용함.

}
