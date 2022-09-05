package com.tjoeun.genericTest;

public class Plastic extends Material {

	@Override
	public String toString() {
		return "Plastic";
	}

	@Override
	void doPrinting() {
		System.out.println("프린팅 시작");
	}
	
}
