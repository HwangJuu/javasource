package classtest;

public class DataEx {
	public static void main(String[] args) {
		Data d = new Data();
		
		d.x = 10;
		System.out.println("main d.x = "+d.x);
		
		//change(d.x);
		change(d);
		System.out.println("change() 호출 후");
		System.out.println("main d.x = " +d.x);
		
		
		DataEx obj = new DataEx();
		obj.print();
	}
	
	
	static void change(int x) { //기본형 매개 변수(인자)
		x = 1000;
		System.out.println("change x = " +x);
	}

	static void change(Data obj) { //참조형 매개변수
		obj.x = 1000;
		System.out.println("change x = " +obj.x);
	}//값의 복사를 해서 하려면 기본형
	//메인이 가지고 데이터를 받아서 쓰고 복사하려면 참조형 
	void print() {} 
}
