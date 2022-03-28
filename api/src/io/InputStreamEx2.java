package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx2 {//읽어오는 통로
	public static void main(String[] args) {
		// 입력 : 키보드
		InputStream in = System.in; // System.in; => 키보드		
		int input = 0;
		try {
			while((input = in.read()) != -1) {
				System.out.println((char)input); 
			}
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}
}
