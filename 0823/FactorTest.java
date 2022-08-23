import java.util.Scanner;

public class FactorTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입려하세요: ");
		int n = scanner.nextInt();
		
		while(n!=1) {
			for(int i =2;i<=n;i++) {
				if(n%i==0) {
					System.out.print(i+" ");
					n /=i;
					break;
				}
			}
		}
		
	}
}
