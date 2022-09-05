package com.tjoeun.syncronizedBlockTest;

public class Account {
	
	String accountNo;
	String name;
	int money;
	
	public Account() { }
	
	public Account(String accountNo, String name, int money) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.money = money;
	}
	
	public void deposit(int amount) {
		this.money += amount;
	}
	public int withDraw(int amount) {
		if(this.money<amount) {
			System.out.printf("%s (%s) 계좌의 잔액이 부족합니다.\n",accountNo,name);
			return 0;
		}
		this.money -= amount;
		return amount;
	}
	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
