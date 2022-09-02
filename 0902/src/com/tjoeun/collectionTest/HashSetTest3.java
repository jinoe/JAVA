package com.tjoeun.collectionTest;

import java.util.HashSet;

public class HashSetTest3 {
	public static void main(String[] args) {
		HashSet<Person> hset = new HashSet<>();


/*		Person person = new Person();
		hset.add(person);
		Person person2 = new Person("홍길동",20);
		hset.add(person2);
		hset.add(person2);
*/		
//		HashCode가 같은 객체를 2번이상 넣으면 중복되는 객체로 인식해서 저장하지 않는다. 
//		new를 사용해서 객체를 생성하면 기존에 생성한 객체와 내용이 같더라도 다른 hashcode가 부여된다.
//		new 를 이용하여 새로운 HashCode를 저장하면 내용이 같더라도 다른 객체로 인식한다.
		Person person = new Person("홍길동",20);
		Person person2 = new Person("홍길동",20); 
		
		hset.add(person);
		hset.add(person2);
		System.out.println(hset);
	}
}
