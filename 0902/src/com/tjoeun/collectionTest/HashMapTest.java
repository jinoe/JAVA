package com.tjoeun.collectionTest;

import java.util.ArrayList;
import java.util.HashMap;

//	파이썬의 딕셔너리 역할
//	HashMap은 사전식으로 데이터를 저장한다. Key(K)에 Value(V)를 할당하는 방식으로 저장된다.

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> hmap = new HashMap<>();
		
//		put(key,value): 삽입, 수정(덮어쓰기)
		hmap.put("apple", 1000);
		hmap.put("banana", 3500);
		hmap.put("orange", 2000);
		hmap.put("melon", 20000);
		hmap.put("water melon", 15000);
//		hmap.put("apple", 1500);
		
//		size(): 데이터 수
		System.out.println(hmap);
		System.out.println("size: "+hmap.size());

//		get(key): value 찾기 (없으면 null 리턴)
		System.out.println("get(apple): " + hmap.get("apple"));

//		remove(key): 제거
		hmap.remove("apple");
		System.out.println(hmap);
		
//		keySet(), values()	=> 배열로 리턴
		System.out.println("keys: " + hmap.keySet());
		System.out.println("values: "+hmap.values());
		
		
//		values 값만 ArrayList에 저장하기
		ArrayList<Integer> values = new ArrayList<>();

/*	1. values 사용
		for(int value:hmap.values()) {
			values.add(value);
		}
*/ 
//	2. keySet() 사용
		for(String keys:hmap.keySet()) {
			values.add(hmap.get(keys));
		}
		System.out.println("ArrayList: "+values);
	}
}
