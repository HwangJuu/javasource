package op;

import java.util.Scanner;

public class Degrees {

	public static void main(String[] args) {
		// 화씨온도 => 섭씨 온도
		//화씨온도 입력 받은 후 섭씨 온도로 변환하기
		//섭씨온도 = (화씨온도 -32) * 5/9
		
		Scanner sc = new Scanner(System.in);
		System.out.println("화씨 온도 입력 : ");
		int fahr = sc.nextInt();
		
		
		// 5/9 => 몫 값 출력 
		// 5/9.0 => 소수값까지 출력 > double 사용
		double celsius = (fahr -32) * 5/9.0;
		System.out.println("변화된 섭씨 온도 : " + celsius);
		// format 지정 : %f(실수형), %d(정수형), %c(문자 - '홑따옴'), %s(문자열 - "쌍따옴")
		
		System.out.printf("변화된 섭씨 온도 : %.2f\n", celsius); // %.3f : 소수점 3자리까지, \n 엔터
		System.out.println("프로그램 종료");
		sc.close();

	}

}
