package com.tjoeun.Inheritance;

public class Parent {
//	private String name;
//	private boolean gender;
	protected String name;
	protected boolean gender;
	
	public Parent() {
		this("무명",false);
		System.out.println("부모클래스의 생성자 실행");
	}

	public Parent(String name, boolean gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {	
		return String.format("%s(%s)", name, gender?"남":"여");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

}
