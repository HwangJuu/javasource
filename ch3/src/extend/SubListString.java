 package extend;

public class SubListString extends ListString {
	String name = "성춘향";
	
	//오버라이딩
	@Override//@로 시작하는건 어노테이션이라고 함.-컴파일러에게 알려주기
	public void list() {
		super.list();
		System.out.println(name + " 하위 클래스");
	}
	
	public void writer() {
		System.out.println("상위 클래스 name : "+super.name);
		System.out.println("하위 클래스 name : "+this.name);
		this.list();
		super.list();
	}

}
