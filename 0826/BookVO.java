package com.tjoeun.bookshop;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

//	VO(Value Object) 클래스: 1건의 데이터와 데이터를 처리하는 메소드를 모아놓은 클래스이다.
//	VO 클래스는 DTO(Data Transfer Object) 클래스라고도 한다.
//	bean: 처리할 데이터를 기억하는 변수와 그 변수의 데이터를 입출력 할 수 있는 getters & setters 메소드로만
//		구성된 클래스

//	사용자 정의 자료형
//	도서정보 1건을 기억하는 클래스

/**
 * @author tjoeun-jr-906-29
 *
 */
public class BookVO {

//	필드란? DB에서 칼럼, 속성, attribute 같은 개념
//	블록이란? 여러 데이터(여러 행)을 메모리가 허용하는 만큼 읽어들이는 단위

//	한 클래스 내에서 같은 이름일지라도 호출 순위는 (멤버변수 > 전역변수) 이다.

//	일반 변수를 선언하면 변수에는 쓰레기 값이 들어가지만
//	클래스에서 선언하는 필드는 별도로 초기화를 하지 않아도 숫자는 0 , 문자는 " ", boolean은 false, 클래스로 만드는 객체는 null로 자동초기화 된다.
//	클래스의 함수내에서 선언하는것과는 다름

//	일반적으로 클래스 내부에 변수를 생성할때는 값을 수정하지 못하게 하기위해 private으로 설정한다.

//	1. 데이터를 기억할 멤버 변수(필드)(열방향데이터) 생성

	private String title; // 도서명 => 필드(파란색, 전역변수)
	private String author;
	private String publisher;
	private Date writeDate;
	private int price;

//	생성자 메소드(이하 생성자)를 선언한다.
//	생성자 이름은 반드시 클래스 이름과 같아야 한다.
//	생성자를 선언하지 않으면 컴파일러가 자동으로 아무런 일도 하지않는 생성자(기본 생성자)를 만들어 주고
//	사용자가 생성자를 선언하면 기본 생성자를 자동으로 만들어주지 않는다.

//	생성자는 리턴타입을 사용하지 않고 생성자 내부에서 return도 사용하지 않는다.
//	생성자는 객체가 생성될 때 자동으로 실행되고 필드에 데이터 초기화를 목적으로 사용한다.

//	2. 생성자 생성
	
	/*
	public BookVO() {
		// 기본생성자
	}
	
	public BookVO(String title, String author, String publisher, String writeDate, int price) { // => 지역변수
		// TODO Auto-generated constructor stub
		this.title = title; // this가 붙은것은 멤버변수(필드)
		this.author = author;
		this.publisher = publisher;
		this.writeDate = writeDate;
		this.price = price;
	}
	*/
//	=> 생성자 오버로딩

//	tip. 자동생성하는법 우클릭->소스->필드를 이용해 생성
//	생성자를 1개라도 만들면 자바가 기본생성자를 만들지 않는다.
	public BookVO() {
		System.out.println("기본생성자가 실행됩니다.");
	}
public BookVO(String title, String author, String publisher, Date writeDate, int price) {
//	this();  //현재클래스의 기본 생성자 호출
//	super(); // 부모 클래스의 기본생성자, 오브젝트 클래스(최상위 클래스), 모든자바의 클래스는 오브젝트 클래스틑 상속받는다.
//	super와 this 는 반드시 생성자의 첫 문장으로 써야한다. 즉 동시에 사용할 수 없다.
//	super. 부모클래스
//	this. 현재 클래스
	this.title = title;
	this.author = author;
	this.publisher = publisher;
	this.price = price;
	this.writeDate = writeDate;
}






//@Override 어노테이션, 이 메소드가 부모클래스에서 상속받은 메소드를 @override한 메소드임을 식별한다. (오타방지 기능)


//	getter & setter 메소드를 선언ㄴ한다.
//	private 권한으로 설정된 필드를 클래스 외부에서 접근할 수 있도록 예외규정을 만든다.
//  우클릭 -> 소스 -> 게터&세터 설정
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
//	hashCode() 오버라이딩
//	저장된 필드값이 같으면 해시코드를 일치시켜준다

	@Override
	public int hashCode() {
		return Objects.hash(author, price, publisher, title, writeDate);
	}
// 객체의 필드에 저장된 실제 데이터끼리 비교할 수 있도록 만들어준다.	
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
		BookVO other = (BookVO) obj;
		return Objects.equals(author, other.author) && price == other.price
				&& Objects.equals(publisher, other.publisher) && Objects.equals(title, other.title)
				&& Objects.equals(writeDate, other.writeDate);
	}
	
	
}
