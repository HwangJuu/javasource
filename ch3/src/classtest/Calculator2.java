package classtest;
/*클래스 - 멤버변수, 메소드를 내부에서 사용 할때는 이름만 사용해서 작성
 * 
 * 
 */

public class Calculator2 {
	int plus(int x, int y) {
		return x+y;
	}
	
	double avg(int x, int y) {
		//int sum = plus(x,y);// 17/2 = 8,결과값 = 8.0
		double sum = plus(x,y);// 17.0, 결과값 = 8.5 
		
		return sum/2; // 17/2 sum은 int 타입 => 8로 나옴 double 형태로 바꿨기 때문에  8.0으로 나옴
		//return sum/2; // 17/2 sum은 int 타입 => 8로 나옴 double 형태로 바꿨기 때문에  8.0으로 나옴
	}
	
	void execute() {
		double result = avg(7,10);
		println("실행 결과 = " + result);
	}
	void println(String message) {
		System.out.println(message);
	}

}
