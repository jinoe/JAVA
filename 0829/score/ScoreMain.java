package com.tjoeun.score;

public class ScoreMain {
	public static void main(String[] args) {
		
		/*
		ScoreVO score1 = new ScoreVO();
		ScoreVO score2 = new ScoreVO();
		
		score2.count = 100;
		System.out.println(score1.count);
		System.out.println(ScoreVO.count); // static 변수는 클래스간 공유되기 때문에 클래스.name 으로도 접근할수 있다.
		*/
		ScoreList scorelist = new ScoreList();
		
		ScoreVO score1 = new ScoreVO("홍길동",100,100,99);
		ScoreVO score2 = new ScoreVO("임꺽정",100,70,99);
		ScoreVO score3 = new ScoreVO("장길산",100,40,99);
		ScoreVO score4 = new ScoreVO("일지매",100,40,99);
		ScoreVO score5 = new ScoreVO("손오공",100,20,99);
		
		/*
		System.out.println(score1);
		System.out.println(score2);
		System.out.println(score3);
		*/
		scorelist.addScore(score1);
		scorelist.addScore(score2);
		scorelist.addScore(score3);
		scorelist.addScore(score4);
		scorelist.addScore(score5);
		System.out.println(scorelist);
	}
}
