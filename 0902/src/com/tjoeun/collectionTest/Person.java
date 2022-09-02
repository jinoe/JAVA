package com.tjoeun.collectionTest;

import java.util.HashSet;
import java.util.Objects;

//	TreeSet에 클래스 객체를 저장하려면 Compareable 인터페이스를 구현해야한다.

public class Person implements Comparable<Person> {
	
	private String name;
	private int age;
	
//	비교할 데이터가 문자열일 경우 comparrTo() 메소드는 자신이 크면 1, 같으면 0, 작으면 -1 을 리턴한다.
//	비교할 데이터가 숫자일 경우 "-" 연산을 실행해서 자신이크면 양수, 같으면 0, 작으면 음수를 리턴한다.

/*	@Override
	public int compareTo(Person o) {	
//		return this.name.compareTo(o.name);
//		return -this.name.compareTo(o.name);
//		return this.age - o.age;
		return -(this.age - o.age);
	}
*/
// name을 기준으로 오름차순, 그후 age는 내림차순으로 정렬
	@Override
	public int compareTo(Person o) {
		if (this.name.compareTo(o.name)==0) {
			return -(this.age -o.age);
		} else {
			return this.name.compareTo(o.name);
		}
		
	}
	
	public Person() {

	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("%s, %s", name,age);
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}


	
}
