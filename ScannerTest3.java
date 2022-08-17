import java.util.Scanner;

public class ScannerTest3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//키보드로 1문자 입력받기
		System.out.print("입력 : ");
		char confirm = scanner.nextLine().charAt(0); // 0번째 index에 있는 char 리턴 
		
		System.out.println("첫번째 문자 : " + confirm);
	}
}
