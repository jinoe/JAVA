import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 1, b = 1, c;
		int sum=2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("피보나치 수열의 합계를 계산할 항수를 입력하세요: ");
		int n = scanner.nextInt();
		
		for(int i=3;i<=n;i++) {
			c = a + b;
			sum += c;
			a = b;
			b = c;
		}
		
		System.out.print("합계: ");
		System.out.println(sum);
	}
}
