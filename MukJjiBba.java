import java.util.Random;
import java.util.Scanner;

public class MukJjiBba {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int cpu = random.nextInt(3) + 1;
		System.out.println("cpu : " + cpu);

		System.out.print("가위(1) 바위(2) 보(3) : ");
		int user = scanner.nextInt();

		if ((cpu == 1 && user == 2) || (cpu == 2 && user == 3) || (cpu == 3 && user == 1)) {
			System.out.println("win");
		} else if (cpu == user) {
			System.out.println("draw");
		} else {
			System.out.println("lose");
		}
	}
}
