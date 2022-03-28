package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();//기존에 가지고 있는 내용은 중복으로 출력이 안되지만, 새로 객체를 만든 경우는 중복 출력이 가능함.
		
		set.add(new Member("hong", "홍길동", "hong123"));
		set.add(new Member("kang", "강길동", "kang123"));
		set.add(new Member("park", "박길동", "park123"));
		set.add(new Member("kim", "김길동", "kimg123"));
		set.add(new Member("kim", "김길동", "kimg123"));
		
		System.out.println(set);
		
		
		

	}
}
