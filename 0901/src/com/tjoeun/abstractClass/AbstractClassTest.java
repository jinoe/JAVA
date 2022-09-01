package com.tjoeun.abstractClass;

//	1개 이상의 추상 메소드를 포함한 클래스를 추상 클래스라 부르며 abstract 예약어를 사용해서 만든다.
//	추상 클래스는 불완전한 메소드인 추상 메소드를 포함하고 있기 때문에 불완전한 클래스이므로
//	객체를 만들어서 사용할 수 없다.	=> new 를 할 수 없다.
//	추상 클래스의 모든 추상 메소드를 반드시 Override 시켜서 사용해야 한다. => 다형성 구현에 사용한다.
//	하지만 일반메소드도 가질 수 있다.
//	일반메소드 없이 추상클래스만 가진것이 인터페이스이다.

//	결론 => 다형성을 구현하기 위해 추상메소드와 추상클래스를 사용한다.

abstract class Product{
	
	public abstract void kindOf(); // 추상메소드
	
//	추상 메소드는 아무런 일도 하지않는 {} 블록을 가지지 않는 메소드
//	추상 메소드는 abstract 예약어를 사용해 선언하며 {} 블록을 가지지 않는 불완전한 메소드로
//	추상 메소드가 포함된 클래스를 상속받는 자식 클래스에서 반드시 Override 시켜서 사용해야 하는
//	메소드이다. => 프로그래머에세 반드시 Override를 해서 사용하게끔 강제한다.
//	자식클래스에서 반드시 Override 시켜서 사용해야 한다는 강제성을 프로그래머에게 부여하고
//	추상 메소드의 {} 블록에 코딩해봐야 자식클래스에서 무조선 Override를 하게되면 부모클래스에서
//	정의한 메소드 내용은 무시되므로 팔아프게 {} 블록의 내용을 코딩해봐야 어차피 무시될거 {} 블록을 
//	아예 코딩하지 않는다.
}

class Camere extends Product{

	@Override
	public void kindOf() {
		// TODO Auto-generated method stub
		
	}
	
}

public class AbstractClassTest {
	
}
