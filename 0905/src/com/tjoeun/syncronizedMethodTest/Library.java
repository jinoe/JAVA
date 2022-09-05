package com.tjoeun.syncronizedMethodTest;

import java.util.ArrayList;

public class Library {
	ArrayList<String> booklist = new ArrayList<>();
	
	public Library() {
		booklist.add("다빈치 코드");
		booklist.add("천사와 악마");
		booklist.add("디지털 포트리스");
		booklist.add("라스트 심볼");
		booklist.add("타나토노트");
		booklist.add("개미");
	}
	
	public String lenBook() {
		if(booklist.size()==0) {
			try {
				System.out.println();
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
}
