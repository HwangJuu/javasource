package classtest;

public class Car {
	//속성(property, 필드, attribute) : 제조회사(현대),모델명(아우디), 색상,속도...
	String company; //제조회사
	String model; // 모델명
	String color; // 색상
	int maxSpeed; //속도
	
	//기능 : 전진한다. 후진한다
	void forward() {
		System.out.println("전진한다");
	}
	void backward() {
		System.out.println("후진한다");
	}
	

}
