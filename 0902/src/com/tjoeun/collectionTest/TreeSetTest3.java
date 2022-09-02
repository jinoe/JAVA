package com.tjoeun.collectionTest;

import java.util.TreeSet;

public class TreeSetTest3 {
	public static void main(String[] args) {
		TreeSet<Person> tset = new TreeSet<>();


/*		Person person = new Person();
		tset.add(person);
		Person person2 = new Person("홍길동",20);
		tset.add(person2);
		tset.add(person2);
*/		
//		TreeCode가 같은 객체를 2번이상 넣으면 중복되는 객체로 인식해서 저장하지 않는다. 
//		new를 사용해서 객체를 생성하면 기존에 생성한 객체와 내용이 같더라도 다른 Treecode가 부여된다.
//		new 를 이용하여 새로운 TreeCode를 저장하면 내용이 같더라도 다른 객체로 인식한다.
		Person person = new Person("홍길동",20);
		Person person2 = new Person("홍길동",10);
		Person person3 = new Person("임꺽정",30);
		Person person4 = new Person("임꺽정",5);
		
//		TreeSet은 HashSet과 갈리 데이터를 정렬시켜야 한다.
//		TreeSet에 저장한 데이터가 단순 데이터 경우 자바가 알아서 오름차순으로 정렬시켜주지만 클래스로 생성한
//		복합데이터일 경우 TreeSet에 저장된 클래스를 설계할때 Compareable 인터페이스를
//		구현하고 CompareTo() 메소도를 오버라이드 하서 정렬기준으로 사용할 필드에 저장된 데이터
		tset.add(person);
		tset.add(person2);
		tset.add(person3);
		tset.add(person4);
		System.out.println(tset);
	}
}
