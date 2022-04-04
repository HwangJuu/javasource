package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx3 { //프로그램에서 폴더 만들기
	//c에 새폴더 test 만들어 놓음
	public static void main(String[] args) {
		File temp = new File("c:\\test");
		File dir = new File("c:\\test\\dir");
		File file1 = new File("c:\\test\\file1.txt");
		File file2 = new File("c:\\test\\file2.txt");
		File file3 = new File(temp,"file3.txt");
		File file4 = new File(dir,"file4.txt");
		
		//디렉토리 생성
		if(!dir.exists()) {
			dir.mkdirs();
		}
		
		//파일 생성
			try {
				if(!file1.exists()) {
				file1.createNewFile();
				} 
				if(!file2.exists()) {
					file2.createNewFile();
				} 
				if(!file3.exists()) {
					file3.createNewFile();
				} 
				if(!file4.exists()) {
					file4.createNewFile();
				} 			
				
			}catch (IOException e) {
				e.printStackTrace();			
		}
			SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd a HH:mm");
			System.out.println("    날짜    시간    형태    크기    이름");
			System.out.println("------------------------------------------");
			
			File[] files =temp.listFiles();
			for(File f:files) {
				System.out.println(sdf.format(new Date(f.lastModified())));//(new Date(1647483401014))
				if(f.isDirectory()) {
					System.out.println("\t<DIR>\t\t\t"+f.getName());
				}else {
					System.out.println("\t\t\t"+f.length()+"\t"+f.getName());
				}
				System.out.println();
			}
	}

}
