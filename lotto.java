import java.util.Random;

public class lotto {
	public static void main(String[] args) {
//		추첨기를 만든다.

		int lotto[] = new int[45];

//		추첨기에 공을 넣는다.
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
		System.out.println("\n----------------섞기전----------------");
		show(lotto);

		
//		섞는다.
		Random random = new Random();
		for (int i = 0; i <= 1000000; i++) {
			int n = random.nextInt(44) + 1;
			int temp = lotto[n];
			lotto[n] = lotto[0];
			lotto[0] = temp;
		}
		System.out.println("\n----------------섞은후----------------");
		show(lotto);

		
//		1등 번호를 출력한다.
		Thread thread = new Thread();
		System.out.print("\n1등번호: ");
		for (int i = 0; i <= 6; i++) {
			System.out.printf("%02d ", lotto[i]);
			try {
				thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		정렬
		for(int i=0;i<4;i++) { // 회전수 1번째 제외 4번
			for(int j=i;j<5;j++) { // 한 회전 동작
				if(lotto[j]<lotto[i]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		System.out.println();
		for (int i = 0; i <= 6; i++) {
			System.out.printf("%02d ", lotto[i]);
		}
		
	}
		
	private static void show(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("%02d ", lotto[i]);
			if ((i + 1) % 10 == 0)
				System.out.println();
		}
	}
}
