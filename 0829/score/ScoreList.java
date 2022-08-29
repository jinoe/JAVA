package com.tjoeun.score;

import java.util.ArrayList;

public class ScoreList {
	private ArrayList<ScoreVO> scorelist = new ArrayList<>();

	
	
	public ArrayList<ScoreVO> getScorelist() {
		return scorelist;
	}


	public void setScorelist(ArrayList<ScoreVO> scorelist) {
		this.scorelist = scorelist;
	}


	@Override
	public String toString() {
		
		for(int i=0; i<scorelist.size()-1;i++) {
			for(int j=i+1;j<scorelist.size();j++) {
				if(scorelist.get(i).getTotal()>scorelist.get(j).getTotal()) {
					scorelist.get(j).setRank(scorelist.get(j).getRank() + 1);
				} else if(scorelist.get(i).getTotal()<scorelist.get(j).getTotal()) {
					scorelist.get(i).setRank(scorelist.get(i).getRank() + 1);
				}
			}
		}
		String str ="";
		str += "번호 이름 java jsp spring 총점 평균 석차\n";
		int sum = 0;
		for(ScoreVO vo : scorelist) {
			str += vo + "\n";
		}
		return str;
	}


	public void addScore(ScoreVO score) {
		// TODO Auto-generated method stub
		scorelist.add(score);
	}
	
}
