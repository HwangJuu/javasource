package extend;

public class BonusPointAccountEx {

	public static void main(String[] args) {
		// BonusPointAccount 객체 생성
		BonusPointAccount account1 = new BonusPointAccount("111-11","홍길동", 100000, 0);
		
		
		//예금
		account1.deposit(200000);//예금하면서 포인트 적립
		//보너스 포인트 출력
		System.out.println("현재 보너스 포인트 : "+account1.getBonusPoint());
		System.out.println("현재잔액 : "+account1.getBalance());
	}

}
