import java.util.Arrays;
import java.util.Scanner;

public class StringMethod {
	public static void main(String[] args) {
		
		String str = "    tjoeunit    ";
		
//		01. length
		
		System.out.println(str.length());
		
		//char(10) => 고정길이 문자열
		//varchar(3000) => 가변길이 문자열, 데이터가 덜 들어오면 그만큼만 차지함
		
//		02. trim(); 
		
//		 앞 뒤 공백 제거하기
//		python에서 strip()
		
		System.out.println(str.trim());
		System.out.println(str.trim().length());
		
		Scanner scanner = new Scanner(System.in);
//		데이터 입력단계에서 불필요한 공백제거
//		System.out.print("이름 입력: ");
//		String name = scanner.nextLine().trim();
//		String name = scanner.nextLine();
//		System.out.println(name + " "+ name.length());
		
		
		str = "tjoeunit";
		
//		03. charAt(index): 문자열에서 지정된 index 번째 위치의 문자를 얻어온다.
		System.out.println(str.charAt(0));
		
//		char ch = scanner.nextLine().charAt(0);
//		System.out.println(ch);
		
//		04. toUpperCase(), toLowerCase()
		str = "Tjoeunit";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
//		05. substring(a,b) : 문자열 슬라이싱 (a ~ b-1까지) (파이썬과 동일)
		str = "830422-1185600";
		System.out.println("주민등록 번호 뒷자리:" + str.substring(7));
		System.out.println("생년: "+ str.substring(0,2));
		System.out.println("월: "+str.substring(2,4));
		System.out.println("일: "+str.substring(4,6));
		
//		06. indexOf(): 문자열의 왼쪽부터 검색하여 최초로 나타나는 index 리턴
//		lastIndexOf(): 오른쪽부터 검색하여 최초로 나타나는 index 리턴
		str = "itTjoeunit";
		System.out.println(str.indexOf("it"));
		System.out.println(str.lastIndexOf("it"));
		// => 메소드 실행결과가 0 이상이면 인수로 저장된 문자열이 포함되어 있다는 의미! (중요)
		
//		07. contains() 메소드는 문자열에 인수로 지정한 문자열이 포함되어 있으면 true, 없으면 false
		System.out.println(str.contains("it"));
		System.out.println(str.contains("aaaa"));
		
		str = "it Tjoeun it";

//		08. split("구분자") => 배열로 리턴 (파이썬과 동일) (자바에서는 StringTockenizer 클래스를 이용하는것이 일반적이다.)
		System.out.println(Arrays.toString(str.split(" ")));
	
		//문제: "-" 를 "*"로 바꾸기
		str = "123-4567-12345";
//		str = str.replace("-", "*");
		int index1 = str.indexOf("-");
		int index2 = str.lastIndexOf("-");
		System.out.println(str.substring(index1+1,index2));
//		for(int i =index1+1;i<index2;i++) {
//			str = "*";
//		}
//		System.out.println(str);
		
		
	}
}
