package com.tjoeun.textFileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileReadTest2 {
	public static void main(String[] args) {
		Scanner scanner = null;
		String filePath = "./src/com/tjoeun/textFileIO/input.txt";

		try {
			scanner = new Scanner(new File(filePath));
			while (scanner.hasNextLine()) {
				String str = scanner.nextLine();
				System.out.println(str + "\n");
				int i = 0;
				Boolean b = false;
				Double d = 0.0;
				String s = "";

//				String 변수에 저장된 문자열을읽어들이는 Scanner
				Scanner scan = new Scanner(str); // 스캐너 인수로 String 변수를 넘기면
				while (scan.hasNext()) { // hasNext() 메소드는 스캐너로 지정된 문자열에서 공백을 경계로 읽어드릴때 데이터가 있으면 true 어뵤으면 false를 리턴
					
					if(scan.hasNextInt()) i = scan.nextInt();
					else if(scan.hasNextBoolean()) b = scan.nextBoolean();
					else if(scan.hasNextDouble()) d = scan.nextDouble();
					else s = scan.next();
					
					System.out.println("i :" + i);
					System.out.println("b :" + b);
					System.out.println("d :" + d);
					System.out.println("s :" + s);
					System.out.println();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일을 찾을수 없습니다.");
		}
		
		// split(" ") 은 구분자가 한글자 일때만 사용할수있다 => String Tokenizer 클래스 이용
	}
}
