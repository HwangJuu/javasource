package condition;

/* 조건문
 * switch(변수){
 *     case 값1:
 *           수행할 문장;
 *           break;
 *     case 값2:
 *           수행할 문장;
 *           break;
 *     default:
 *           break;
 *           
 *     switch문은 break가 중요. 없다면 다 출력
 * 
 */
public class SwitchEx1 {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*6) +1;
		
		switch (num) {
			case 1:
				System.out.println("1번");
				break;
			case 2:
				System.out.println("2번");
				break;
			case 3:
				System.out.println("3번");
				break;
			case 4:
				System.out.println("4번");
				break;
			case 5:
				System.out.println("5번");
				break;
			default:
				System.out.println("6번");
				break;
		}
		
	}

}
