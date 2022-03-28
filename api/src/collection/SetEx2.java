package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {
	public static void main(String[] args) {
		//로또 번호 : 중복된 숫자 안됨. 
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0;set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		
		System.out.println(set);

		//정렬 한 후 화면 출력
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);//sort는 list 구조만 사용 가능 set입력시 오류
		System.out.println(list);
		
		
		
		
		
	}
}
