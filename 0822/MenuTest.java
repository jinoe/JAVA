import java.util.Scanner;

public class MenuTest {
	public static void main(String[] args) {

		int menu=0;

		while (menu != 5) {
			do {
				System.out.println("===================================");
				System.out.println("1.입력  2.목록보기  3.수정  4.삭제  5.종료");
				System.out.println("===================================");
				System.out.println("원하는 메뉴를 입력하세요: ");
				Scanner scanner = new Scanner(System.in);
				menu = scanner.nextInt();

			} while (menu < 5 && menu >= 1);
			
			switch (menu) {
				case 1:
					System.out.println("입력:");
					break;
				case 2:
					System.out.println("목록보기:");
					break;
				case 3:
					System.out.println("수정:");
					break;
				case 4:
					System.out.println("삭제:");
					break;
				}
			
		}
	}
}
