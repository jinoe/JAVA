import java.util.Scanner;

public class ScannerTest2 {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = scanner.nextInt();

		// nextInt는 Enter를 키보드 버퍼에서 회수 하지 않음
		// nextInt(), nextDouble() 등은 자신이 읽어들이 데이터만 회수함 => Enter는 회수하지 않는다.
		
		scanner.nextLine(); // 버퍼 초기화 중요!
		
		System.out.print("이름 : ");
		String name = scanner.nextLine();
		
		System.out.println(name + "님은 " + age + "살 입니다.");
		
	}
}
