package com.tjoeun.customer;
//	일반고객정보를 기억하는 클래스
public class Customer {
	private int customerID;
	private String customerName;
	private String customerGrade;
	private int bonusPoint;
	private double bonusRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	// 고객정보
	public String showCustomerInfo() {
		String str = String.format("%s님의 등급은 %s이며 보너스 포인트는 %3d점 입니다.",customerName, customerGrade, bonusPoint);
		return str;
	}
	// 구매금액을 인수로 넘겨받아 보너스 포인터를 계산하여 리턴하는 함수
	public int calBonus(int price) {
		return (int)(price*bonusRatio);
	}
	// 구매금액을 인수로 넘겨받아 누적 보너스 포인트를 계산해서 리턴하는함수
	public int calPrice(int price) {
		bonusPoint += calBonus(price);
		return bonusPoint;
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	
}
