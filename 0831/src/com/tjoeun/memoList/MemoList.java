package com.tjoeun.memoList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MemoList {
	ArrayList<MemoVO> memolist = new ArrayList<>();

	@Override
	public String toString() {
		String str = "";

		if (memolist.size() == 0) { // 저장된 메모가 있으면 마지막에 입력한 글 부터 출력
			System.out.println("저장된 메모가 없습니다.");
		} else {
			for (int i = memolist.size() - 1; i >= 0; i--) {
				str += memolist.get(i) + "\n";
			}
		}
		return str;
	}

	public void addMemo(MemoVO memo) {
		memolist.add(memo);
	}

	public void deleteMemo(int n) {
		memolist.remove(n - 1); // 글 삭제후 인덱스가 변경됨. => 글 삭제후 글번호를 재정렬 해야함 (DB 대신 ArrayList를 쓰기때문에 발생하는현상),
								// ArrayList는 삽입삭제하면 index가 앞뒤로 밀린다.
		for (int i = 0; i < memolist.size(); i++) {
			memolist.get(i).setIdx(i + 1);
		}
		MemoVO.count = memolist.size();
	}

	public void updateMemo(int idx, String memo) {
		memolist.get(idx - 1).setMemo(memo);
	}

	public MemoVO SelectMemo(int idx) {

		try {
			return memolist.get(idx - 1);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}

	public void readFile(String file) {
//		Scanner scanner = null;
//		String filepath = "C:\\Users\\tjoeun-jr-906-29\\eclipse-workspace\\0831\\src\\com\\tjoeun\\memoList\\";
//		filepath += file;
//		try {
//			scanner = new Scanner(new File(filepath));
//			String str = "";
//			while (scanner.hasNext()) {
////				str += scanner.next() + " ";
//				int idx = scanner.nextInt();
//				String name = scanner.next().replace("`", " ");
//				String password = scanner.next();
//				String memo = scanner.next().replace("`", " ");
//				String temp = scanner.next().trim();
//				
//				String date[] = temp.split("[.]");		/* split은 "." 을 인식하지 않아서 [.] or \\. 을 해야된다. */
//				int year = Integer.parseInt(temp.substring(0,4))-1900;
//				int month = Integer.parseInt(temp.substring(5,7))-1;
//				int day = Integer.parseInt(temp.substring(8,10));
//				int hour = Integer.parseInt(temp.substring(11,13));
//				int minute = Integer.parseInt(temp.substring(14,16));
//				int second = Integer.parseInt(temp.substring(17));
//				
//				Date writeDate = new Date(year,month,day,hour,minute,second);
//				
//				MemoVO vo = new MemoVO();
//				vo.setIdx(idx);
//				vo.setName(name);
//				vo.setPassword(password);
//				vo.setMemo(memo);
//				vo.setWriteDate(writeDate);
//				
//				memolist.addMemo(vo);
//			}
//			System.out.println("파일 읽기완료");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
////			e.printStackTrace();
//			System.out.println(file + ".txt 파일이 존재하지 않습니다.");
//		}
	}

	public void writeMemo(String file) {
		String filepath = "C:\\Users\\tjoeun-jr-906-29\\eclipse-workspace\\0831\\src\\com\\tjoeun\\memoList\\";
		filepath += file;
		try {
			PrintWriter printWriter = new PrintWriter(filepath);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
			
			/*
			for (int i = 0; i < memolist.size(); i++) {
				MemoVO vo = memolist.get(i);
//				String str = "";
//				str += vo.getIdx() + " ";
//				str += vo.getName() + " ";
//				str += vo.getPassword() + " ";
//				str += vo.getMemo().replace(" ", "`") + " ";
//				str += sdf.format(vo.getWriteDate()) + " ";
////				System.out.println(str);
				
				String str = String.format("%d %s %s %s %s", vo.getIdx(), vo.getName(), vo.getPassword(), vo.getMemo().replace(" ", "`"), sdf.format(vo.getWriteDate()));
				printWriter.write(str);
				printWriter.close();
				*/
			// 향상된 for 이용
			for(MemoVO vo:memolist) {
				String str = String.format("%d %s %s %s %s\n", vo.getIdx(), vo.getName(), vo.getPassword(), vo.getMemo().replace(" ", "`"), sdf.format(vo.getWriteDate()));
				printWriter.write(str);
				printWriter.close();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<MemoVO> getMemolist() {
		return memolist;
	}

	public void setMemolist(ArrayList<MemoVO> memolist) {
		this.memolist = memolist;
	}

	public void updateMemo(int n, MemoVO memo) {

	}

}
