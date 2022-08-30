package com.tjoeun.memoList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
		Scanner scanner = null;
		String filepath = "C:\\Users\\tjoeun-jr-906-29\\eclipse-workspace\\0831\\src\\com\\tjoeun\\memoList\\";
		filepath += file;
		try {
			scanner = new Scanner(new File(filepath));
			String str = "";
			while (scanner.hasNext()) {
				str += scanner.next();
			}
			System.out.println(str);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void writeFile(String file) {
		String filepath = "C:\\Users\\tjoeun-jr-906-29\\eclipse-workspace\\0831\\src\\com\\tjoeun\\memoList\\";
		filepath += file;
		try {
			PrintWriter printWriter = new PrintWriter(filepath);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
			for (int i = 0; i < memolist.size(); i++) {
				MemoVO vo = memolist.get(i);
				String str = "";
				str += vo.getIdx() + " ";
				str += vo.getName() + " ";
				str += vo.getPassword() + " ";
				str += vo.getMemo().replace(" ", "`") + " ";
				str += sdf.format(vo.getWriteDate()) + " ";
//				System.out.println(str);
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
