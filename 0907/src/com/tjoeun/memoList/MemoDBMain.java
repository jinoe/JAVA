package com.tjoeun.memoList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

import javax.imageio.stream.MemoryCacheImageInputStream;

public class MemoDBMain {

	public static void main(String[] args) {

		MemoService service = new MemoService();
		
		Scanner scanner = new Scanner(System.in);
		int menu;
		while (true) {
			while (true) {
				System.out.println("============================================");
				System.out.println(" 1.입력  2.목록보기  3.수정  4.삭제  5.종료 ");
				System.out.println("============================================");
				System.out.print("메뉴 입력: ");
				menu = scanner.nextInt();
				if (menu > 0 && menu <= 5)
					break;
				else
					System.out.println("메뉴는 1~5 사이로 입력해야 합니다.");
			}
			switch (menu) {
			case 1:
//				MemoService 클래스의 테이블에 저장할 데이터를 입력받아 DAO 클래스로 넘겨주는 메소드를 호출한다.
//				System.out.println("입력");
				service.insert();
				break;
			case 2:
				System.out.println("목록보기");
				break;
			case 3:
				System.out.println("수정");
				break;
			case 4:
				System.out.println("삭제");
				break;
			case 5:
				System.out.println("종료");
				break;
			}

		}

	}

}
