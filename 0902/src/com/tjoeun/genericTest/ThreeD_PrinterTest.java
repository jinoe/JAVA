package com.tjoeun.genericTest;

public class ThreeD_PrinterTest {

	public static void main(String[] args) {
		ThreeD_PrinterPlastic PlasticPrinter = new ThreeD_PrinterPlastic();
		Plastic Plastic = new Plastic();
		PlasticPrinter.setMaterial(Plastic);
		System.out.println(PlasticPrinter.getMaterial());
		Plastic = PlasticPrinter.getMaterial();
		System.out.println("====================");
	}
}
