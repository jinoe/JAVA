package com.tjoeun.collectionTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest2 {
	public static void main(String[] args) {
		
		HashSet<String> hset = new HashSet<>();
		
		hset.add("홍길동");
		System.out.println(hset);
		hset.add("임꺽정");
		System.out.println(hset);
		hset.add("장길산");
		System.out.println(hset);
		hset.add("일지매");
		System.out.println(hset);
		hset.add("홍길동");
		System.out.println(hset);
		System.out.println("==================");
		
		ArrayList<String> list = new ArrayList<>();
		
//		1. 향상된 for로 Hashset이나 TreeSet의 데이터를 하나씩 get() 할수있다. => ArrayList로 옮기고 꺼내오기
		for(String str:hset) {
			list.add(str);
		}
		System.out.println(list);
		
//		2. Iterator 인터페이스: HashSet이나 TreeSet 같이 입력하는 순서와 저장되는 순서가 달라서 get(), set() 메소드를 사용할 수 없는 객체를 분리한다.
//		HashSet이나 TreeSet 객체에 iterator() 메소드를 실행하면 데이터 단위로 분리된다.
		
//		Iterator 클래스는 데이터 분리기 같은 역할 (ArrayList, HashSet, TreeSet 전부 가능)
		
		Iterator<String> iterator = hset.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
