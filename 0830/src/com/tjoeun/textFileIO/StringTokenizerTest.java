package com.tjoeun.textFileIO;

import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
//		String str = "010-1234-5678";
		String str1 = "사과 배 밤     대추";
		StringTokenizer st1 = new StringTokenizer(str1);
		
		while(st1.hasMoreTokens()) {		//다음에 읽을 데이터 token 이 있으면 true 없으면 false를 리턴한다.
			System.out.println(st1.nextToken());
		}
		System.out.println();
		
		
		String str2 = "사과,배,밤,대추";
		StringTokenizer st2 = new StringTokenizer(str2,","); // 생성자의 2번째 인수로 구분자를 지정
		
		while(st2.hasMoreTokens()) {	
			System.out.println(st2.nextToken());
		}
		System.out.println();
		
		String str3 = "사과,배.밤,대추";
		StringTokenizer st3 = new StringTokenizer(str3,",."); // 구분자는 여러개를 지정할수있음
		
		while(st3.hasMoreTokens()) {	
			System.out.println(st3.nextToken());
		}
		System.err.println();
		
		String str4 = "사과=1000,배=2200,밤=4400,대추=5500";
		StringTokenizer st4 = new StringTokenizer(str4,"=,",true);	// 생성자의 3번째 인수가  true면 구분자도 토큰으로 구분한
		while(st4.hasMoreTokens()) {		//다음에 읽을 데이터 token 이 있으면 true 없으면 false를 리턴한다.
			System.out.println(st4.nextToken());
		}
		System.err.println();
		
		// 사과(1,000원)
		DecimalFormat df = new DecimalFormat("(#,##0원)");
		StringTokenizer st5 = new StringTokenizer(str4,"=,");
		while(st5.hasMoreElements()) {
			System.out.print(st5.nextToken());
			System.out.println(df.format(Integer.parseInt(st5.nextToken())));
		}
		
	}
}
