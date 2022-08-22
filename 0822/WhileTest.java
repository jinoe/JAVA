
public class WhileTest {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum += i;
		}
		System.out.println("1~10의 합계: " + sum);
		
		int i=0;
		sum = 0;
		while(i<=10){
			sum+= i++;
		}
		System.out.println("1~10의 합계: " + sum);
		
		
		i=0;
		sum = 0;
		do {
			sum+=i++;
		} while(i<=10);
		
		System.out.println("1~10의 합계: " + sum);
	}
}
