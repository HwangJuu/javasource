   package classtest;

public class TVEx {

	public static void main(String[] args) {
		//(default 생성자를 호출하면서) 객체 생성
		TV tv = new TV();
		
		//초기화
		tv.color = "black"; 
		tv.channel= 3; //채널은 3번
		tv.power = false; //티비는 꺼진상태
		
		tv.power(); //전원켜기 void호출
		System.out.println("현재 전원 상태 " +tv.power);
		System.out.println("현재 채널" + tv.channel);
		tv.channelUp(); //채널 번호 증가
		System.out.println("현재 채널"+ tv.channel);

	}

}
