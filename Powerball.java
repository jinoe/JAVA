import java.util.Random;
import java.util.Scanner;

public class Powerball {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("복권 구매금액을 입력하세요: ");
		int money = scanner.nextInt();

		for (int k = 0; k < money / 1000; k++) {
			int powerball[] = new int[69];
			// 초기값 세팅
			for (int i = 0; i < powerball.length; i++) {
				powerball[i] = i + 1;
			}

//			System.out.println("\n----------------섞기전----------------");
//			show(powerball);

			// 섞기
			Random random = new Random();
			for (int i = 0; i <= 1000000; i++) {
				int n = random.nextInt(68) + 1;
				int temp = powerball[n];
				powerball[n] = powerball[0];
				powerball[0] = temp;
			}

//			System.out.println("\n----------------섞은후----------------");
//			show(powerball);

			// 일반볼
			System.out.print("\n\n흰공: ");
			Thread thread = new Thread();
			for (int i = 0; i < 5; i++) {
				System.out.printf("%d ", powerball[i]);
			}
			// 슈퍼볼
			System.out.print(" 슈퍼볼: ");
			System.out.print(random.nextInt(27) + 1);
		}
	}

	private static void show(int[] powerball) {
		for (int i = 0; i < powerball.length; i++) {
			System.out.printf("%02d ", powerball[i]);
			if ((i + 1) % 10 == 0)
				System.out.println();
		}
	}

}
