package condition;

public class ForEx2 {
	public static void main(String[] args) {
		
		//for(int i=0; i<3;i--) 무한 루프 강제중지해야함.
		for(int i=0; i<3;i++) {
			System.out.println("Hi"); 
		}
		
		// 1~10 까지 출력
		for(int i=1; i<11;i++) {
//			System.out.println(i); //세로 출력
			System.out.print(i+" "); 
		}
		System.out.println();
		
		//10~1 출력
		for(int i=10; i>=1;i--) {
			System.out.print(i+ " ");
		}

	}

}
