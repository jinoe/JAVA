package com.tjoeun.syncronizedMethodTest;

public class LibraryMain {
	
	static Library library = new Library();

	public static void main(String[] args) {
		/*
		System.out.println(library.booklist);
		
		String book = library.booklist.remove(0);		// remove(index)의 값은 value
		boolean book2 = library.booklist.remove("다빈치코드");	// remove(value)의 값은 boolean
		
		System.out.println(book);
		System.out.println(book2);
		*/
		
		Student student1 = new Student("홍길동");
		Student student2 = new Student("임꺽정");
		Student student3 = new Student("장길산");
		Student student4 = new Student("일지매");
		Student student5 = new Student("이몽룡");
		Student student6 = new Student("성춘향");
		
		
		
	}
}
