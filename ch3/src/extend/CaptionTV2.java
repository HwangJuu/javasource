package extend;

public class CaptionTV2 extends TV2{
//	String color;
//	boolean power; 
//	int channel;
	
	//캡션 기능
	boolean caption;
	
//Implicit super constructor TV2() is undefined for default constructor.
//Must define an explicit constructor
//		
//	public CaptionTV2() {
//		super();//부모의 생성자를 호출하는 문구
//	         	//아무것도 값을 안주면 부모의 default 생성자가 호출
//	}
	
	public CaptionTV2(String color, boolean power, int channel,boolean caption) {
		super(color, power, channel);//부모의 인자를 받는 생성자 호출
		this.caption = caption;
	}
  
	
	void display(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
	
	
//	//기능 : 전원 on/off, 채널 변경
//	void power() {
//		power =!power; 
//	}
//	void channelUp() {
//		channel++;  
//	}
//	void channelDown() {
//		channel--;
//	}

}
