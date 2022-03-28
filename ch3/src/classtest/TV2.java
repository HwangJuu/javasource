 package classtest;

//클래스 : 객체의 속성과 기능을 코드로 구현

public class TV2 {
	//속성 : 색상(black), 전원 상태(on/off), 채널....
	String color; //색상
	boolean power; //전원상태
	int channel;//채널 변경
	
	//생성자 - 괄호안에 기입해서 객체 생성안됨 =>TVEx
	// 인자를 받는 여러개의 생성자가 있음 = 생성자 오버로딩
	public TV2(String color) {
		this.color = color;		
	}
	
	public TV2(String color, boolean power) {
		this.color = color;
		this.power = power;
	}
	
	public TV2(String color, boolean power, int channel) {
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	
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
