package extend;

public class CaptionTVEx1 {
	public static void main(String[] args) {
		CaptionTV ctv = new CaptionTV();
		
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println("현재채널 " +ctv.channel);
		ctv.display("Hello World");//false상태이기 때문에 출력되지 않음.
		ctv.caption = true;
		ctv.display("Hello World");
		
		CaptionTV2 ctv2 = new CaptionTV2("black",true,7,true);
		//직접 접근을 막음
		ctv2.setChannel(11);
		ctv2.channelUp();
		System.out.println("현재 채널 " + ctv2.getChannel());
		
		ctv2.channelUp();
		System.out.println("현재채널 "+ctv2.getChannel());
		

	}

}
