package poly;

public class ChildEx {
	public static void main(String[] args) {
		Child child = new Child();
		
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println();
		
		//왼쪽과 오른쪽이 서로 다름
		//서로 허용가능한 형태는 부모자식뿐
		//부모-자식관계(상속)
		//parent 변수가 접근 할 수 있는 범위는 부모클래스에 있는 필드와 
		//메소드만 접근 가능. 단, 오버라이딩 된 메소드가 있다면 자식 클래스의 메소드가 대신 호출됨.
		Parent parent = new Child();//왼쪽과 오른쪽이 서로 다르게 오고 허용가능한 상태는 다형성이라고 함.
		parent.method1(); //parent-method1()
		parent.method2(); //child-method2() 오버라이드 된 자식 메소드가 나옴. 이것때문에 다형성을 사용함.
		
//		Child c = (Child) new Parent();
//		c.method1(); java.lang.ClassCastException
		
		
//		Child2 child2 = new Child();Type mismatch: cannot convert from Child to Child2
		//왼쪽과 오른쪽이 다르게 오는건 할 수 없음.

	}

}
