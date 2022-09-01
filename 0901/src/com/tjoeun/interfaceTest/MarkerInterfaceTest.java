package com.tjoeun.interfaceTest;

class Unit{
//	상수(final)로 선언된 필드는 반드시 선언과 동시에 초기화를 시켜야 한다.
//	상수를 초기화 시키는 방법 3가지
//	1. 상수 선언시 초기화
//	2. 객체가 생성될때 생성자에서 초기화
//	3. static으로 선언한 상수를 초기화하는 2문장 이상 필요한 경우
//	static{ } 와 같이 초기화 블록을 사용하는 방법.
	
	
	
	public final int MAX_HP;	// final 상수는 일반적으로 대문자 사용
	public int currentHP;	// 현재 HP
	
//	생성자를 만들지 않으면 아무런 일도 하지 않는 기본 생성자를 만들어
//	주지만 생성자를 만들면 기본 생성자를 만들지 않는다.
	
	public Unit(int MAX_HP) {
		super();
		this.MAX_HP = MAX_HP;
	}

	
}
// 비어 있지만 기본생성자가 존재하는상태 => 기본생성자 만으로는 부모클래스의 생성자의 MAX_HP에 대입할 값을 얻지못함 (부모클래스의 기본생성자가 없음)
// => 자식 클래스에서도 MAX_HP를 인자로 받아 부모클래스로 전달해줘야함. 
// => 부모클래스의 기본생성자가 없는경우 자식클래스도 부모클래스의 생성자가 요구하는 인자를 입력해줘야 함. (직접 입력하던, 스캐너로 입력받던 둘중하나)

class GroundUnit extends Unit{

	public GroundUnit(int MAX_HP) {
		super(MAX_HP);

	}
	
}

class AirUnit extends Unit{
	public AirUnit(int MAX_HP) {
		super(MAX_HP);
	}
}

interface Repairable {				// => 표시 인터페이스

}

class Tank extends GroundUnit implements Repairable{

	public Tank() {
		super(150);
		super.currentHP=MAX_HP;
	}
	
}
class Marine extends GroundUnit implements Repairable{

	public Marine() {
		super(100);
		super.currentHP=MAX_HP;
	}

}
class SCV extends GroundUnit implements Repairable{

	public SCV() {
		super(80);
		super.currentHP=MAX_HP;
		System.out.println("SCV의 현재 HP는 "+currentHP+"입니다.");
	}
	
	public void repair(Repairable repairable) {		// repairable 객체는 scv, tank, dropship 에서 <구현> 된다. 즉 repairable은 scv, tank, dropship 객체를 가리킨다.
		if(repairable instanceof Unit) { // 업캐스팅 할수 있다면
			Unit unit = (Unit) repairable;
			
			//수리한다.
			while(unit.currentHP<=unit.MAX_HP) {
				unit.currentHP++;
				
				try {
					Thread.sleep(50);
					System.out.print(".");
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			System.out.println("수리완료!");
		}
	}
	
//	표시 인터페이스 타입으로 수리할 객체를 받았지만 표시 인터페이스는 아무런
//	내용이 코딩되어 있지 않기때문에 인수로 넘겨받은 객체를 실제로 구현한 내용이 들어있는
//	클래스로 형변환 시킨 후 처리해야한다.
}


class DropShip extends AirUnit implements Repairable{

	public DropShip() {
		super(120);
		super.currentHP=MAX_HP;
	}

}


public class MarkerInterfaceTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Marine marine = new Marine();
		SCV scv = new SCV();
		DropShip dropShip = new DropShip();
		scv.currentHP=30;
		scv.repair(scv);
	}
}
