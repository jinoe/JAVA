
public class snailArray2 {
	public static void main(String[] args) {
		int row = 5;
		int a[][] = new int[5][5];
		int n = 1, s = 1, i = row / 2, j = row / 2, k = 0;
		
		boolean flag = false;
		
		while(true) {
			k++;
			for(int p=1;p<=k;p++) {
				n++;
				j+=s;
				if(n>Math.pow(row, 2)){
					flag = true;
					break;
				}
				a[i][j] = n;
			}
			for(int p=1;p<=k;p++) {
				i += s;
				a[i][j] = ++n;
			}
			s *= -1;
		}
	}
}
