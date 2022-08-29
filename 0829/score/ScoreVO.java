package com.tjoeun.score;

//	학생 1명의 성적을 기억하는 클래스
public class ScoreVO {

	private int idx;
	private String name;
	private int java;
	private int jsp;
	private int spring;
	private int total;
	private double mean;
	private int rank = 1;

	// 인스턴스 필드는 객체간 서로 독립된 기억공간을 가진다.

	// 정적(static) 필드는 현재 클래스로 구성되는 모든 객체에서 공유하여 사용한다. (객체가 생성될때 최초 1번만 메모리에 생성됨)
	// static을 붙여서 선언한 변수나 메소드는 클래스 객체를 생성하지 않고 클래스이름에 "."을 찍어서 바로 접근할수 있다.
	// Garbage Collector가 관여 x , 모든 객체가 메모리를 공유
	static int count = 0;

	public ScoreVO() {
		this("무명", 0, 0, 0);
	}

	public ScoreVO(String name, int java, int jsp, int spring) { // 이름과 3과목 점수를 계산
		super();
		this.name = name;
		this.java = java;
		this.jsp = jsp;
		this.spring = spring;
		
		total = java + jsp + spring;
		mean = (double)(java+jsp+spring)/3;
		idx = ++count;
	}

	@Override
	public String toString() {
		return String.format("%3d %s %3d %3d %3d %3d %6.2f %3d", idx, name, java, jsp, spring, total, mean, rank);
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

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getJsp() {
		return jsp;
	}

	public void setJsp(int jsp) {
		this.jsp = jsp;
	}

	public int getSpring() {
		return spring;
	}

	public void setSpring(int spring) {
		this.spring = spring;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getMean() {
		return mean;
	}

	public void setMean(double mean) {
		this.mean = mean;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public static int getCount() {
		return count;
	}

}
