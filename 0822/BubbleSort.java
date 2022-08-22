import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 갯수를 입력하세요: ");
		int n = scanner.nextInt();
		int array[] = new int[n];
		
		System.out.print("숫자를 입력하세요: ");
		for(int i=0;i<n;i++) {
			array[i] = scanner.nextInt();
		}
		
//		System.out.println(Arrays.toString(array));
		
		//BubbleSort
		int temp = 0;
		
		for(int i = 0; i<array.length -1;i++) {
			
			boolean flag = true; // Flag를 사용하여 최적화
			
			for(int j =0; j<array.length-1-i;j++) {
				if(array[j]>array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
					flag = false;
				}
			}
			
			if(flag) break;
		}
		
		System.out.println(Arrays.toString(array));
	}
}
