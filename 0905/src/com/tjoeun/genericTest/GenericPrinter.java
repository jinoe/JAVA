package com.tjoeun.genericTest;

// => M자료형의 범위를 제한할 수 있고 부모클래스에서 선언하거나 정의한 메소드를 사용할 수 있다.

public class GenericPrinter<M extends Material> { //=> Material 클래스를 상속받는 클래스만 넘어올수 있다.
	private M material;

	public M getMaterial() {
		return material;
	}

	public void setMaterial(M material) {
		this.material = material;
	}
	
}
