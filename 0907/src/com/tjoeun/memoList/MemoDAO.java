package com.tjoeun.memoList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

//	MemoService클래스에서 전처리 작업이 완료되서 넘어온 데이터로 sql 명령을 실행
//	데이터만 받고 DB에 저장만 하는기능
public class MemoDAO {

//	MemoVO 객체에 저장된 데이터를 DB에 적재하는 메소드
	public static boolean insert(MemoVO vo) {
		boolean result = true;
		Connection conn = null;
		PreparedStatement pstmt = null;
		conn = DBUtil.getMySQLConnection();
		if (conn != null) {
			String sql = "INSERT INTO MEMO (NAME,PASSWORD,MEMO) VALUES (?, ?, ?)";
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, vo.getName());
				pstmt.setString(2, vo.getPassword());
				pstmt.setString(3, vo.getMemo());
				pstmt.executeUpdate();
//				if (result == 1) {
//					System.out.println("저장 성공");
//					return true;
//				} else {
//					System.out.println("저장 실패");
//					return false;
//				}
			} catch (SQLException e) {
				e.printStackTrace();
				result = false;
			}

		} else {
			System.out.println("mysql에 연결실패");
			result = false;
		}
		return result;
	}

}
