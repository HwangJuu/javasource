package exam;

public class IPTV extends ColorTV {
	
     private String ipaddress;
	
   
	public IPTV(int size, int color,String ipaddress) {
		super(size, color);
		this.ipaddress = ipaddress;
	}
	
	@Override
	public void printProperty() {
		System.out.print("나의 IPTV는 "+ ipaddress + "주소의");
		super.printProperty();
	}
		

	}
	
	


