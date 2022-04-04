package api;

//Object 메소드
//equals() : String 문자열 비교시 == 대신에
//         : 부모는 주소 비교의 형태로 정의가 되어 있음
//String 클래스에서는 오버라이딩을 통해 문자열 비교의 형태로 사용
//         : 부모가 넘길 땐 주소 비교, 자식에선 재정의해서 값비교
//         : 오버라이딩
public class ObjectEx1 {
	public static void main(String[] args) {
		
		//객체 생성 : default 생성자 호출
		Object obj1 = new Object(); //heap에 새로운 주소에 생성
		Object obj2 = new Object();
		
		//메소드 호출
		//equals() : String 문자열 비교시 == 대신에
		if(obj1.equals(obj2)) { 
			//부모가 넘겨줄 땐 주소 비교(heap에 있는)
			//자식이 받을 땐 값을 비교함.
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		if(obj1 == obj2) {//주소비교
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		
		//java.lang.Object@7d6f77cc
		System.out.println("obj1.toString() " +obj1.toString());
		//java.lang.Object@5aaa6d82
		System.out.println("obj2.toString() " +obj2.toString());
		
		//toString 오버라이딩으로 많이 사용됨
		
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		
		System.out.println(value1.equals(value2)?"같다":"다르다"); //오버라이딩, 재정의함.
		
		//api.Value@6f75e721
		System.out.println(value1.toString());
		System.out.println(value1);

	}

}
