package condition;

public class IfEx6 {

	public static void main(String[] args) {
		// 주사위 프로그램
		
		// Math라는 클라스 안에 랜덤 숫자가 출력됨.
		// random() : 0.0 <= Math.random() <1.0
		//System.out.println(Math.random()); 

		int dice = (int)(Math.random()*6)+1;
		//System.out.println(dice); 1~6랜덤 출력
		
		if(dice ==1) {
			System.out.println("주사위 1번");
		}else if (dice ==2){
			System.out.println("주사위 2번");
		}else if (dice ==3){
			System.out.println("주사위 3번");
		}else if (dice ==4){
			System.out.println("주사위 4번");
		}else if (dice ==5){
			System.out.println("주사위 5번");
		}else {
			System.out.println("주사위 6번  ");
		}
	}

}
