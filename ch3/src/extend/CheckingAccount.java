package extend;

// Account + 체크카드

public class CheckingAccount extends Account {
	
	private String cardNo;//체크카드 번호	

	public CheckingAccount(String accountNo, String owner, int balance,String cardNo) {
		super(accountNo, owner, balance);	
		this.cardNo = cardNo;
	}
	
	//직불카드 사용액을 지불한다
	//매개인자로 직불카드번호와 사용액을 받아서 카드번호 일치 여부 및
	//은행 잔고(getBalance)와 비교한 후 인출
	
	
	int pay(String cardNo, int amount){
		if(!this.cardNo.equals(cardNo) || getBalance()< amount) {
			System.out.println("카드 번호 혹은 잔액 확인");
			return -1;
		}
		//지불 => 출금이랑 같은 개념(돈을 그만큼 빼는)
		//setBalance(getBalance()-amount); 부모가 이미 출금을 가지고 있어서 호출하면 됨.
//		int balance = withdraw(amount);
//		return balance;
		return withdraw(amount); // 위 두줄 축약 형태
		
		
		
		
	}
	

}
