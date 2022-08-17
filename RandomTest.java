import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		System.out.println((int)(Math.random()*6));
		// Math.random(): 0 ~ 1 사이의 수
		// * n 후 Casting => 예전 방법
		
		Random random = new Random();
		// Random 클래스 사용방법
		System.out.println(random.nextDouble());
		System.out.println(random.nextInt(45));
	}
}
