import java.util.Date;
import java.util.Scanner;

public class CalendarTest2 {
	public static void main(String[] args) {
		
		MyCalendar myCalendar = new MyCalendar();
//		자바의 모든 클래스는 Object라는 클래스를 상속받아서 만들어진다.
//		ctrl + T 로 확인가능
		
		System.out.println(myCalendar.isLeapYear(2022));
		System.out.println(MyCalendar.isLeapYear(2022));
		// => static 으로 생성되면 객체 생성없이 클래스. 으로 바로 접근 가능하다.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("이번달(1), 특정달(2): ");
		int confirm = scanner.nextInt();
		
		int year, month;
		if (confirm == 1) {
			Date date = new Date();
			year = date.getYear() + 1900;
			month = date.getMonth() + 1;
		} else {
			System.out.print("달력을 출력할 년, 월을 입력하세요: ");
			year = scanner.nextInt();
			month = scanner.nextInt();
		}
		
		System.out.println("============================");
		System.out.printf("         %4d년%2d월\n", year, month);
		System.out.println("============================");
		System.out.println(" 일  월  화  수  목  금  토 ");
		System.out.println("============================");
	
//		1일이 출력될 위치를 맞추기 위해 1일의 요일만큼 반복하며 빈 칸(날짜당 4칸)을 출력한다.
//		for (int i=1; i<=myCalendar.weekDay(year, month, 1); i++) {
//			System.out.print("    ");
//		}
		
//		1일이 출력될 위치를 맞추기 위해 1일의 요일만큼 반복하며 전달 날짜를 출력한다.
		int week = myCalendar.weekDay(year, month, 1);
		int start = 0;
		if (month == 1) {
//			start = myCalendar.lastDay(year - 1, 12) - week; // 1월
			start = 31 - week; // 1월
		} else {
			start = myCalendar.lastDay(year, month - 1) - week; // 2 ~ 12월
		}
		for (int i=1; i<=week; i++) {
			System.out.printf(" %2d ", ++start);
		}
		
//		1일부터 달력을 출력할 달의 마지막 날짜까지 반복하며 날짜를 출력한다.
		for (int i=1; i<=myCalendar.lastDay(year, month); i++) {
			System.out.printf(" %2d ", i);
//			출력한 날짜(i)가 토요일이고 그 달의 마지막 날짜가 아니면 줄을 바꾼다.
			if (myCalendar.weekDay(year, month, i) == 6 && i != myCalendar.lastDay(year, month)) {
				System.out.println();
			}
		}
		
//		날짜를 다 출력하고 남은 빈 칸에 다음달 1일의 요일부터 토요일까지 반복하며 날짜를 출력한다.
//		if (month == 12) {
//			week = myCalendar.weekDay(year + 1, 1, 1); // 12월
//		} else {
//			week = myCalendar.weekDay(year, month + 1, 1); // 1 ~ 11월
//		}
//		if (week != 0) {
//			start = 0;
//			for (int i=week; i<=6; i++) {
//				System.out.printf(" %2d ", ++start);
//			}
//		}
		
		week = myCalendar.weekDay(year, month, myCalendar.lastDay(year, month)) + 1;
		start = 0;
		for (int i=week; i<=6; i++) {
			System.out.printf(" %2d ", ++start);
		}
		
		System.out.println("\n============================");
	}
}
