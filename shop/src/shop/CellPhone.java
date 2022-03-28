package shop;

public class CellPhone extends Product {
	
	//통신사
	private String carrier;
	

	public CellPhone(String name, int price, String carrier) {
		super(name, price);
		this.carrier = carrier;
		
	}

	@Override
	public void printExtra() {
		System.out.println("통신사 정보 : " + carrier);

	}

}
