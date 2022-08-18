import java.util.Random;

public class DiceTest {
	public static void main(String[] args) {

		Random random = new Random();

		int num[] = new int[6]; 
		
		for (int i = 0; i < 100000; i++) {
			num[random.nextInt(6)]++;
		}
		
		for(int i=0;i<num.length;i++) {
			System.out.printf("%d의 갯수: %d\n",i+1,num[i]);
		}
	}
}
