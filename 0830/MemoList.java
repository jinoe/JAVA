package com.tjoeun.memoList;

import java.util.ArrayList;

public class MemoList {
	ArrayList<MemoVO> memolist = new ArrayList<>();
	
	
	@Override
	public String toString() {
		String str = "";
		for(MemoVO memo:memolist) {
			str += memo + "\n";
		}
		
		return str;
	}


	public void addMemo(MemoVO memo) {
		memolist.add(memo);
	}
	public void deleteMemo(int idx) {
		memolist.remove(idx-1);
	}
}
