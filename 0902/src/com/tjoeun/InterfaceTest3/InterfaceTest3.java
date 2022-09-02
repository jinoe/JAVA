package com.tjoeun.InterfaceTest3;

public class InterfaceTest3 { // 4가지 함수는 상위 클래스에서 전부 구현된 상태 Calc 인터 -> Cal클래스 -> COM 클래스

	public static void main(String[] args) {
		Calc calc = new CompleteCalc();	// 업캐스팅
		int num1 = 10;
		int num2= 5;
		
		System.out.printf("%d + %d = %d\n",num1,num2,calc.add(num1, num2));
		System.out.printf("%d - %d = %d\n",num1,num2,calc.sub(num1, num2));
		System.out.printf("%d * %d = %d\n",num1,num2,calc.mul(num1, num2));
		System.out.printf("%d / %d = %d\n",num1,num2,calc.div(num1, num2));
		
		calc = (Calculator) calc; // 다운캐스팅
		calc.description();
		
//		Calc 인터페이스에서 셍성한 static 메소드
		int arr[] = {1,2,3,4,5};
		System.out.println("total: "+Calc.total(arr));
	}

}
