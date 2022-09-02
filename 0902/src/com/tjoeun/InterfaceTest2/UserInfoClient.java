package com.tjoeun.InterfaceTest2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
	public static void main(String[] args) {

		String dbtype = "";

//		FileInputStream 클래스는 파일에서 바이트 단위로 데이터를 읽어온다.

		FileInputStream fis = null;

		String filepath = "./src/com/tjoeun/InterfaceTest2/db.properties";
		// "." : 현재 프로젝트 폴더

//		FileInputStream 클래스  생성자의 인수로 읽을 파일의 이름만 넘겨주면 프로젝트 이름의
//		폴더(0902)에서 파일을 읽어온다.
//		자바만 프로젝트명부터 시작, 다른 언어는 현재 작업중인폴더를 의미

//		read() 메소드는 FileInputStream 클래스 객체에서 1바이트의 데이터를 읽어온다.
//		read() 메소드는 코드값으로 읽어오기 때문에 문자로 출력하려면 형변환이 필요하다.
//		2진 코드 (D = 68) 로읽어오므로 char() 타입캐스팅
//		read() 는 읽어들일 데이터가 없으면 -1 을 리턴한다.
		
		try {
			fis = new FileInputStream(filepath);
			
/*			System.out.println("디스크에 파일에 존재합니다.");
			int ch;
			while ((ch = fis.read()) != -1) {
				if (ch == -1)
					break;
				System.out.print((char) ch);
			}
			fis.close();
*/
//			Properties 클래스는 FileInputStream 객체로 읽어들인 properties 파일의 데이터를 읽어온다.
//			load() 메소드는 FileInputStream 객체로 읽어들인 프로퍼티 파일을 읽어온다.

			Properties properties = new Properties();
			properties.load(fis);
			dbtype = properties.getProperty("DBTYPE");
			System.out.println(dbtype);
		} catch (FileNotFoundException e) {
			System.out.println("디크스에 파일이 존재하지 않습니다");

		}
		// ctrl + t 하면 IOException이 FileNotFound의 부모클래스인것을 확인할 수 있음.
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		UserInfoVO vo = new UserInfoVO();
		vo.setUserId("qwer");
		vo.setUserName("홍길동");
		vo.setUserPassword("12345");
		System.out.println(vo);
		
		UserInfoDAO dao = null;
		if (dbtype.equals("MYSQL")) {
			dao = new UserInfoMySqlDAO();
		} else if (dbtype.equals("ORACLE")){
			dao = new UserInfoORACLE();
		} else {
			System.out.println(dbtype + "은 지원되지 않는 데이터 베이스 입니다.");
		}
		dao.insertUserInfo(vo);
		dao.updateUserInfo(vo);
		dao.deleteUserInfo(vo);
		
	}
}
