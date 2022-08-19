import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		
		int data[] = {8,3,4,9,1};
		
		for(int i=0;i<4;i++) { // 회전수 1번째 제외 4번
			for(int j=i;j<5;j++) { // 한 회전 동작
				if(data[j]<data[i]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(data));
		
	}
}
