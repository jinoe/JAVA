import java.util.Arrays;
import java.util.Scanner;

public class ConverterTest {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("16진수로 변환할 십진수를 입력하세요: ");
		int dec = scanner.nextInt();
		int number = dec;
		System.out.print("변환할 진법을 입력하세요: ");
		int n = scanner.nextInt();

		int hex[] = new int[8];
		int index = 0;

		while (true) {
			int m = dec / n;
			int r = dec % n;

			dec /= n;
			hex[index++] = r;
			if(m==0) break;
		}
		
//		char h[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		
		System.out.printf("%d를 %d진수로 변환하면 ", number, n);

		for (int i = index - 1; i >= 0; i--) {
			if (hex[i] < 10) {
				System.out.print(hex[i]);
			} else {
				System.out.print((char) (hex[i] - 10 + 65));
			}
		}
	}
}
