package classtest;

public class GoodsStock {
    //속성 - 상품코드(P1010),재고수량(25)
	String code; //변수명은 무엇을 담을 것인지 알수 있게 지어야함.
	int stockNum;
	
	//생성자 마우스오른쪽 source - from superclass
	public GoodsStock() {
		// default 생성
		super();
	}	
	//마우스오른쪽 source - using
	public GoodsStock(String code, int stockNum) {
		super();
		this.code = code;
		this.stockNum = stockNum;
	}
	public GoodsStock(String code) {
		super();
		this.code = code;
	}




	//기능 - 재고추가, 재고감소
	//메소드(==함수) : 어떤 기능을 가지고 있음
	//리턴타입 메소드명(인자 ....){
	//   해야할 일 명시
	//}
	
	//리턴타입 : 데이터타입(byte,short, int, long, char, float, double, boolean) 모두 가능
	//      : 배열 타입 (byte[],short[],int[]...)
	//      : 클래스, 인터페이스
	//      : void - 가지고 갈 거 없음
	//      : 메소드가 일을 끝내고 돌아갈 때 가지고 가야할 데이터 타입
	// int method1(){} : method1 일을 끝내고 int 타입을 가지고 돌아갈거야
	
	//재고추가 : 재고수량을 입력받아서 현재 재고수량에 추가하기 / 현재 재고수량이 얼마인지 값을 보내기
	// 재고수량을 입력받아서 = int amount
	//현재 재고수량에 추가하기 = > stockNum+= amount
	int addStock(int amount) {//메소드 작성중에는 빨간줄이 생김
		stockNum += amount; // stockNum = stcoNum + amount
		return stockNum; //메소드 호출한 곳으로 값 보냄
	}
	
	
	
	//재고감소 : 재고수량을 입력받아서 현재 재고수량에서 감소하기 / 현재 재고수량 리턴
	int subtractStock(int amount) {
		stockNum -= amount;
		return stockNum;
	}
	
	
	
}
