package com.tjoeun.memoList;

import java.util.Scanner;

public class MemoMain {
	static MemoList memolist = new MemoList();
	
	public static void main(String[] args) {
		
		/*
		MemoVO memo1 = new MemoVO("홍길동", "1111", "1등입니다.");
		MemoVO memo2 = new MemoVO("홍길동", "1111", "2등입니다.");
		memolist.addMemo(memo1);
		memolist.addMemo(memo2);
		System.out.println(memolist);
		memolist.deleteMemo(2);
		System.out.println(memolist);
		*/
		
		Scanner scanner = new Scanner(System.in);
		int menu;
		while (true) {
			while (true) {
				System.out.println("===========================================");
				System.out.println(" 1.입력  2.목록보기  3.수정  4.삭제  5.종료");
				System.out.println("===========================================");
				System.out.print("메뉴 입력: ");
				menu = scanner.nextInt();
				if (menu > 0 && menu <= 5)
					break;
				else
					System.out.println("메뉴는 1~5 사이로 입력해야 합니다.");
			}
			switch (menu) {
			case 1:
				insert();
				break;
			case 2:
				System.out.println(memolist);
				break;
			case 4:
				System.out.print("삭제할 글 번호를 입력하세요");
				memolist.deleteMemo(scanner.nextInt());
				break;
			case 5:
				System.exit(0);
			}

		}
	}

	private static void insert() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
//		MemoList memolist = new MemoList();
		System.out.print("이름 비밀번호 메모를 입력하세요: ");
		String str[] = scanner.nextLine().trim().split(" ");
		MemoVO memo = new MemoVO(str[0], str[1], str[2]);
		memolist.addMemo(memo);
	}
}
