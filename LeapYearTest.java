import java.util.Scanner;

// 이클립스 코드 정렬 단축키 ctrl + shift + F
public class LeapYearTest {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("윤년, 평년을 판단할 년도를 입력하세요: ");
		int year = scanner.nextInt();

		// 윤년 평년 판별식
		// 년도가 4로 나눠떨어지고 100으로 나눠떨어지지 않거나 400으로 나눠 떨어지면 윤년

//		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//			System.out.println("윤년");
//		}
//		else {
//			System.out.println("평년");
//		}
		
//		System.out.println(year + "년은 " + (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ?"윤":"평") + "년 입니다.");
//		System.out.printf("%d년은 %s년 입니다.", year, (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ?"윤":"평"));
		
		
		// 논리값을 기억하는 변수나 리턴 타입이 논리값인 메소드의 이름은 "is"로 시작하는것이 관행이다.
		boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
		if(isLeapYear) {
			System.out.println(year + "년은 윤년입니다.");
		}
		else {
			System.out.println(year + "년은 평년입니다.");
		}
	}
}
