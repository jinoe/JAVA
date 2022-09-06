package com.mysql.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest {
	public static void main(String[] args) {

//		테이블에 저장할 데이터를 입력받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름: ");
		String name = scanner.nextLine();
		System.out.print("비밀번호: ");
		String password = scanner.nextLine();
		System.out.print("메모: ");
		String memo = scanner.nextLine();

//		데이터베이스 작업에 사용할 객체를 선언한다.
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;

//		mysql에 연결한다.
		conn = DBUtil.getMySQLConnection();
		if (conn != null) {
//			mysql이 연결되었으므로 데이터를 테이블에 저장한다.
//			sql 명령을 만든다.
//			문자열은 반드시 ( ' ' ) 작은 따옴표로 찍고 문장끝에 ";"을 입력하면 안된다.
			try {
				/*
				String sql = String.format("INSERT INTO MEMO (NAME,PASSWORD,MEMO) VALUES ('%s','%s','%s')", name, password, memo);
				System.out.println(sql);
//				sql 명령을 실행할 준비를 한다.
				stmt = conn.createStatement();
//				sql 명령을 실행한다.
//				excuteQuery(): 테이블에 저장된 데이터가 변경되지 않는 sql 명령을 실행한다. => select
//				excuteUpdate(): 테이블에 저장된 데이터가 변경되는 sql 명령을 실행한다. => update
				int result = stmt.executeUpdate(sql);
				System.out.println(result);
				*/
//				PreparedStatement를 사용햇 입력받은 데이터를 테이블에 저장한다.
//				변수에 저장된 데이터가 대입될 자리에 "?" 를 입력하고 나중에 "?"데이터를 대입한다.
//				문자열 데이터일 경우 Statement 처럼 작은 따옴표를 사용할 필요가 없다.
				String sql = "INSERT INTO MEMO (NAME,PASSWORD,MEMO) VALUES (?, ?, ?)";
//				sql 명령을 임시로 실행한다.
				pstmt = conn.prepareStatement(sql);
//				"?"에 데이터를 넣어준다. (1부터 시작)
				pstmt.setString(1, name);
				pstmt.setString(2, password);
				pstmt.setString(3, memo);
				int result = pstmt.executeUpdate();
				System.out.println(result);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("mysql에 연결실패");
		}

	}
}
