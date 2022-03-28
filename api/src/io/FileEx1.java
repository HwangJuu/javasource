package io;

import java.io.File;
import java.io.IOException;

public class FileEx1 {
	public static void main(String[] args) throws IOException {
		//파일 객체 생성		
		File f1 = new File("c:\\temp\\test1.txt");//경로 포함
		File f2 = new File("c:\\temp","test1.txt");
		File dir = new File("c:\\tmep");
		File f3 = new File(dir,"test1.txt");
		
		//파일명
		String fileName = f1.getName();//파일명만 가지고옴
		System.out.println("경로는 제외한 파일명 : "+fileName);//test1.txt
		
		//확장자를 제외한 파일명
		int pos = fileName.lastIndexOf(".");//indexof 위치, 번호를 의미
		System.out.println("확장자를 제외한 파일명 : "+fileName.substring(0, pos));
		System.out.println("확장자 : "+fileName.substring(pos+1));
		
		System.out.println();
		
		//경로를 포함한 파일명
		System.out.println("경로를 포함한 파일명 : " +f1.getPath());
		System.out.println("파일의 절대경로 : " +f1.getAbsolutePath());
		System.out.println("파일의 정규경로 : " +f1.getCanonicalPath());
		System.out.println("파일이 속해 있는 부모경로 : " +f1.getParent());
		
		System.out.println();
		System.out.println("File.pathSeparator - "+File.pathSeparator); //;
		System.out.println("File.pathSeparator - "+File.pathSeparatorChar);//;
		System.out.println("File.separator - "+File.separator); // \
		System.out.println("File.separatorChar - "+File.separatorChar);// \

	}
}
