package com.tjoeun.textFileIO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFileWriteTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PrintWriter printWriter = null;

		// 파일의 경로와 이름을 설정한다.
		// 경로 지정방식은 절대경로 지정방식과 상대경로 지정방식이 있다.
		// 절대경로는 작업중이 파일이 위치한 디스크 드라이브의 최상위(root) 폴더(디렉토리)부터
		// 파일이 위치한 폴더까지의 경로를 의미한다.
		// 상대경로는 일반적으로 파일이 있는 폴더부터 시작한다.
		// 자바의 상대경로는 작업중인 파일이 포함된 프로젝트이름의 폴더부터 시작한다. (".")

		// 절대경로
//		String filePath = "C:\\Users\\tjoeun-jr-906-29\\eclipse-workspace\\0830\\src\\com\\tjoeun\\textFileIO\\out.txt";

		// 상대경로
//		String filePath = ".\\src\\com\\tjoeun\\textFileIO\\out.txt";
		String filePath = "./src/com/tjoeun/textFileIO/out.txt";

		// 경로 지정시 경로와 경로 경로와 파일을 구분하는 "\" 가 에러가 발생하면 "\\" 나 "/" 로 변경한다.
		try {
			printWriter = new PrintWriter(filePath);

			// QUIT가 입력될때까지 반복하며 키보드로 입력한 데이터를 파일에 저장한다.
			while (true) {
				System.out.print(">>>");
				String str = scanner.nextLine().trim();

				if (str.toUpperCase().equals("QUIT"))
					break;
				if (str.length() != 0) {
					printWriter.write(str + "\n");		// 만약 줄이변경되서 보이지 않는다면 "\r\n"
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("디스크에 파일이 존재하지 않습니다.");
		} finally {
			if(printWriter!= null) {
				printWriter.close(); 					// 출력 파일은 출력 작업이 완료되면 반드시 파일을 닫아야 정상적으로 파일이 생성된다.
			}
		}
	}
}
