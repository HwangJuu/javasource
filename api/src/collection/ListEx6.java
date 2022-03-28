package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx6 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("사과");
		list.add("딸기");
		list.add("바나나");
		list.add("키위");
		list.add("포도");

		//list =>배열로 변경
		Object[] fruits= list.toArray();		
		for(Object obj:fruits) {
			System.out.println(obj);
		}		
		System.out.println();
		
		
		// 배열 => list 구조로 변경		
		String f[]= {"사과", "포도","멜론","수박","참외","자두","바나나"};
		List<String> list1 = Arrays.asList(f);
		System.out.println(list1);
		
//		list1.add("딸기"); //배열에서 넘어와서 예외(오류) 발생. 배열은 add 기능은 없음.
		
		//배열로부터 생성한 리스트의 변화가 필요할 때 
		List<String> list2 = new ArrayList<String>(Arrays.asList(f));
		list2.add("딸기");
		System.out.println(list2);
		
		
	}
}
