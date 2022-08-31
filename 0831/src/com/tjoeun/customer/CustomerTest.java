package com.tjoeun.customer;

public class CustomerTest {
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setCustomerID(10010);
		customer.setCustomerName("이몽룡");
		customer.setBonusPoint(1000);
		
		System.out.println("회원정보: "+customer.showCustomerInfo());
		System.out.println("보너스 포인트: "+ customer.calBonus(35000));
		System.out.println("누적 보너스 포인트: "+ customer.calPrice(35000));
		
		
		VipCustomer customer2 = new VipCustomer();
		customer2.setCustomerID(10010);
		customer2.setCustomerName("임꺽정");
		customer2.setBonusPoint(10000);
		
		System.out.println(customer2.showCustomerInfo());
		System.out.println("실제 구매 금액: "+ customer2.calSales(10000));
		System.out.println("보너스 포인트: "+ customer2.calBonus(10000));
		System.out.println("누적 보너스 포인트: "+ customer2.calPrice(10000));
	}
}
