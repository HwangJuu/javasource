package collection;

import java.util.HashSet;
import java.util.Set;

/* Set
 * 순서가 없음
 * 중복 허용 안함
 * 
 * HashSet, TreeSet 
 */
public class SetEx1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		//순서 없이 저장
		set.add("Java");
		set.add("Jsp");
		set.add("Jdk");
		set.add("Servlet");
		set.add("Oracle");
		set.add("Oracle"); //같은 문구는 한번만 출력 => 중복허용 안함
		
		System.out.println(set);

		
		
	}
}




