package collection;

import java.util.ArrayList;
import java.util.List;

//자바에서 만들어진 부분을 불러다 쓸 예정.그래서 메인 체크!

/* List 인터페이스
 * - 순서가 있음(넣어주는 순서가 유지되어 출력)
 * - 데이터 중복 허용함 (앞에서 넣은 값을 또 넣을 수 있고 출력도 가능함)
 * - 구현 클래스 : ArrayList, Vector, LinkedList, Stack ....
 * - 배열과 개념은 동일(향상된 버전임)
 */
public class ListEx1 {
	public static void main(String[] args) {
	//List<E>  : E에 객체 적어주기
		//정수 : int (객체타입은아님) => Integer 객체타입사용
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(2);
		
		System.out.println(list);
		
		list.add(3, 11);//3번자리에 11번 넣어주세요.
		
		System.out.println(list);
		
		System.out.println();
		
		for(Integer i:list) {
			System.out.println(i);
		}
		
		
	}
}








