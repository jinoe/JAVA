import java.util.Arrays;
import java.util.Random;

public class CardShuffle {
	public static void main(String[] args) {
		
//		int a = 3, b = 4;
//		System.out.printf("a = %d, b = %d\n", a, b);
//
//		int temp = b;
//		b = a;
//		a = temp;
//
//		System.out.printf("a = %d, b = %d\n", a, b);

		int card[] = new int[52];
		for (int i = 0; i <= 51; i++) {
			card[i] = i;
		}
//		System.out.println(Arrays.toString(card));

		String number[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String symbol[] = {"♠","◆","♥","♣"};
		
		for (int i = 0; i < card.length; i++) {
//			System.out.printf("%d ", card[i]);
			System.out.printf("%s%s ",symbol[i/13],number[i%13]);
			if ((i+1) % 13 == 0) {
				System.out.println();
			}
		}
		System.out.println("====================섞기전=========================");
		
		Random random = new Random();
		int n = random.nextInt(52);
		System.out.println(n);
		
		int temp = card[0];
		card[0] = n;
		card[n] = temp;
		
		for (int i = 0; i < card.length; i++) {
//			System.out.printf("%d ", card[i]);
			System.out.printf("%s%s ",symbol[card[i]/13],number[card[i]%13]);
			if ((i+1) % 13 == 0) {
				System.out.println();
			}
		}
	}
}
