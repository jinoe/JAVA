import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("피보나치 수열의 합계를 계산할 함수를 입력하세요: ");
		int n = scanner.nextInt();
		int fibo[] = new int[n];

		fibo[0] = 1;
		fibo[1] = 1;

		int sum = 2;
		for (int i = 2; i < fibo.length; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
			sum += fibo[i];
		}

		System.out.printf("피보나치 수열의 합: %d\n", sum);
		System.out.println("피보나치 수열: " + Arrays.toString(fibo));

		for (int i = 0; i < fibo.length; i++) {
			System.out.printf("%d + ", fibo[i]);
		}
		System.out.printf("\b\b= %d\n", sum);

		System.out.printf("%d = ", sum);
		for (int i = 0; i < fibo.length; i++) {
			if(i>0) {
				System.out.print(" + ");
			}
			System.out.print(fibo[i]);
		}
	}
}
