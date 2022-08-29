package com.tjoeun.bookshop;

import java.util.Date;

public class BookShopMain {
	public static void main(String[] args) {
		BookVO vo = new BookVO();
		
		System.out.println(vo.getPublisher()); //String은 클래스 이므로 null로 초기화
		
		
		System.out.println(vo); // = vo.toString() 
		System.out.println(vo.toString()); // 클래스로 만든 객체를 출력하면 자동으로 toString() 이라는 메소드가 실행된다.
		//hashcode가 출력 한 클래스의 여러개의 object에 붙이는 식별번호. 16진수 8개 32비트 2^32 개
		
		//=> 클래스 객체에 저장된 데이터를 보고싶다면 toString()메소드를 오버라이딩 해야한다.
		
//		System.out.println(vo.book1.toString());
		
//		도서정보를 만든다.
			// Date date = new Date(2020,7,25); 뒤에 쓸일이 없음
		
		BookVO book1 = new BookVO("java","홍길동","더조은출판사",new Date(2020,7,25),35000);
		BookVO book2 = new BookVO("java","홍길자","더조은출판사",new Date(2020,7,25),35000);
		BookVO book3 = new BookVO("java","홍길동","더조은출판사",new Date(2020,7,25),35000);
		BookVO book4 = new BookVO("java","홍길동","더조은출판사",new Date(2020,7,25),35000);
		BookVO book5 = new BookVO("java","홍길동","더조은출판사",new Date(2020,7,25),35000);
		BookVO book6 = new BookVO("java","홍길동","더조은출판사",new Date(2020,7,25),35000);
		System.out.println(book1);
			// => 출판일은 날짜 데이터를 만들어 BookVO 클래스의 writeDate 필드에 넣어주면 다른곳에서 사용할 일이 없다.
		
//		"=="를 사용해서 같은가 비교할 수 있는 데이터는 기본 자료형 8가지와 null만 가능하다.
//		따라서, 클래스로 만든 객체는 "=="로 비교할 수 없다.
//		String은 단일 데이터가 저장되는 클래스라서 equals() 메소드만 사용하면 저장된 내용이 같은가
//		다른가 비교할 수 있었지만 String을 제외한 사용자 정의 클래스의 객체는 단일 데이터가 아니기
//		때문에 별도의 설정을 하지않으면 equals() 메소드로 비교할 수 없다.
		
		if(book2.getAuthor().equals(book6.getAuthor())) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		// => 내부의 데이터를 직접비교함
		
		if(book2.equals(book6)) { // => 해쉬코드가 다르다
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
//		=> 객체 껍데기를 비교하는것이 아니라 내부의 값들을 모두 비교해야됨
//		   메소드를 내용이 동일한 객체는 같은 hashcode를 가질수 있도록 hashcode() 메소드를 Override() 시켜 사용하면 "같다"가 출력된다.
		
		

		BookList bookList = new BookList(); // 책정보 리스트 생성자 실행
		
		bookList.addBook(book1);			// tip. 함수작성 전 우선 함수 호출을 하고 자동완성 기능을 사용하면 편하다
		bookList.addBook(book2);
		bookList.addBook(book3);
//		bookList.addBook(book4);
//		bookList.addBook(book5);
//		bookList.addBook(book6);
		System.out.println(bookList);
	}
}
