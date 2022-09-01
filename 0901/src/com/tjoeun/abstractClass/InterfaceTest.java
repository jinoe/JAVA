package com.tjoeun.abstractClass;

abstract class Point2{
	abstract void move();
	abstract void earse();
}

// 인터페이스는 필드 선언시 앞의 내용을 생략하면 public static final을 자동을 붙여준다.(static + 상수화)
// 인터페이스는 추상메소드만 가질수 있다.
// 인터페이스는 다중 상속이 가능하다.


interface Draw{
	int LIMIT = 1000;
	public void rotate(); // 추상 메소드 (abstract) 없어도 자동으로 붙여줌
	public void movemove();
}

interface Graphic{
	void rotate();
	void resize();
}

//	클래스는 인터페이스를 상속 받을수 없기 대문에 에러가발생된다.
//class Line extends Graphic{  }

// 인터페이스는 클래스를 상속 받을 수 없기 때문에 에러가 발생된다.
// interface Graphic extends Point {  } //에러

//	클래스는 클래스끼리, 인터페이스는 인터페이스끼리 상속을시켜야한다.
//	클래스는 다중상속을 지원하지 않지만 인터페이스는 다중상속을 지원한다.



/*아무런 내용을 가지지 않는 인터페이스를 표시(Marker) 인터페이스라고 한다.*/
interface Graphics extends Draw, Graphic{ // => 다중상속

}
// => 클래스에 클래스를 붙어서 사용하려면 extends 예약어를 사용해서 <상속>을 시키고
// => 클래스에 인터페이스를 붙여서 사용하려면 implements 예약어를 사용해서 <구현> 시켜 사용한다.

class Line extends Point2 implements Draw, Graphic{

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movemove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void earse() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceTest {
	public static void main(String[] args) {
		System.out.println("MATH.PI: " +  Math.PI);
	}
	
	
}
