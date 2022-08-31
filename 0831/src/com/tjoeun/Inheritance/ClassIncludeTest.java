package com.tjoeun.Inheritance;

import java.util.Calendar;

// 자바는 일반적으로 파일 1개에 1개의 클래스를 만들어 사용하지만 필요에 따라서 1개의 파일에 여러 개의 클래스를 만들어 사용할수 있다.
// 1개의 파일에 여러개의 클래스를 만들어도 컴파일된 "*.class" 파일은 bin 폴더에 각각 독립적으로 생성된다.
// public 타입은 파일이름과 같은 클래스에만 사용할 수 있다.

// 기본 생성자가 실행되면 현재 날짜로 필드를 초기화하고 년, 월, 일을 넘겨박는 생성자가 실행되면 넘겨받은 년, 월, 일로 필드를 초기화하는 클래스를 만든다.

class Date { // 날짜 클래스
	private int year;
	private int month;
	private int day;

	public Date() {
//		java.utiil.Date date = new java.util.Date();
//		this.year = date.getYear()+1900;
//		this.month = date.getMonth()+1;
//		this.day = date.getDate();

		Calendar calendar = Calendar.getInstance();
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH);
		day = calendar.get(Calendar.DATE);

	}

	public Date(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public String toString() {
		return String.format("%4d년 %02d월 %02d일", year, month, day);
	}

}

class Time {

	private int hour;
	private int minute;
	private int second;

	public Time() {
		// TODO Auto-generated constructor stub
		Calendar calendar = Calendar.getInstance();
		hour = calendar.get(Calendar.HOUR);
		minute = calendar.get(Calendar.MINUTE);
		second = calendar.get(Calendar.SECOND);
	}

	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	@Override
	public String toString() {
		return String.format("%02d시 %02d분 %02d초", hour, minute, second);
	}
}

// 자바는 다중상속을 지원하지 않는다 => 한클래스는 한개의 상속만
// 다중상속의 효과를 내기 위해서 클래스포함 또는 인터페이스를  사용한다.
// 클래스 포함이란 클래스의 필드로 다른클래스 객체를 선언해 사용하는 것을 말한다.

class Now {
	private Date date; // => 클래스 포함 (상속 받지 않았지만 두 클래스의 기능을 포함시켜서 사용할 수 있다)
	private Time time;

	public Now() {
		// 기본 생성자가 실행되면 현재 날짜와 시간으로 초기화 시킨다.
		date = new Date();
		time = new Time();
	}

//	날짜와 시간 데이터를 넘겨받아 초기화시키는 생성자

	public Now(Date date, Time time) {
		super();
		this.date = date;
		this.time = time;
	}

//	년, 월, 일, 시, 분, 초를 넘겨받아 초기화시키는 생성자

	public Now(int year, int month, int day, int hour, int minute, int second) {
		super();
		this.date = new Date(year, month, day);
		this.time = new Time(hour, minute, second);
	}

	@Override
	public String toString() {
		return "Now [date=" + date + ", time=" + time + "]";
	}

}

public class ClassIncludeTest {
	public static void main(String[] args) {
		Date date = new Date(2022, 03, 31);
		Date date2 = new Date();
		System.out.println(date);
		System.out.println(date2);
//		System.out.println(System.currentTimeMillis());

		Time time = new Time();
		System.out.println(time);

		Now now = new Now();
		System.err.println(now);

		Now now2 = new Now(date2, time);
		System.out.println(now2);
		
		Now now3 = new Now(2023, 3, 27,13,20,2);
		System.out.println();
	}
}
