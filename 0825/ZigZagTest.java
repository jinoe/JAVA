import java.util.Arrays;

public class ZigZagTest {
	public static void main(String[] args) {

//		1. 자바는 2차원 배열을 만들때 for문 2중첩을 할 필요가 없다.
		int[][] array = new int[4][6];
//		=> 초기화 단계에서 [][], (파이썬은 array[ [] for i in range(a,b)] 로 중첩)
		System.out.println("행의 갯수: " + array.length);
		System.out.println("행의 갯수: " + array[1].length);

		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array[1])); // => 자바는 기본값 0 으로 초기화
		System.out.println();

		for (int i = 0; i < (array.length); i++) {
			System.out.println(Arrays.toString(array[i]));
		}

//		2. 2차원 배열 출력
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("a[%d][%d] = %d	", i, j, array[i][j]);
			}
			System.out.println();
		}

//		3. 지그재그 방식 - 방법 1
		int n = 0;
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < array[i].length; j++) {
					array[i][j] = n++;
				}
			} else {
				for (int j = array[i].length - 1; j >= 0; j--) {
					array[i][j] = n++;
				}
				System.out.println();
			}
		}

		printArray(array);

//		4. 지그재그 방식 - 방법 2
//		switch , togle - 좌우를 왔다갔다하는 변수명
//		flag - 한쪽을 반복하다 상태가 변하는 변수명

		n = 0;
		int start = 0;
		int end = array[0].length - 1;
		int sw = 1; // start부터 end 까지 증가치로 쓰일 변수

		for (int i = 0; i < array.length; i++) {
			for (int j = start; j <= end; j+=sw) {
				array[i][j] = n++;
			}
			int temp = start;
			start = end;
			end = temp;
			sw *= -1;
		}
		printArray(array);
		
	}

	public static void printArray(int data[][]) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.printf("a[%d][%d] = %d	", i, j, data[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
