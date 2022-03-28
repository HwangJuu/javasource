package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {//읽어오는 통로
	public static void main(String[] args) {
		// 입력 : 키보드
//		InputStream in = System.in; // System.in; => 키보드
//		try {
//			int input = in.read(); //키보드에서 읽어와 => read() : 한바이트만 읽어옴 => 한글을 쓰면 깨질수밖에 없음
//			System.out.println((char)input); //abc 입력 input : 97, (char)input : a, 가나다 : ^e 한글은 최소 2바이트
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				in.close();
//			}catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		
		
		
		
		//try-with-resources 형태로 변경 : AutoClosable
		
		try(InputStream in = System.in) {
			int input = in.read();  //read() : 한 바이트만 읽어옴
			System.out.println((char)input);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
