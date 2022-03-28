package condition;
//for 문 중첩
public class ForEx7 {
	public static void main(String[] args) {
		
		//1. int i=1;
		//2. i<4;
		//3. 2번 for 블럭 문 실행
		//4. int j=1;
		//5. j<4;
		//6. 2번 for 블럭 안으로 진입 => * 출력
		//7. j++ 실행 (j=2)
		//8. j <4; => 참
		//9. * 출력 => ** 출력
		//10. j++ 실행 (j=3)
		//11. j<4 ; => 참
		//12. * 출력=> *** 출력
		//13. j++ 실행 (j=4)
		//14. j<4; => 거짓 2번 for문 종료
		//15. system.out.println();  
		
		//16. i++(i=2)
		//17. i<4;
		//18. 3~15 반복
		
		//19. i++ (i=3)
		//20. i<4;
		//21. 3~15 반복
		
		//22. i++ (i=4)
		//23. i<4; 거짓(전체 for 종료)ㅣ
	
		for(int i=1; i<4; i++) { //1번 for
			for(int j=1; j<4; j++) {//2번 for
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
