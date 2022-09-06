package com.tjoeun.memoList;

import java.util.Scanner;

// 데이터를 테이블에 저장, 테이블에 저장된 데이터의 수정, 삭제, 및 조회
public class MemoService {
	public void insert() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름: ");
		String name = scanner.nextLine();
		System.out.print("비밀번호: ");
		String password = scanner.nextLine();
		System.out.print("메모: ");
		String memo = scanner.nextLine();
		
		MemoVO vo = new MemoVO();
		vo.setName(name);
		vo.setPassword(password);
		vo.setMemo(memo);
		
//		입력받은 데이터를 저장하는 DAO 클래스의 메소드를 호출한다.
		boolean result = MemoDAO.insert(vo);
		
//		후처리
		if(result) {
			System.out.println(name + "님 글 저장완료");
		} else {
			System.out.println("저장실패!!");
		}
		
	}
}
