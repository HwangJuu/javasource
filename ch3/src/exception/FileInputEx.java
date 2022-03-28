package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * try{} : 단독 사용 불가
 * try{}catch(){}
 * try{}finally{}
 * try{}catch(){}finally{}
 */

public class FileInputEx {
	public static void main(String[] args) {
//		FileInputStream fis = null;
//		try {
//		 fis = new FileInputStream("file.txt");
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		} finally { //자원해제
//			try {
//				fis.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		//자동 리소스 닫기 => finally를 안쓰기 위한 구문
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
