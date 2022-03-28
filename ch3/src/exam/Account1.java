 package exam;

public class Account1 {
	//잔고(balance)필드
	//잔고 필드는 음수값이 될 수 없고, 최대 백만원까지만 저장 가능
	//외부에서 balance 필드를 마음대로 변경하지 못하고, 0<= balance <= 1,000,000범위의 값만 가질 수 있다
	
	//setter,getter 작성
    //0,1,000,000 은 MIN_BALANCE와 MAX_BALANCE 상수로 선언
	//setter의 매개값이 음수이거나 백만원을 초과하면 현재 balance 값 유지
	
	private int balance;
	
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <=MAX_BALANCE) {
			this.balance = balance;
		}
		
	}

	
	
			

}
