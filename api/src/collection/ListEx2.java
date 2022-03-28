package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {
	public static void main(String[] args) {
				
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("jsp");
		list.add("html");
		list.add("css");
		list.add("mybatis");
		
		//System.out.println(list); toString 형태, 확인하는 형태
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		//향상된 for문
		for(String s:list) {
			System.out.println(s);
		}

		
		
		
	}
}
