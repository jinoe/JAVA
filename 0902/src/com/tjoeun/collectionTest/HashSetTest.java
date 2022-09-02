package com.tjoeun.collectionTest;

import java.util.HashSet;
import java.util.Random;

public class HashSetTest {
	public static void main(String[] args) {

//		HashSet은 중복되는 데이터 입력을 허용하지 않는다. (파이썬의 집합 (set))
//		데이터를 입력하는 순서와 입력된 데이터가 실제로 저장되는 순서가 달라서 get(), set() 메소드가 없다.
//		=> 순서가 없다.

//		기본자료형은 랩퍼 클래스이용 (첫글자만 대문자) 

		HashSet<Integer> hset = new HashSet<>();

//		ArrayList 처럼
//		add.(), size(), remove(), clear() 이용가능
		hset.add(500);
		System.out.println(hset.size()+ " : "+ hset);
		hset.add(100);
		System.out.println(hset.size()+ " : "+ hset);
		hset.add(50);
		System.out.println(hset.size()+ " : "+ hset);
		hset.add(50);		// 중복값은 저장되지 않음
		System.out.println(hset.size()+ " : "+ hset);
		
		hset.remove(50);
		System.out.println(hset.size()+ " : "+ hset);
		
		hset.clear();
		System.out.println(hset.size()+ " : "+ hset);
		
		System.out.println("========복권번호 추첨기========");
		
		Random random = new Random();
		
		while(hset.size()<=6) {
			hset.add(random.nextInt(45)+1);
		}
		System.out.println(hset);
		int n;
		do {
			n = random.nextInt(45)+1;
		} while(hset.contains(n));
		System.out.printf("보너스 번호: %d\n",n);
	}
}
