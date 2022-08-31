package com.tjoeun.memoList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

public class MemoMain {
	static MemoList memolist = new MemoList();

	public static void main(String[] args) {

		/*
		 * MemoVO memo1 = new MemoVO("홍길동", "1111", "1등입니다."); MemoVO memo2 = new
		 * MemoVO("홍길동", "1111", "2등입니다."); memolist.addMemo(memo1);
		 * memolist.addMemo(memo2); System.out.println(memolist);
		 * memolist.deleteMemo(2); System.out.println(memolist);
		 */

		Scanner scanner = new Scanner(System.in);
		int menu;
		while (true) {
			while (true) {
				System.out.println("===================================================================");
				System.out.println(" 1.입력  2.목록보기  3.수정  4.삭제  5.작성  6.파일가져오기  7.종료");
				System.out.println("===================================================================");
				System.out.print("메뉴 입력: ");
				menu = scanner.nextInt();
				if (menu > 0 && menu <= 7)
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
			case 3:
				update();
				break;
			case 4:
				delete();
				break;
			case 5:
				fileWrite(memolist);
				break;
			case 6:
				fileRead();
				break;
			case 7:
				System.exit(0);
				break;
			}
		
		}
		
		
	}

	private static void fileRead() {
		Scanner scanner = null;
		System.out.print("파일 이름을 적으세요: ");
		Scanner scan = new Scanner(System.in);
		String file = scan.nextLine().trim();
//		memolist.readFile(file, memolist);
		String filepath = "C:\\Users\\tjoeun-jr-906-29\\eclipse-workspace\\0831\\src\\com\\tjoeun\\memoList\\";
		filepath += file;
		try {
			scanner = new Scanner(new File(filepath));
			String str = "";
			while (scanner.hasNext()) {
//				str += scanner.next() + " ";
				int idx = scanner.nextInt();
				String name = scanner.next().replace("`", " ");
				String password = scanner.next();
				String memo = scanner.next().replace("`", " ");
				String temp = scanner.next().trim();
				
				String date[] = temp.split("[.]");		/* split은 "." 을 인식하지 않아서 [.] or \\. 을 해야된다. */
				int year = Integer.parseInt(temp.substring(0,4))-1900;
				int month = Integer.parseInt(temp.substring(5,7))-1;
				int day = Integer.parseInt(temp.substring(8,10));
				int hour = Integer.parseInt(temp.substring(11,13));
				int minute = Integer.parseInt(temp.substring(14,16));
				int second = Integer.parseInt(temp.substring(17));
				
				Date writeDate = new Date(year,month,day,hour,minute,second);
				
				MemoVO vo = new MemoVO(idx,name,password,memo,writeDate);
				
				memolist.addMemo(vo);
			}
			System.out.println("파일 읽기완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(file + ".txt 파일이 존재하지 않습니다.");
		}
	
	}

	private static void fileWrite(MemoList memolist) {
		System.out.print("파일 이름을 적으세요: ");
		Scanner scan = new Scanner(System.in);
		String file = scan.nextLine();
		file += ".txt";
		memolist.writeMemo(file);		
	}

	private static void update() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수정할 글 번호를 입력하세요: ");
		int n = scanner.nextInt();
		MemoVO memo = memolist.SelectMemo(n);
		scanner.nextLine();
		if (memo == null) {
			System.out.println("수정할 번호의 글이 존재하지 않습니다.");
		} else {
			System.out.println("수정할 글 확인");
			System.out.println(memo);
			System.out.print("비밀번호를 입력하세요: ");
			if (scanner.nextLine().trim().equals(memo.getPassword().trim())) {
				String str = scanner.nextLine();
				memolist.updateMemo(n, str);
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}
	}

	private static void delete() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("삭제할 글 번호를 입력하세요: ");
		int n = scanner.nextInt();
		MemoVO memo = memolist.SelectMemo(n);
		scanner.nextLine();

		if (memo == null) {
			System.out.println("삭제할 번호의 글이 존재하지 않습니다.");
		} else {
			System.out.println("삭제할 글 확인");
			System.out.println(memo);
			System.out.print("비밀번호를 입력하세요: ");
			if (scanner.nextLine().trim().equals(memo.getPassword().trim())) {
				memolist.deleteMemo(n);
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}

	}

	private static void insert() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 비밀번호 메모를 입력하세요: ");
		String str[] = scanner.nextLine().trim().split(" ");
		MemoVO memo = new MemoVO(str[0], str[1], str[2]);
		memolist.addMemo(memo);
	}
}
