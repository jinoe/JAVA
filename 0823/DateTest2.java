import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest2 {
	public static void main(String[] args) {
		Date date = new Date(); // 현재시간 방법1
		System.out.println(date); 
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) a h:mm:ss.SSS");
		System.out.println(sdf.format(date));
		
		Date date2 = new Date(System.currentTimeMillis()); // 방법2. Date(long type)
		System.out.println(sdf.format(date2));
		
		Date date3 = new Date("1983/04/22"); // 방법3. /로 구분 (거의 안씀)
		System.out.println(sdf.format(date3));
		
		//Date 클래스는 1900년을 기준으로 날짜를 처리하므로 (시작이 1900년도 1월 이므로 빼줘야됨)
		// 년도르 지정할때는 1900을 빼서 넣어야하고 월을 저장할때는  1울 빼서 넣어야한다.
		Date date4 = new Date(2023 - 1900,3 - 1,27);
		System.out.println(sdf.format(date4));
		
		Date date5 = new Date(127, 7, 23, 14, 2);
		System.out.println(sdf.format(date5));
		
		Date date6 = new Date(127,7,23,14,2,55);
		System.out.println(sdf.format(date6));
		
		
		// 년, 월, 일 입력받아 출력하기
		Scanner scanner = new Scanner(System.in);
		System.out.print("년, 월, 일을 입력하세요:");
		int year = scanner.nextInt() - 1900;
		int month = scanner.nextInt() -1 ;
		int day = scanner.nextInt();
		Date date7 = new Date(year, month, day);
		System.out.println(sdf.format(date7));
		
		// Set - 날짜 시간데이터 수정, Get - 날짜 시간데이터 가져오기
		date7.setYear(2023-1900);
		System.out.println(sdf.format(date7));
	}
}