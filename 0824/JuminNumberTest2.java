import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JuminNumberTest2 {
	public static void main(String[] args) {

		System.out.print("주민등록번호 13자리를 - 없이 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		String jumin = scanner.nextLine();
		int year = (jumin.charAt(0)-'0')*10 +(jumin.charAt(1)-'0') + 1900;
//		System.out.println(year);
		
		Date date = new Date();
		System.out.println(date.getYear()+1900);
		System.out.println(date.getYear()+1900 - year);
		
//		Mapper 클래스
//		Integer.parseInt(): 인수로 지정된 문자열을 정수로 변환
//		Double.parseDouble(): 문자열을 실수로
//		Boolean.parseBoolean(): 문자열을 논리값으로 변환
		
		int birthday = Integer.parseInt(jumin.substring(2,6));
		int currentday = (date.getMonth()+1)*100 + date.getDate();
		System.out.println(currentday);
		System.out.println(birthday);
		if(birthday<currentday) {
			year -= 1;
		}
		System.out.printf("당신의 나이: 만%d세\n",date.getYear()-year +1900);
		
		
	}
}
