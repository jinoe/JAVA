import java.util.Arrays;

public class Ranking {
	public static void main(String[] args) {
		int score[] = { 80, 100, 70, 100, 90, 95};
		int rank[] = new int[score.length];

		// 선택정렬 응용
		
		for (int i = 0; i < score.length; i++) {
			rank[i] = 1;
		}
		
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = i+1; j < score.length; j++) {
				if (score[i] < score[j]) {
					rank[i]++;
				} else if (score[i] > score[j]) {
					rank[j]++;
				}
			}
		}

//		for(int i=0;i<score.length;i++) {
//			rank[i] = 1;
//			for(int j = 0;j<score.length;j++) {
//				if(score[i]>score[j]) {
//					rank[i]++;
//				}
//			}
//		}
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%3d점은 %d등 입니다.", score[i], rank[i]);
			for (int j = 0; j < score[i] / 10; j++) {
				System.out.print("★");
			}
			if (score[i] % 10 >= 5) {
				System.out.print("☆");
			}
			System.out.println();
		}
	}
}
