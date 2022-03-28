package classtest;

public class TVEx2 {
	public static void main(String[] args) {
		
//()괄호 안에 아무것도 없으면(default 생성자를 이용해서) 객체 생성
//TV2 tv = new TV2(); // The constructor TV2() is undefined=> 생성자가 정의되지 않았다.
//TV2.java에 public TV2(String color, boolean power, int channel) 괄호 안에 작성되어 있기 때문에
// default 생성자가 없음.
		
		//생성자는 여러개 만들수 있고 초기화하는 작업이다! 필수 암기
		TV2 tv = new TV2("white", false, 3);
		

	}

}
