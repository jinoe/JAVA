package com.tjoeun.bookshop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class BookList {

//	도서 정보를 기억할 ArrayList를 만든다.
	private ArrayList<BookVO> booklist = new ArrayList<>();
	
//	생성자를 선언하지 않았으므로 자바 컴파일러가 아무런 일도 하지않는 기본 생성자를 만들어준다.
	
	
	public ArrayList<BookVO> getBooklist() {
		return booklist;
	}
	
	public void setBooklist(ArrayList<BookVO> booklist) {
		this.booklist = booklist;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("$ ##.000");
		
		String str = "";
		int sum = 0;
		str += "========================================================\n";
		
		for(int i=0;i<booklist.size();i++) {
			str += booklist.get(i) + "\n";
			sum += booklist.get(i).getPrice();
		}
		
//		for (BookVO book : booklist) {
//				str += book + "\n";
//				sum += book.getPrice();
//		}
		
		str += "=======================합계금액 : " + df.format(sum) + " =========\n";
		return str;
	}

	public void addBook(BookVO book) {
		booklist.add(book); // ArrayList 이므로 try~catch가 필요없다.
	}

}
