import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		/*연산자 우선순위
		단항 연산자: ++, --
		이항 연산자: +, -, *, /
		삼항 연산자: ? :
		대입 연산자: =
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = scanner.nextInt();
		
		if(age>=18) {
			System.out.println("투표권이 없습니다.");
		}
	}
}
