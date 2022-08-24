
public class CalendarTest {
	public static void main(String[] args) {

//		메소드의 형식, []로 묶는 내용은 생략이 가능하다.
//		[접근권한 지정자] [static] 리턴타임 메소드이름([인수, ,,,]){
//			메소드 실행문;

//		[return 값];
//		}

//		접근권한 지정자
//		private: 현재클래스 외부 접근 불가능
//		protected: 현재 클래스와 현재 클래스를 상속받은 자식 클래스에서만 접근할 수 있다.
//		package:  접근권한 지정자 생략시, 같은 패키지에서는 public 처럼 사용되고 다른 패키지에서는 private처럼 사용된다.
//		public: 현재 클래스내부, 외부 어디서나 자유롭게 접근할 수 있다.

//		ststic(정적) 메소드는 메소드를 작성한 클래스의 객체를 생성하지 않고 클래스이름에 .을 찍어서 실행할수 있다.
//		=> 자주사용하는 메소드들은 정적메소드로 만들어 사용하면 편리하다.

//		리턴 타입은 메소드가 실행되고 난 후 결과를 되돌려줄 때 결과의 자료형을 적어준다.
//		논리값을 기억하는 변수나 메소드의 이릉은 is로 시작하는것이 관행이다.

//		변수는 일반적으로 private, 메소드는 일반적으로 public을 사용한다.

		System.out.println(isLeapYear(400));
	}

	public static boolean isLeapYear(int year) {

		return year % 4 == 0 || year % 100 != 0 || year % 400 == 0;
	}

}
