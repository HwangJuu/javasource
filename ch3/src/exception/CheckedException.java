package exception;

public class CheckedException {
	public static void main(String[] args) {
		
		//CheckedException 컴파일러가 알려줌
		try {
			Class.forName(null);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
