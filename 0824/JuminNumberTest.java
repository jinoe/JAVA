import java.util.Scanner;

public class JuminNumberTest {
	public static void main(String[] args) {
		
//		long jumin = 8304221185600L; //Long 형 변수는 끝에 L을 붙여야함.
		
		String number = "8304221185604";
//		String check = "234567892345";
//		System.out.println(number.charAt(1));
		int sum = 0;
		for(int i=0;i<12;i++) {
//			sum += (int)number.charAt(i) * (int)check.charAt(i);
//			sum += Integer.parseInt(numbember.charAt(i)+"") * Integer.parseInt(check.charAt(i)+"");
//			sum += Integer.parseInt(number.charAt(i)+"") * (i<8?i+2:i-6);
			sum += Integer.parseInt(number.charAt(i)+"") * (i%8+2);
		}
		int result = (11 - sum%11) % 10;
		System.out.println("마지막자리: " + result);
	}
}
