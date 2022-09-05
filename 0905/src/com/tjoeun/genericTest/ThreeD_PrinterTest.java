package com.tjoeun.genericTest;

public class ThreeD_PrinterTest {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<>();
		genericPrinter.setMaterial(new Powder());
		System.out.println(genericPrinter.getMaterial());
//		Powder powder = new Powder();
		
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<>();
		genericPrinter2.setMaterial(new Plastic());
		System.out.println(genericPrinter2.getMaterial());
		
/*		GenericPrinter<Water> genericPrinter3 = new GenericPrinter<>();	 => 제네릭 클래스의 M(인자)은 Material 클래스를 상속받은 클래스만 들어갈 수 있어서 오류가 발생
		genericPrinter3.setMaterial(new Water());
		System.out.println(genericPrinter3.getMaterial());
*/
	}
}
