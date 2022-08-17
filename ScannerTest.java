import java.util.Scanner; // 패키지 import 
// ctrl + shift + o 불필요한 import 제거 //
public class ScannerTest {
	public static void main(String[] args) {
		
		int num = 10;
		System.out.println(num);
		// 클래스 객체 이름 = Class로 만든 변수 / new 생성자
		
		Scanner scanner = new Scanner(System.in); // 키보드로 입력받는 스캐너
		//클래스   객체
		
		//키보드로 입력 받은 데이터를 변수에 저장한다.
		System.out.print("주소 : ");
		String addr = scanner.nextLine();
		System.out.print("이름 : ");
		String name = scanner.next();
		/*
		 next : 한 단어 입력
		 nextLine : 한 줄 입력 / nextLine 은 키보드 버퍼가 비어있지 않으면 자동으로 버퍼에 남은 내용을 끝까지 읽는다
		 */
		
		
		// 스캐너로 키보드로 입력하는 내용을 입력받는 경우 변수에 저장되는것이 아니라 키보드 버퍼에 우선 저장된다.
		
		System.out.println(name + " 님은 " + addr + "에 삽니다");
		
	}
}
