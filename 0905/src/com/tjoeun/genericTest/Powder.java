package com.tjoeun.genericTest;

//	3D 프린터 재료 - Powder
public class Powder extends Material {

	@Override
	public String toString() {
		return "Powder";
	}

	@Override
	void doPrinting() {
		System.out.println("프린팅 시작");
	}

	
}
