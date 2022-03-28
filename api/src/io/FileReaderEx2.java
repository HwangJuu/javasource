package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;

public class FileReaderEx2 {
	public static void main(String[] args) {
		//입력 : 파일, 출력 : 화면
		 //==InputStream : 모든거 다 읽을 수 있고 Reader는 문자만 읽을 수 있음
		try(Reader reader = new FileReader("c:\\test\\file1.txt",Charset.forName("ms949"));) {
			//Charset.forName("ms949") => 메모장 인코딩 utf-8로 설정되어 있어서 오히려 깨짐
			int ch;
			while((ch=reader.read())!=-1) {
				System.out.print((char)ch);
			}			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e1) {			
			e1.printStackTrace();
		}
		

	}
}
