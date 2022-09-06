package com.tjoeun.memoList;

import java.text.SimpleDateFormat;
import java.util.Date;

//	메모 1건을 기억하는 클래스
//	 글 번호 => 자동증가
//	 작성자 이름
//	 비번
//	 게시글
//	 작성일 => 컴퓨터 시스템의 날짜와 시간으로 설정

public class MemoVO {
	
	private int idx;
	private String name;
	private String password;
	private String memo;
	private Date writeDate;
	
	public static int count =0;
	

	@Override
	public String toString() {
//		오늘 입력된 메모는 시간만 어제 입력된 메모는 날짜만 표시한다.
		SimpleDateFormat sdf = new SimpleDateFormat("HH.mm"); // 오늘
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd(E)"); // 어제이전
		
//		메모가 작성된 날짜가 오늘인가
		
		return String.format("%3d. %s(%s)님이 %s에 남긴글 \n %s", idx, name, password,sdf.format(writeDate),memo);
	}


	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	
}
