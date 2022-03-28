 package classtest;

//클래스 : 객체의 속성과 기능을 코드로 구현

public class TV {
	//속성 : 색상(black), 전원 상태(on/off), 채널....
	String color; //색상
	boolean power; //전원상태
	int channel;//채널 변경
	
	//생성자를 명시하지 않으면 (생성자가 하나도 없어야함.)
	//컴파일러가 자동으로 default 생성자를 만들어줌
	
	
	
	//기능 : 전원 on/off, 채널 변경
	void power() {
		power =!power; // 현재 파워에 반대
	}
	void channelUp() {
		channel++;  //channel = channel + 1;
	}
	void channelDown() {
		channel--;
	}

}
