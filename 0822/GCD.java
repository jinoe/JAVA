import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		int big, small;
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if(a>b) {
			big = a;
			small = b;
		}else {
			big = b;
			small = a;
		}
		while(true) {
			int r = big % small;
			if(r==0) {
				break;
			}
			
			big = small;
			small = r;
		}
		
		System.out.printf("최대 공약수: %d, 최소 공배수: %d",small,a*b/small);
	}
}
