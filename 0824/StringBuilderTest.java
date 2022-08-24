
public class StringBuilderTest {
	public static void main(String[] args) {

//		StringBuilder 클래스를 이용하는 방법.
		
		String java = new String("java");
		String jsp = new String("java"); // new 를 이용하면 메모리에 새로만든다.
		
		System.out.println(java);
		System.out.println(jsp);
		System.out.println("java 메모리주소: " + System.identityHashCode(java));
		System.out.println("jsp 메모리주소: " + System.identityHashCode(jsp));
		
//		1. String을 연결하면 기존의 String에 연결되는 것이 아니고 새로운 문자열이 생성된다.
		java = java + jsp;
		System.out.println(java);
		System.out.println("신규 주소: " + System.identityHashCode(java));
		
//		2. concat("문자열"): 문자열이 인수로 지정한 문자열을 이어 붙인다.
		java = java.concat(jsp);
		System.out.println("신규 주소: " + System.identityHashCode(java));
		
//		=> 문자열 덧셈을 아주많이 사용하면 매번 객체를 새로만들기 때문에 시스템이 느려진다.
//		=> StringBuilder 클래스 이용
		
		System.out.println();
		
//		3. StringBuilder 클래스는 내부적으로 가변적인 char[]배열을 멤버 변수로 가진다. => 동적메모리 사용
		String html = new String("html");
		String css = new String("css");
		
//		문자열을 연결할 때 String 클래스처럼 문자열을 새로 만들지 않고 char[] 배열을 변경한다.
		StringBuilder builder = new StringBuilder(html);
		System.out.println(builder);
		System.out.println("builder 주소: " + System.identityHashCode(builder));
		
		builder.append(css); //append 사용
		
		System.out.println(builder);
		System.out.println("builder 주소: " + System.identityHashCode(builder));
		
		
//		4. 실행시간 재보기
		String str = "";
		long start = System.currentTimeMillis();
		for(int i =0; i<100000;i++) {
			str += "꽝";
		}
		long end = System.currentTimeMillis();
		System.out.println("걸린시간: "+ (double)(end-start)/1000); // 3.031 초
		
		StringBuilder str2 = new StringBuilder("");
		start = System.currentTimeMillis();
		for(int i =0; i<100000;i++) {
			str2.append("꽝");
		}
		end = System.currentTimeMillis();
		System.out.println("걸린시간: "+ (double)(end-start)/1000); // 0.001초
		
//		결론 => 일반적인 소량의 문자열 데이터는 상관없지만 대량의 문자열데이터는 StringBuilder 클래스를 사용한다.
		
		
//		5. StringBuffer 클래스. (StringBuilder와 비슷함)
		
		StringBuffer str3 = new StringBuffer("");
		start = System.currentTimeMillis();
		for(int i =0; i<100000;i++) {
			str3.append("꽝");
		}
		end = System.currentTimeMillis();
		System.out.println("걸린시간: "+ (double)(end-start)/1000); // 0.001초
		
//		참고.
//		String        :  문자열 연산이 적고 멀티쓰레드 환경일 경우
//		StringBuffer  :  문자열 연산이 많고 멀티쓰레드 환경일 경우
//		StringBuilder :  문자열 연산이 많고 단일쓰레드이거나 동기화를 고려하지 않아도 되는 경우
		
//		쓰레드란? 하나의 프로세스에서 여러개의 작업이 이루어지는 단위 Ex) 게임그래픽 출력, BGM 출력 등
//		시스템 즉 운영체제가 관리
//		동기화란? 순서를 정하는것, 비동기화는 순서를 정하지 않는것
//		비동기화: 큰단위의 프로세스가 진행되는도중 작은단위의 프로세스가 들어오면 그것부터 실행 (순서 x)
//		동기화: 큰단위의 프로세스가 끝날때까지 기다린후 진행함 (순서 ㅇ)
//		언제 끝날지 모르는 상태로 계속기다림 (교착상태, DeadLock)
//		운영체제는 프로세스가 교착상태에 빠지지않게 시간제한을 둔다. (Round Robin 방식)
		
//		6. text Block => JDK 13 추가
//		문자열을 """ 로 감싼다.
		String strBlock = """
				개울가에
				올챙이한마리
				꼬물꼬물 헤엄치다.
				""";
		
		System.out.println(strBlock);
	}
}
