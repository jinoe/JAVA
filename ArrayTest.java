import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {

//		java에서 int 배열은 선언만 하면 default value 0 으로 초기화가 실행됨.
//		숫자는 0, 문자는 공백, boolean은 false, 기본 자료형을 제외한 나머지(클라스로 만든 객체)는 null

//		방법1 - 내용없이
		int[] data = new int[10];
		System.out.println(Arrays.toString(data));

		String[] data2 = new String[5]; // 클래스-> null
		System.out.println(Arrays.toString(data2));

		char[] data3 = new char[5];
		System.out.println(Arrays.toString(data3));
		
		double[] data4 = new double[10];
		System.out.println(Arrays.toString(data4));
	
		System.out.println();

		
//		방법2
//		String[] name = {"홍길동", "임꺽정","장길산", "일지매"};
		String name[] = { "홍길동", "임꺽정", "장길산", "일지매" };
		System.out.println(Arrays.toString(name));

//		tip. 배열은 데이터의 변동이 거의 없는경우 사용한다. => 삽입,삭제 후 데이터를 앞뒤로 끌거나 당겨와야함.
//		=> 삽입삭제가 빈번하면 연결리스트 사용 java는 ArrayList라는 Class를 제공한다.

		
		System.out.println();
		for(int i = 0; i<name.length; i++) {
			System.out.println(name[i]);
		}

//		java에서 향상된 배열의 표현
		for (String i : name) {
			System.out.println(i);
		}
	}
}
