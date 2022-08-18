
public class PerfectNumber2 {
	public static void main(String[] args) {
		int lm = 0; //완전수의 갯수
		
		for(int i=1;i<=10000;i++) {
			
			int sum = 0;
			for(int j=1;j<=i/2;j++) {
				if(i%j==0) {
					sum += j;
				}
			}
			if(sum==i) {
				lm++;
				System.out.printf("%d 번째 완전수: %d\n",lm,i);
			}
			
		}
	}
}
