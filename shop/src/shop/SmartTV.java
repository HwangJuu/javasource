package shop;

public class SmartTV extends Product {
	
	//해상도
	private String resolution;

	public SmartTV(String name, int price,String resolution) {
		super(name, price);
		this.resolution = resolution;
		
	}

	@Override
	public void printExtra() {
		System.out.println("해상도 정보 : " +resolution);

	}

}
