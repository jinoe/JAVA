
public class StringTest {
	public static void main(String[] args) {
		
//		자바는 기본 자료형(boolean, byte, char, short, int, long, float, double)으로 만든 변수는 일반변수
//		클래스로 만든 변수는 객체
//		객체는 참조변수(데이터를 기억하는 변수가 아니고 데이터가 저장된 메모리의 주소를 기억하는 변수) (C언어의 포인터)
//		Ex) String은 데이터가 얼마나 들어올지 알수 없음 => 동적할당이 필요함
	
//		문자열 "AAA"가 처음 사용되므로 메모리 어딘가에 "AAA"를 만들고 시작주소를 str1에 저장한다
		String str1 = "AAA";
//		문자열 "AAA가 이미 메모리에 생성되어 있는 상태이므로 이미 생성되어 있는 "AAA"의 시작주소를 str2에 저장한다
		
//		문자열은 자주쓰므로 이렇게 동작하지만 다른 new 를사용하는 클래스객체는 다름
		String str2 = "AAA";
		
		if(str1==str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
//		아래와 같이 new 를 사용해서 "AAA"를 만들면 메모리에 "AAA"의 존재여부와 관꼐없이 무조건 다시 만든다.
		String str3 = new String("AAA");
		
		if(str1==str3) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
//		결론 => 기본자료형과 null을 제외한 클래스로 생성한 모든 댇체는 "=="을 사용해서 비교하지 않는다.
//		클래스로 생성한 객체는 "=="가 아니고 equals() 메소드를 사용해서 비교해야 한다.
//		클래스로 생성한 객체를 "=="로 비교하면 객체에 저장된 내용을 비교하는것이 아니고 객체가 메모리에
//		생성된 주소를 비교한다.
		
		if(str1.equals(str3)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}
	
}
