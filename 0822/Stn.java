import java.util.Arrays;

public class Stn {
	public static void main(String[] args) {
		int data[] = { 5, 2, 1, 4, 7 };

		// 최댓값
		int max = data[0], min = data[0];
		for (int i = 0; i < data.length; i++) {
			if (max < data[i])
				max = data[i];
			else if (min > data[i])
				min = data[i];
		}
		System.out.printf("최댓값: %d, 최솟값: %n", max, min);

		// 최댓값과 최소값을 제외한 나머지 데이터의 평균

		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] > data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		int sum = 0;
		double avg;
		for (int i = 1; i < data.length - 1; i++) {
			sum += data[i];
		}
		avg = (double) sum / (data.length - 2); // 산술평균
		System.out.println(Arrays.toString(data));

		double stn = 0.0;
		for (int i = 1; i <= data.length - 1; i++) {
			double temp = (data[i] - avg);
//			stn += temp*temp;
			stn += Math.pow(temp, 2);
		}

		double var = Math.sqrt(stn / (data.length - 2));

		System.out.println(avg);
		System.out.println(stn);
		System.out.println(var);
	}
}
