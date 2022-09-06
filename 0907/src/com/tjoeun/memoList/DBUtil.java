package com.tjoeun.memoList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	public static Connection getMySQLConnection() {
		Connection conn = null; // 데이터베이스와 연결한다. (주로 conn 이름사용)
		try {

			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/memo?useUnicode=true&characterEncoding=UTF-8";
			conn = DriverManager.getConnection(url, "root", "0000");
			System.out.println("연결성공: " + conn);

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 클래스가 없거나 읽어올 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("데이터 베이스 접속 정보가 올바르지 않습니다.");
			e.printStackTrace();
		}
		return conn;
	}
}
