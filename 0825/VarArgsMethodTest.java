//	가변인자 메소드
public class VarArgsMethodTest {
	public static void main(String[] args) {

//		같은(비슷한) 기능을 실행하는 메소드의 인수가 서로 다를 경우 많은 수의 메소드 오버로딩이 필요하다.
		System.out.println("sum(1,2) = " + sum(1, 2));
		System.out.println("sum(1,2) = " + sum(1, 2, 3));
		System.out.println("sum(1,2) = " + sum(new int[] {1,2}));
		System.out.println("sum(1,2) = " + sum(new int[] {1,2,3}));
		System.out.println("sum(1,2) = " + total(1,2,3));
	
	}
	private static int sum(int i, int j) {
		return i + j;
	}

	private static int sum(int i, int j, int k) { // 메소드 오버로딩, case1. 인자수가 다른경우
		// TODO Auto-generated method stub
		return i + j + k;
	}
	
	private static int sum(int i, int j, char k) { // 메소드 오버로딩, case2. 데이터타입이 다른경우
		// TODO Auto-generated method stub
		return i + j + k;
	}
//	=> 1. 장점. 메소드를 하나씩 만들어야 하지만 메소드 구성이 단순하다.
//	=> 단점. 많은수의 오버로딩이 필요함
	
//	==============================================================================================
	
	private static int sum(int[] data) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0;i<data.length;i++) {
			sum+=data[i];
		}
		return sum;
	}
//	=> 2. 장점. 파라미터를 배열로 만들면 다수의 메소드 오버로딩을 할 필요가 없다는것이다. (인자가 늘어나도 괜찮음)
//	=> 단점. 메소드가 복잡하다.
//	=> 가변인자 메소드의 원형이라고 할수있다.
	
//	메소드의 인수를 배열로 구현하면 많은 수의 오버로딩이 필요없지만 인수를 배열로 선언하고
//	선언한 배열에 초기치를 지정해서 전달해야하는 번거로움이 있다.
	
//	메소드 오버로딩: 같은 이름을 가지는 서로 다른 기능을 실행하는 메소드가 여러개 나올 수 있다. (파이썬은 지원x)
//	메소드 이름이 같은면 인수의 개수로 메소드를 식별.
//	인수의 개수도 같다면 인수의 데이터 타입으로 메소드를 식별. => 이름, 인수의 갯수, 인수의 데이터타입이 모두 같으면 안됨
	
	
//	3. 가변인수를 사용하는 메소드 => 가변 인수는 자료형 뒤에 "..."을 쓰고 뒤에 배열 이름을 입력한다.
//	1, 2 번 방식의 단점을 보완한 것이 가변인자 메소드이다.
//	가변인수는 맨 마지막에 딱 1번 사용할수 있다. (동적메모리를 가장 나중에 할당하기 때문에 => 넘어오는 데이터수를 몰라서 메모리에 미리 할당하지 못함)
	private static int total(int ... data) { // => "..." 은 배열로 인식되서 2번 메소드와 동일함. (인자가 배열, 데이터 타입 int로 동일하기때문에)
		int total = 0;
		for (int i=0;i<data.length;i++) {
			total += data[i];
		}
		return total;
	}
}
