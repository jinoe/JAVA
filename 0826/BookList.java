package com.tjoeun.bookshop;

import java.text.DecimalFormat;
import java.util.Arrays;

import javax.swing.JOptionPane;

//	여러권의 책 정보(BookVO 클래스)를 기억하는 클래스
//	1. 필드선언 -> 2. 생성자 선언 -> 3. 게터&세터 선언 -> 4. toString() 메소드 Override
//	기본사이즈는 10이고 인자로 책의 갯수를 넘겨받으면 해당 갯수만큼 만드는 생성자

public class BookList {

//	1. 필드선언
	private BookVO[] booklist; // 여러권의 책 정보를 기억할 배열을 선언만 한다. 자동으로 null로 초기화
	private int size; // 배열의 크기
	private int index; // 배열의 인덱스, 배열의 저장된 데이터의 수

//	2. 생성자 선언
	public BookList() { // 기본생성자: ctrl + space
		this(10); // tip. 기본생성자를 바로 호출하면 짧게 줄일수 있다. (효율적인방법)
		/*
		 * this.size = 10; this.booklist = new BookVO[size];
		 */
	}

	public BookList(int size) { // 필드값을 이용하는 생성자 우클릭 -> 소스 -> 필드값을 이용한 생성자

		// super();
		this.size = size;
		this.booklist = new BookVO[size];

	}

//	3. 게터&세터
	public BookVO[] getBooklist() {
		return booklist;
	}

	public void setBooklist(BookVO[] booklist) {
		this.booklist = booklist;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

//	4. toString메소드 오버라이드 => 해당 오브젝트의 내용을 출력하기 위해서 (이 작업이 없으면 해쉬코드가 출력된다)
	@Override
	public String toString() {
//		return "BookList [booklist=" + Arrays.toString(booklist) + "]"; 자동생성 코드 수정

//		for (int i = 0; i < index; i++) {
//			if (booklist[i] != null) {
//				str += booklist[i] + "\n";
//			}
//		}
		
		DecimalFormat df = new DecimalFormat("$ ##.000");
		String str = "";
		int sum = 0;
		str += "========================================================\n";
		for (BookVO book : booklist) {
			if (book != null) {
				str += book + "\n";
				sum += book.getPrice();
			}
		}
		str += "=======================합계금액 : " + df.format(sum) + " =========\n";
//		str += Integer.toString(sum);
		
		
		return str;
	}

	public void addBook(BookVO book) {

		/*
		 * if(index<size) { // 전통적인 예외처리 => 배열의 인덱스는 배열의 크기보다 작아야한다. booklist[index++] =
		 * book; } else { //System.out.println("배열이 가둑차서 도서정보를 저장할수 없습니다.");
		 * JOptionPane.showMessageDialog(null, "배열이 가득차서 도서정보를 저장할수 없습니다."); }
		 */

//		자바의 예외(Exception) 처리 => try ~ catch ~finally(선택사항)
//		예외가 발생될것으로 예상되는 문장을 try블록에 코딩
//		지정된 예외가 발생하면 처리할 문장을 catch 블록에 코딩한다.
//		예외 발생 여부와 실행해야할 문장이 있다면 finally 문장에 코딩한다.
		try {
			booklist[index++] = book;
//			int a = 10/0;
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("배열이 가득차서 도서정보를 저장할수 없습니다.");
//			JOptionPane.showMessageDialog(null, "배열이 가득차서 도서정보를 저장할수 없습니다.");

		}

		catch (Exception e) { // 모든 예외처리는 Exception 클래스를 상속받아서 사용한다.(모든예외처리를 실행함)
								// 가장 상단에 쓰면 하위 오류처리들이 빨간줄 됨(중복오류처리) => 가장아래써야함
//			System.out.println("Exception 실행");
			System.out.println(e.getMessage());
//			=> Exception은 모든예외를 처리하므로 getMeassage() 을 사용하여 메세지 정보를 얻어온다.
		}

		finally {
			System.out.println("finally 실행");
		}
	}

}
