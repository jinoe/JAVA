package com.tjoeun.shareAreaTest;

// 	Critical Area 임계영역에 접근권한을 가져가기위해 ready 변수 사용
//	CalaulatorThread 클래스와 PrintThread 클래스에서 공유 영역으로 사용할 클래스
public class ShareArea {
	
	double result;		// 0으로 자동초기화 연상결과를 기억할 변수 (공유변수)
	boolean ready;		// false로 자동 초기화, Calaualotr의 계산 완료 여부를 기억한다.
	
}
