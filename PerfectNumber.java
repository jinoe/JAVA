import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("완전수인가 판단할 숫자를 입력하세요: ");
		int number = scanner.nextInt();
		
		int sum = 0;
		for(int i=1; i<=number/2;i++) {
			if(number%i==0) {
				System.out.println(i);
				sum++;
			}
		}
		if(sum==number) {
			System.out.println(number + "는(은) 완전수 입니다.");
		}
		else {
			System.out.println(number + "는(은) 완전수가 아닙니다.");

		}
	
	}
}
