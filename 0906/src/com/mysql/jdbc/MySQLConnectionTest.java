package com.mysql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectionTest {
	public static void main(String[] args) {
		
//		JDBC(Java Data Base Connection)는 자바를 이용해서 데이터베이스에 연결하는 기술
//		데이터베이스 작업에 사용할 객체를 선언한다.
//		Connection 인터페이스 사용
		Connection conn = null;		// 데이터베이스와 연결한다. (주로 conn 이름사용)
		
		Statement stmt = null;		// 정적 쿼리를 실행한다. => 쿼리에 변수가 사용되지 않는 경우 => 간단한 쿼리
		PreparedStatement pstmt = null;		// 동적 쿼리를 실행한다. => 쿼리에 변수가 사용되는 쿼리 => 복잡한 쿼리
		ResultSet rs = null;		// SELECT 쿼리의 실행 결과를 저장한다.
		
		try {
//			1.MySQL 드라이버 클래스를 읽어온다.
//				Class.forName("드라이버 클래스 이름");
//				BuildPath->configure BuildPath -> 라이브러리 탭에서 외부 라이브러리(jar) 추가
//				Class.forName("com.mysql.cj.jdbc.Driver"); mysql 8.x 사용자

			Class.forName("com.mysql.jdbc.Driver");
			
//			2. MySQL 드라이버에 연결한다.
//			DriverManager 클래스의 getConnection(url, user, password) 메소드로 데이터베이스에 연결한다.
//			url: 사용할 MySQL이 설치된 경로와 데이터베이스 이름을 적는다.
//			String url = "jdbc:mysql://localhost:3306/memo?serverTimezone=UTC"; mysql 8.x 사용자
//			localhost는 MySQL이 설치된 컴퓨터가 현재 사용중인 컴퓨터임을 의미하며 localhost 대신 127.0.0.1을 사용해도 된다.
//			3306은 MySQL이 이 컴퓨터와 통신할 때 사용하는 포트번호를 의미한다. => 오라클은 1521을 사용한다.
			String url = "jdbc:mysql://localhost:3306/memo";
			conn = DriverManager.getConnection(url, "root", "0000");
			
//			변경되는 부분을 코딩한다.
			System.out.println("연결성공: "+conn);
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 클래스가 없거나 읽어올 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("데이터 베이스 접속 정보가 올바르지 않습니다.");
			e.printStackTrace();
		} finally {
//			데이터베이스 작업이 완료되면 사용한 모든 객체를 담는다.
			if(conn != null) { try { conn.close();} catch (SQLException e) { e.printStackTrace();}}
			if(stmt != null) { try { stmt.close();} catch (SQLException e) { e.printStackTrace();}}
			if(pstmt != null) { try { pstmt.close();} catch (SQLException e) { e.printStackTrace();}}
			if(rs != null) { try { rs.close();} catch (SQLException e) { e.printStackTrace();}}
		}
		
		
		
		
	}
}
