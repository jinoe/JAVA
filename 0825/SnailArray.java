
public class SnailArray {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int n = 0; // 1증가시킬 변수
		int s = 1; // 행과열이 +1 또는 -1 
		int i = 1; // 행
		int j = 0; // 열
		int k = 5; // 반복문의 반복 횟수 제어에 사용하는 변수
		
		while(true) {
			for(int p=1;p<=k;p++) {
				j += s;
				a[i][j] = ++n;
			}
			
			if(--k == 0) break;
			
			for(int p=1;p<=k;p++) {
				i += s;
				a[i][j] = ++n;
			}
			s *= -1;
			
		}
		for(i =0;i<a.length;i++) {
			for(j=0;j<a[1].length;j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
	}
}
