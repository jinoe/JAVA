package com.tjoeun.customer;

//	기본 등급(실버) -> 튜닝(상속) -> 골드의 기능 추가
//	이미 Customer 클래스에서 구현한 내용이 중복되므로 Customer 클래스를 상속받아 만든다.
public class VipCustomer extends Customer{
	
	// 1대1 상담원
	// 제품을 살때는 10% 할인해주고, 5% 적립

	private int agentID;			// => 나머지 필드는 상속받음
	private double salesRatio;
	
	public VipCustomer() {
		agentID = 1111;
		salesRatio = 0.1;
		setCustomerGrade("VIP");	// => 부모 클래스에서 상속받은 함수
		setBonusRatio(0.05);
	}
	// 실제 구매금액을 계산해서 리턴하는 메소드
	public int calSales(int price) {
		return price - (int) (price * salesRatio);
	}
	public int calBonus(int price) {
		return (int)(calSales(price) * getBonusRatio());
	}
}