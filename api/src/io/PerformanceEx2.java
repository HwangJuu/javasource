package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.BufferOverflowException;

public class PerformanceEx2 {
	public static void main(String[] args) {
		
		//FileInputStream+BufferedInputStream 사용시 input사용
		try(FileInputStream fis = new FileInputStream("c:\\test\\hold.mp4");
				BufferedInputStream bis = new BufferedInputStream(fis)) {
		
			long start = System.currentTimeMillis();
			while(bis.read()!=-1) {}
			long end = System.currentTimeMillis();
			
			System.out.println("FileInputStream + BufferedInputStream 사용시 "+ (end-start));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//FileInputStream + BufferedInputStream 사용시 out 사용시
		try(FileInputStream fis = new FileInputStream("c:\\test\\hold.mp4");
			BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("c:\\test\\hold_copy2.mp4");
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			
			int data;
			
			long start = System.currentTimeMillis();
			while((data=bis.read())!=-1) {
				bos.write(data);
			}
			long end = System.currentTimeMillis();
				
			System.out.println("FileInputStream + BufferedOutputStream "+ (end-start));
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//FileInputStream+BufferedInputStream 사용시 + byte 배열
			try(FileInputStream fis = new FileInputStream("c:\\test\\hold.mp4");
				BufferedInputStream bis = new BufferedInputStream(fis)) {
				
				byte data[] = new byte[4096];
				
				long start = System.currentTimeMillis();
				while(bis.read(data)!=-1) {}
				long end = System.currentTimeMillis();
					
				System.out.println("FileInputStream + BufferedInputStream + byte배열 사용시 "+ (end-start));
					
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
			
			
			//FileInputStream+BufferedInputStream 사용시 + byte 배열
			try(FileInputStream fis = new FileInputStream("c:\\test\\hold.mp4");
				BufferedInputStream bis = new BufferedInputStream(fis);
					FileOutputStream fos = new FileOutputStream("c:\\test\\hold_copy2.mp4");
					BufferedOutputStream bos = new BufferedOutputStream(fos)) {
				
				byte data[] = new byte[4096];
				
				long start = System.currentTimeMillis();
				while(bis.read(data)!=-1) {
					bos.write(data);
				}
				long end = System.currentTimeMillis();
					
				System.out.println("FileInputStream + BufferedOutputStream + byte배열 사용시 "+ (end-start));
					
			} catch (Exception e) {
				e.printStackTrace();
			}

	}
}
