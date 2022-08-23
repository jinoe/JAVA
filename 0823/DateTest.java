import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		// 서식문자를 제외한 나머지문자는 입력하는 그대로 출력된다.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분 ss초");
		System.out.println(sdf.format(date));
//		System.out.println(sdf.format(date.getYear()));

//		=========================================================

		// 카렌다 클래스를 이용 (추천)
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		System.out.println("년: " + calendar.get(Calendar.YEAR));
		System.out.println("월: " + calendar.get(Calendar.MONTH));
		System.out.println("일: " + calendar.get(Calendar.DATE));
		System.out.println("시: " + calendar.get(Calendar.HOUR));
		System.out.println("시: " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("분: " + calendar.get(Calendar.MINUTE));
		System.out.println("초: " + calendar.get(Calendar.SECOND));
		System.out.println("밀리초: " + calendar.get(Calendar.MILLISECOND));
		System.out.println("요일: " + calendar.get(Calendar.DAY_OF_WEEK));

		// 시스템 클래스에서 가져오기 : 13자리의 정수로 출력 => long 사용, int는 10자리까지
		System.out.println(System.currentTimeMillis());

		// 실행 시간 구하는 예제 프로그램
		long start = System.currentTimeMillis();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		long end = System.currentTimeMillis();
		SimpleDateFormat sdf3 = new SimpleDateFormat("실행시간: HH:mm:ss.SSS초");
		System.out.println("실행 시간: " + (double) (end - start) / 1000);
		System.out.println(sdf3.format(end - start - 32400000)); // 오프셋 시간 한국(+9시간)

	}
}
