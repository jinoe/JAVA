package com.tjoeun.textFileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileReadTest {
	public static void main(String[] args) {
		Scanner scanner = null;
		String filePath = "./src/com/tjoeun/textFileIO/in.txt";

		// 텍스트 파일에서 데이터를 입력받는 스캐너를 만드려면 읽어들이려는 텍스트 파일의 경로와
		// 이름으로 File 클래스 객체를 만들어 Scanner 생성자로 넘겨줘야한다.

//		File file = new File(filePath);		
//		Scanner scanner = new Scanner(file);

		try {
			scanner = new Scanner(new File(filePath)); // 익명 생성자 사용
			// 텍스트 파일에서 더이상 읽어들일 데이터가 없을때까지 반복하며 읽어들인다.

			while (scanner.hasNextLine()) { // hasNextLine() 메소드는 스캐너로 지정된 파일에서 읽어들일 데이터가 있으면 true 없으면 fasle를 리턴한다.
				String str = scanner.nextLine();
				if (str.length() != 0) {
					System.out.println(str);
				}
			}
		} catch (FileNotFoundException e) { // 파일이 생성되지 않을경우 예외처리 try ~ catch 사용

			e.printStackTrace();
			System.out.println("파일 없음"); 		
		} finally {
			if(scanner!=null) {
				scanner.close();					// 출력용도로 사용되는 PrintWriter 객체는 작업 완료 후 close() 를 해야하지만 스캐너로 읽어들일때는 close() 하지않아도 된다.
			}
		}
	}
}
