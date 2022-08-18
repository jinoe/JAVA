
public class ForTest {
	public static void main(String[] args) {
		// for는 {} 블록을 조건이 만족하는동안 반복해서 실행한다.

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);

//		대입 연산자: "="와 같이 사용한다. +=, -=, *=, /=, %=, ...
//		증감 연산자: ++, --
//		a++ : 사용후 1증가
//		a-- : 1증가 후 사용		

		int a = 1, b, c;
		b = a++;
		c = ++a;

		System.out.printf("a: %d\n", a);
		System.out.printf("b: %d\n", b);
		System.out.printf("c: %d\n", c);
		
		int d = 1, e;
		e = ++d + ++d + ++d + ++d;
		// 증감 연산자는 가장뒤부분 부터 적용됨 => 4번째 ++d 부터 2 3 4 5 순서로 증가
		System.out.printf("d = %d, e = %d",d,e);
	}

}
