package exam;

public class ColorTV extends TV {
	
	private int color;
	
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
		
	}

	public void printProperty() {
		System.out.print(super.getSize()+"인치");
		System.out.print(this.color+ "컬러");
		
	}

}
