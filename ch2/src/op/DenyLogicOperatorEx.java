package op;

// 논리형(1byte) : true, false
// 논리 부정 연산자 : !
public class DenyLogicOperatorEx {
	public static void main(String[] args) {
		boolean flag = true;
		System.out.println("flag = " + flag);

		
		flag = !flag;
		System.out.println("!flag = " + flag);
	}

}
